package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Op1 {
    public static void main(String[] args) {
        /*
        kullanicidan aldıgımız 8 elemanlı arrayin içinde 3 e bölünebilen
        sayi adedini yazdıram java code create ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("8 sayi giriniz...");
        int sayi [] = new int[8];
        int count=0;

        for (int i = 0; i < 8 ; i++) {
            sayi [i]=input.nextInt();
        }
        for (int w : sayi){
            if (w%3==0){
                count++;
            }

        }
        System.out.println(Arrays.toString(sayi));
        System.out.println(count);
            }
        }


