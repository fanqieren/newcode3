package d5_array;

import sun.reflect.generics.tree.ArrayTypeSignature;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        int[] arr2=Arrays.copyOfRange(arr,0,2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr3));

        double[] prices={1.2,55.6,78.9};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                double m=0.8;
                BigDecimal p =new BigDecimal(Double.toString(prices[value]));
                BigDecimal q =new BigDecimal(Double.toString(m));
                BigDecimal k=p.multiply(q);

                return k.doubleValue();
            }
        });
        System.out.println(Arrays.toString(prices));
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

    }
}
