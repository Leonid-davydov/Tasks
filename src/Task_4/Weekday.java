package Task_4;

import java.util.Scanner;

public enum Weekday {
    MONDAY("MON",false), TUESDAY("TUE",false),
    WEDNESDAY("WED",false), THURSDAY("THU",false),
    FRIDAY("FRI",false), SATURDAY("SAT",true),
    SUNDAY("SUN",true);

    private final String shortName;
    private final boolean weekend;

    Weekday(String shortName, boolean weekend) {
        this.shortName = shortName;
        this.weekend = weekend;
    }

    public static void getInfo() {
        Weekday[] days = Weekday.values();
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        if (num < 1 || num > 7) {
            System.out.println(num);
            return;
        }

        System.out.print(days[num - 1].name() + "(" + days[num - 1].shortName + ") ");
        if (days[num - 1].weekend) {
            System.out.println("is a weekend.");
        } else {
            System.out.println("is not a weekend.");
        }
    }
}
