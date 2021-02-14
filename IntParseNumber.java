package HomeTask;

public class IntParseNumber {
    public static int parse(int value, int value1, String value2) {
        int val;
        switch (value2) {
            case "*": val = value*value1;
                break;
            case "-":val = value-value1;
                break;
            case "+":val = value+value1;
                break;
            case "/":val = value/value1;
                break;
            default:
                throw new IllegalStateException("Не верное значение для работы с числами");
        }
        return val;

    }
}
