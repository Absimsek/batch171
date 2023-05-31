package practice;

import java.util.Arrays;

public class p2_2 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden kodu yazınız


        int num[] = new int[7];
        num[0]=0;
        num[1]=1;
        num[2]=2;
        num[3]=3;
        num[4]=4;
        num[5]=5;
        num[6]=6;

        for (int w: num){
            if (w%2!=0){
                System.out.println(w);
            }
        }











    }
}
