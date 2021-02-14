package HomeTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum A_EnumRomans {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

   private int value;

    A_EnumRomans(int val) {
        this.value = val;
    }

    public static List<A_EnumRomans> getReverseSortedValues() {
        List<A_EnumRomans> list = Arrays.stream(values()).sorted(Comparator.comparing((A_EnumRomans x) -> x.value).reversed()).collect(Collectors.toList());
        return list;
    }

    public int getValue() {
        return value;
    }
}
