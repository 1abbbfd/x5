package paterns.logger;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    static String getOperation(String input) {
        for (char ch : input.toCharArray()) {
            if (ch == '+' || ch == '/' || ch == '-' || ch == '*') {
                return String.valueOf(ch);
            }
        }
        return null;
    }

    static List<Float> getOperators(String input) {
        ArrayList<Float> numbers = new ArrayList<>();
        for (String number : input.split("[-+/*]")) {
            numbers.add(Float.valueOf(number.trim()));
        }
        return numbers;
    }
}
