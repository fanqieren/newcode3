package d3_time;

import sun.misc.PostVMInitHook;

import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        long time=d.getTime();
        time+=2*1000;
        Date d2=new Date(time);
        System.out.println(d2);

    }
}
