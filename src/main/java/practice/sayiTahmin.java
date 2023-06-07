package practice;

import java.util.Scanner;

public class sayiTahmin {
    /*
        Amaç:
        Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.

        Yönergeler:
        - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
        - Oyuncu bir sayı girişi yapar.
        - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
            - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
              Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir ve
              "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
            - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
            - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
            - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
              "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
              mesajı gösterilir.
            - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
            - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-100 arasi bir sayi tahmini giriniz");
        int random = (int) (Math.random() * 100);
        int sayac = 1;
        int kalanHak = 10;


        while (sayac < 11) {
            int kalanHak2=kalanHak-1;
            int sayi = input.nextInt();
            if (sayi == random) {
                System.out.println("tebrikler,"+sayac+". tahminde sayıyı buldunuz puanınız "+ kalanHak*10);
                System.out.println("Tekrar oynamak icin 1 e basiniz. Çıkmak için herhangi bir sayıya basın.");
                int bitisSayisi = input.nextInt();
                if (bitisSayisi == 1) {
                    main(args);
                } else {
                    break;
                }
            } else if (sayi > random) {
                System.out.println("Bilemediniz, tahmin için " + kalanHak2 + " hakkınız kaldı! Daha küçük bir sayı giriniz:");
                sayac++;
                kalanHak--;
            } else {

                System.out.println("Bilemediniz, tahmin için "+ kalanHak2 + " hakkınız kaldı! Daha büyük bir sayı giriniz:");
                sayac++;
                kalanHak--;


            }
        }
        if (kalanHak == 0) {
            System.out.println("Hakkınız bitti oyunu kaybettiniz. Tekrar oynamak için 1 e, çıkmak için herhangi bir tuşa basınız");
            int bitisSayisi = input.nextInt();
            if (bitisSayisi == 1) {
                main(args);
            }


        }
    }








}
