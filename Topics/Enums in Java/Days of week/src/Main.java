
enum  DayOfWeek {
    SUNDAY, MONDAY, THURSDAY, WEDNESDAY, TUESDAY, FRIDAY, SATURDAY;
}

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}