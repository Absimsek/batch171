package practice;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int arrSayı[] = new int[15];
        int yeniArr[] = new int[15];
        for (int i = 0; i < arrSayı.length; i++) {
            arrSayı[i] = i+85;
        }
        System.out.println(Arrays.toString(arrSayı));

        for (int i = 0; i < arrSayı.length; i++) {
            if (i == 1) {
                yeniArr[i] = arrSayı[i + 1];
            } else if (i == arrSayı.length - 1) {
                yeniArr[i] = arrSayı[0];
            } else {
                yeniArr[i] = arrSayı[i + 1];
            }

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
