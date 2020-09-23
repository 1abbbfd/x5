package stream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AccountManagement implements AccountService {
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
    public void withdraw(int accountId, int amount) {
        Account account = read(accountId);
        account.withdraw(amount);
        rewrite(account);
    }

    @Override
    public void balance(int accountId) {
        System.out.println(read(accountId).toString());
    }

    @Override
    public void deposit(int accountId, int amount) {
        Account account = read(accountId);
        account.put(amount);
        rewrite(account);
    }

    @Override
    public void transfer(int from, int to, int amount) {
        Account accountFrom = read(from);
        Account accountTo = read(to);
        accountFrom.transferTo(accountTo, amount);
        rewrite(accountFrom);
    }

    public void manage(String operation) {
        String[] info = operation.split(" ");
        switch (info[0]) {
            case "balance":
                balance(Integer.parseInt(info[1]));
                break;
            case "withdraw":
                withdraw(Integer.parseInt(info[1]), Integer.parseInt(info[2]));
                break;
            case "deposite":
                deposit(Integer.parseInt(info[1]), Integer.parseInt(info[2]));
                break;
            case "transfer":
                transfer(Integer.parseInt(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[2]));
                break;
            default:
                System.out.println("Operation not supported");
        }
    }

}
