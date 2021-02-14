package HomeTask;

import java.util.List;

public class A_RomanParseReal {
    public static int romanToArabic(String str) {
        String romString = str.toUpperCase();
        int result = 0;

        List<A_EnumRomans> romanNumerals = A_EnumRomans.getReverseSortedValues(); // перечисление римских значений от большего к меньшеиу

        int i = 0;

        while ((romString.length() > 0) && (romanNumerals.size()>i)) { //пока строка входа больше 0 и массив больше счетчика
            A_EnumRomans symbol = romanNumerals.get(i);  // получаем 1 значение из перечисления
            if (romString.startsWith(symbol.name())) { // если строка начинается с символа перечисления
                result += symbol.getValue();  // результат увелличиваем на значение перечисления
                romString = romString.substring(symbol.name().length()); // обрезаем строку входную на длину перечисления
            } else {
                i++;
            }
        }

        if (romString.length() > 0) {
            throw new IllegalArgumentException(str + " не верный формат ввода для Римских чисел");
        }

        return result;
    }

    public static String arabicToRoman(int number) {

        List<A_EnumRomans> romanNumerals = A_EnumRomans.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (romanNumerals.size() > i )) {
            A_EnumRomans currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
