package HomeTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;

public class Calculator1 {
    public static void main(String[] args) {
        start();
        }

    private static void start() {
        System.out.println("Введите операцию между 2 арабскими или римскими числами и нажмите enter. \nДля выхода нажмите \"exit\" или \"close\"");


        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String val = reader.readLine();
                if (val.equals("exit") || val.equals("close")) break;

                String[] values = val.split(" ");
                if (values.length != 3) {
                    throw new IllegalArgumentException("Введено не верное количество символов или не удалось прочитать строку");
                }


                try {
                    int num1 = Integer.parseInt(values[0]);
                    int num2 = Integer.parseInt(values[2]);
                    if (num1 < 0 || num1 > 10) {
                        throw new IllegalArgumentException("Введено число больше 10 или меньше 0");
                    }
                    if (num2 < 0 || num2 > 10) {
                        throw new IllegalArgumentException("Введено число больше 10 или меньше 0");
                    }
                    System.out.println(IntParseNumber.parse(num1, num2, values[1]));
                    System.out.println("До встречи");
                    break;

                } catch (NumberFormatException ex) {
                    int num1 = A_RomanParseReal.romanToArabic(values[0]);
                    if (num1 < 0 || num1 > 10) {
                        throw new IllegalArgumentException("Введено число больше 10 или меньше 0");
                    }
                    int num2 = A_RomanParseReal.romanToArabic(values[2]);
                    if (num2 < 0 || num2 > 10) {
                        throw new IllegalArgumentException("Введено число больше 10 или меньше 0");
                    }
                    int value = IntParseNumber.parse(num1, num2, values[1]);
                    System.out.println(A_RomanParseReal.arabicToRoman(value));
                    System.out.println("До встречи");
                    break;
                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }



    }

}
