package biz.misajovanovic;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {
        float x = 4.2f;
        double y = 3.2;
        double z = x * y;
//        float z = x * y;
        System.out.println("Result is :" + x * y + "and is type of double");

        short m = 14;
        float n = 13;
        double g = 30;

        float r = m * n;
        double r1 = r / g;
        System.out.println("Result of multiplication and division is: " + r1 + " type of double");

        int i = 3;

        int r2 = ++i * 5 / i-- + --i;
        System.out.println("Result is : " + r2);
        System.out.println("i = " + i);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer i1 = -2_147_483_648;
        System.out.println(i1);

        if (houtOfDay() < 10) {
            System.out.println("I am in...");
        }

        callSwitchMethod(5);

        Chick chick = new Chick();
        System.out.println(chick.getName());
        System.out.println(Short.MAX_VALUE);
    }

    private static void callSwitchMethod(final int numOfWeekDay) {

        switch (numOfWeekDay){
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    private static int houtOfDay() {
        return LocalDateTime.now(ZoneId.of("CET")).now().getHour();
    }
}
