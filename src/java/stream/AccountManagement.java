package stream;

import stream.exception.NotEnoughMoneyException;
import stream.exception.UnknownAccountException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AccountManagement implements AccountService {
    static final String NotEnoughMoneyException = "Не хватает денег на счете";
    static final String UnknownAccountException = "Аккаунт с таким id отсутствует";
    static final String fileName = "accounts.txt";
    static final String path = "src/resources/" + fileName;
    private final File file;

    public AccountManagement() {
        this.file = new File(path);
        init();
    }

    private void write(Account account) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(account.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void rewrite(Account... accounts) {
        Map<Integer, String> data = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                data.put(index, line);
                index++;
            }

            for (Account account : accounts) {
                data.put(account.getId(), account.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String value : data.values()) {
                stringBuilder.append(value).append("\n");
            }
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Account read(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(id + " ")) {
                    String[] data = line.split(" ");
                    return new Account(
                            Integer.parseInt(data[0]),
                            data[1],
                            Integer.parseInt(data[2])
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void init() {
        try {
            if (file.createNewFile()) {
                for (int i = 0; i < 10; i++) {
                    write(new Account(i, "user_" + i, 0));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void withdraw(int accountId, int amount) throws UnknownAccountException, NotEnoughMoneyException {
        Account account = read(accountId);
        if (account == null) {
            throw new UnknownAccountException(UnknownAccountException);
        }
        if (account.getAmount() < amount) {
            throw new NotEnoughMoneyException(NotEnoughMoneyException);
        }
        account.withdraw(amount);
        rewrite(account);
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        Account account = read(accountId);
        if (account == null) {
            throw new UnknownAccountException(UnknownAccountException);
        }
        System.out.println(account.toString());
    }

    @Override
    public void deposit(int accountId, int amount) throws UnknownAccountException {
        Account account = read(accountId);
        if (account == null) {
            throw new UnknownAccountException(UnknownAccountException);
        }
        account.put(amount);
        rewrite(account);
    }

    @Override
    public void transfer(int from, int to, int amount) throws UnknownAccountException, NotEnoughMoneyException {
        Account accountFrom = read(from);
        Account accountTo = read(to);
        if (accountFrom == null || accountTo == null) {
            throw new UnknownAccountException(UnknownAccountException);
        }
        if (accountFrom.getAmount() < amount) {
            throw new NotEnoughMoneyException(NotEnoughMoneyException);
        }
        accountFrom.transferTo(accountTo, amount);
        rewrite(accountFrom);
    }

    public void manage(String operation) {
        String[] info = operation.split(" ");
        try {
            switch (info[0]) {
                case "balance":
                    try {
                        balance(Integer.parseInt(info[1]));
                    } catch (UnknownAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case "withdraw":
                    try {
                        withdraw(Integer.parseInt(info[1]), Integer.parseInt(info[2]));
                    } catch (UnknownAccountException | NotEnoughMoneyException e) {
                        e.printStackTrace();
                    }
                    break;
                case "deposite":
                    try {
                        deposit(Integer.parseInt(info[1]), Integer.parseInt(info[2]));
                    } catch (UnknownAccountException e) {
                        e.printStackTrace();
                    }
                    break;
                case "transfer":
                    try {
                        transfer(Integer.parseInt(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]));
                    } catch (UnknownAccountException | NotEnoughMoneyException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Operation not supported");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
