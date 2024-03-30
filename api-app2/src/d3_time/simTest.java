package d3_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;
import java.util.logging.SimpleFormatter;

public class simTest {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        long time =d.getTime();
        System.out.println(time);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String rs=sdf.format(time);
        System.out.println(rs);
        System.out.println("--------------------------------------");


    }
}
