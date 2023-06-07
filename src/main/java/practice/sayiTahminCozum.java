package practice;
import java.util.Scanner;
public class sayiTahminCozum {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("1-100 arası bir sayı tahmini giriniz");

        int random = (int) (Math.random() * 100);
        int sayac = 1;
        int kalanHak = 10;

        while (sayac < 11) {
            int girilenSayi = input.nextInt();

            if (girilenSayi == random) {
                System.out.println("Tebrikler," + sayac + "tahminde sayıyı buldunuz!");
                System.out.println("Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
                int devammi = input.nextInt();

                if (devammi == 1) {
                    main(args);
                } else {
                    break;
                }

            } else if (girilenSayi > random) {
                System.out.println("Bilemediniz, tahmin için " + (kalanHak) + " hakkınız kaldı! Daha küçük bir sayı giriniz:");
                kalanHak--;
                sayac++;
            } else {
                System.out.println("Bilemediniz, tahmin için " + (kalanHak) + " hakkınız kaldı! Daha büyük bir sayı giriniz:");
                kalanHak--;
                sayac++;
            }
        }
        if (kalanHak == 0) {
            System.out.println("Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
            int devammi = input.nextInt();

            if (devammi == 1) {
                main(args);
            }

        }
    }
}
