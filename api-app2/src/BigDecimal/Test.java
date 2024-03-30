package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double a=0.1;
        double b=0.3;
        System.out.println(a + b);
        System.out.println("-----------------------------");

        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c1=a1.add(b1);
        System.out.println(c1);
        System.out.println("------------------------");
        BigDecimal i=BigDecimal.valueOf(a);
        BigDecimal j=BigDecimal.valueOf(b);
        BigDecimal k=i.divide(j,2, RoundingMode.HALF_UP);
        System.out.println(k);
        double z= k.doubleValue();
        System.out.println(z);
    }
}
