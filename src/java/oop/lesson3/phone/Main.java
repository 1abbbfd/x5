package oop.lesson3.phone;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Phone firstPhone = new Phone("+7 (800) 55-35-35", "nokia", 100);
        Phone secondPhone = new Phone("+7 (800) 55-35-36", "samsung", 200);
        Phone thirdPhone = new Phone("+7 (800) 55-35-37", "apple", 300);
        List<Phone> phones = Arrays.asList(firstPhone, secondPhone, thirdPhone);
        for (Phone phone : phones) {
            System.out.println(phone.getNumber() + " " + phone.getModel() + " " + phone.getWeight());
            phone.receiveCall("Bob");
        }

        firstPhone.receiveCall("Ivan", "+7 (800) 11-11-11");
        firstPhone.sendMessage("+7 (800) 55-35-35", "+7 (800) 55-35-36", "+7 (800) 11-11-11");
    }
}
