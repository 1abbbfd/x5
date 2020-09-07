package primitive_type;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //lastNumber();
        //sumNumbers();
        //increment();
        //incrementIfPositive();
        //customFunction();
        //getSmallestNumber();
        //getInfoAboutNumber();
        //getCallPrice();
        //getCustomInfo();
        //revert();
        //moveZero();
    }

    //1
    static public void lastNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextInt() % 10);
        }
    }

    //2
    static public void sumNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            for (char i : scanner.nextLine().toCharArray()) {
                sum += Character.getNumericValue(i);
            }
            System.out.println(sum);
        }
    }

    //3
    static public void incrementIfPositive() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println(number > 0 ? ++number : number);
        }
    }

    //4
    static public void customFunction() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println(10);
                return;
            }
            if (number > 0) {
                System.out.println(++number);
            } else {
                System.out.println(number - 2);
            }
        }
    }

    //5
    static public void getSmallestNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] number = new int[3];
            for (int i = 0; i < 3; i++) {
                number[i] = scanner.nextInt();
            }
            int min = number[0];
            for (int i = 1; i < number.length - 1; i++) {
                if (min > number[i]) {
                    min = number[i];
                }
            }
            System.out.println(min);
        }
    }

    //6
    static public void getInfoAboutNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("четное число");
                return;
            }
            String info = "";
            if (number > 0) {
                info += "положительное";
            } else {
                info += "отрицательное";
            }
            if (number % 2 == 0) {
                info += " четное число";
            } else {
                info += " нечетное число";
            }
            System.out.println(info);
        }
    }

    //7
    static public void getCallPrice() {
        try (Scanner scanner = new Scanner(System.in)) {
            double sum;
            String city;
            switch (scanner.nextInt()) {
                case 905:
                    city = "Москва";
                    sum = 4.15;
                    break;
                case 194:
                    city = "Ростов";
                    sum = 1.98;
                    break;
                case 491:
                    city = "Краснодар";
                    sum = 2.69;
                    break;
                case 800:
                    city = "Киров";
                    sum = 5;
                    break;
                default:
                    System.out.println("Нет такого кода");
                    return;
            }
            System.out.printf("%s. Стоимость разговора %.1f%n", city, sum * 10);
        }
    }

    //8
    static public void getCustomInfo() {
        int[] number = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = number[0];
        int positiveSum = 0;
        int negativeSum = 0;
        int evenNegativeSum = 0;
        int positiveCount = 0;
        boolean containsZero = false;
        for (int i : number) {
            if (i > max) {
                max = i;
            }
            if (i > 0) {
                positiveSum += i;
                positiveCount++;
            } else {
                negativeSum += i;
                if (i == 0) {
                    containsZero = true;
                }
            }

            if (i < 0 && i % 2 == 0) {
                evenNegativeSum += i;
            }
        }
        System.out.println("максимальное значение " + max);
        System.out.println("сумма положительных элементов " + positiveSum);
        System.out.println("сумма четных отрицательных элементов " + evenNegativeSum);
        System.out.println("количество положительных элементов " + positiveCount);
        int negativeCount = containsZero
                ? number.length - positiveCount - 1
                : number.length - positiveCount;
        System.out.println("среднее арифметическое отрицательных элементов " + ((float) negativeSum / (negativeCount)));
    }

    //9
    static public void revert() {
        int[] number = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] result = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            result[i] = number[number.length - 1 - i];
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    //10
    static public void moveZero() {
        int[] number = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] result = new int[number.length];
        int index = 0;
        for (int i : number) {
            if (i != 0) {
                result[index] = i;
                index++;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
