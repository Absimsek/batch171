package practice;

import java.util.Arrays;

public class p2_1 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD yazınız

        int num[]=new int[5];

        num[0]=15;
        num[1]=20;
        num[2]=30;
        num[3]=25;
        num[4]=10;
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.println(num[i]);

        }




    }
}
