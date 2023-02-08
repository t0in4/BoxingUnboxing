package control1;

import java.util.Scanner;

public class Control1 {

    public static int convert(Long val) {
        // код здесь
        return val == null ? 0
                : val >= Integer.MAX_VALUE ? Integer.MAX_VALUE
                : val <= Integer.MIN_VALUE ? Integer.MIN_VALUE
                : val.intValue();
    }
    /* Не меняем код */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
