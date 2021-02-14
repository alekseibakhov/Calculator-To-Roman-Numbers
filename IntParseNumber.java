package HomeTask;

public class IntParseNumber {
    public static int parse(int value, int value1, String value2) {
        int val;
        if (value1 < 0 || value1 > 10) {
            throw new IllegalArgumentException("Введено число больше 10 или меньше 0");
        }
        if (value < 0 || value > 10) {
            throw new IllegalArgumentException("Введено число больше 10 или меньше 0");
        }
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
