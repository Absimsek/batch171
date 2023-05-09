package homework;

import java.util.Scanner;

public class H5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 3 tane sayi giriniz...");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        System.out.println( (firstNumber+secondNumber+thirdNumber)/3);


        System.out.println("Lütfen 3 basamaklı bir sayı giriniz...");
        int number = input.nextInt();
        int birlerbasamagi = number % 10;
        number = number / 10;

        int onlarbasamagi = number % 10;
        number = number / 10;

        int yuzlerbasamagi = number % 10;

        System.out.println(birlerbasamagi+onlarbasamagi+yuzlerbasamagi);

    }
}
