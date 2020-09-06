package oop.lesson3.phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.printf("Звонит %s с номера %s", name, phoneNumber);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
