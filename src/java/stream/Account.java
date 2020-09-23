package stream;

import static java.lang.String.format;

public class Account {
    private int id;
    private String holder;
    private int amount;

    public Account(int id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getHolder() {
        return holder;
    }

    public int getAmount() {
        return amount;
    }

    public int withdraw(int amount) {
        this.amount -= amount;
        return this.amount;
    }

    public int put(int amount) {
        this.amount += amount;
        return this.amount;
    }

    public void transferTo(Account account, int amount) {
        withdraw(amount);
        account.put(amount);
    }

    @Override
    public String toString() {
        return format("%d %s %d", id, holder, amount);
    }
}
