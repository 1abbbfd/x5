package primitive_type;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //для 1-4, 6, 7 задач
        //System.out.println(FUNCTION(scanner.nextInt()));
        //для 5 задачи
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //int c = scanner.nextInt();
        //System.out.println(getSmallestNumber(new int[]{a, b, c}));
        //для 8
        //getCustomInfo();
        //для 9
        for (int i : revert()) {
            System.out.print(i + " ");
        }
        System.out.println();
        // для 10
        for (int i : moveZero()) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    //1
    static public int lastNumber(int number) {
        return number % 10;
    }

    //2
    static public int sumNumbers(int number) {
        return number % 10 + number / 100 + number % 100 / 10;
    }

    //3
    static public int increment(int number) {
        return number > 0 ? ++number : number;
    }

    //4
    static public int incrementIfPositive(int number) {
        return number > 0
                ? ++number
                : number == 0
                ? 10
                : number - 2;
    }

    //5
    static public int getSmallestNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //6
    static public String getInfoAboutNumber(int number) {
        if (number == 0) {
            return "четное число";
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

        return info;
    }

    //7
    static public String getCallPrice(int code) {
        double sum = 0;
        String city = "";
        switch (code) {
            case 905:
                city += "Москва";
                sum = 4.15;
                break;
            case 194:
                city += "Ростов";
                sum = 1.98;
                break;
            case 491:
                city += "Краснодар";
                sum = 2.69;
                break;
            case 800:
                city += "Киров";
                sum = 5;
                break;
        }
        return String.format("%s. Стоимость разговора %.2f", city, sum * 10);
    }

    //8
    static public void getCustomInfo() {
        int[] number = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(number);
        System.out.println("максимальное значение " + number[number.length - 1]);
        int border = 0;
        int size = number.length;
        for (int i = 0; i <= size; i++) {
            if (number[i] >= 0) {
                border = i;
                break;
            }
        }

        int positiveNumbers = 0;
        for (int i = border; i < size; i++) {
            positiveNumbers += number[i];
        }
        System.out.println("сумма положительных элементов " + positiveNumbers);

        int evenNegativeNumbers = 0;
        for (int i = 0; i < border; i++) {
            evenNegativeNumbers += number[i] % 2 == 0
                    ? number[i]
                    : 0;
        }
        System.out.println("сумма четных отрицательных элементов " + evenNegativeNumbers);
        System.out.println("количество положительных элементов " + (size - (number[border] == 0 ? border + 1 : border)));

        float negativeNumbers = 0;
        for (int i = 0; i < border; i++) {
            negativeNumbers += number[i];
        }
        System.out.println("среднее арифметическое отрицательных элементов " + (negativeNumbers / border));
    }

    //9
    static public int[] revert() {
        int[] number = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] result = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            result[i] = number[number.length - 1 - i];
        }
        return result;
    }

    //10
    static public int[] moveZero() {
        int[] number = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] result = new int[number.length];

        int index = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                result[index] = number[i];
                index++;
            }
        }
        return result;
    }

}
