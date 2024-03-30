package d3_time;

import java.util.Calendar;

public class TestCcalendar {
    public static void main(String[] args) {
        Calendar now =Calendar.getInstance();
        System.out.println(now);

        int year=now.get(Calendar.YEAR);
        System.out.println(year);
        int day=now.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);


    }
}
