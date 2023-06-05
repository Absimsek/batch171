package repetition;

import java.util.Arrays;
import java.util.Scanner;
public class test07 {
    public static void main(String[] args) {
        System.out.println(getOrtalamaKazanc());
        System.out.println("oralamanın üstü günler"+getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalamanın altı günler: "+getOrtalamaninAltindaKazancGünleri());
    }
    static String[] gunler = {"Pazartesi", "Sali", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
    static int[] gunlukKazanclar = new int[7];
    static double ortalama;
    static Scanner input = new Scanner(System.in);
    public static int getOrtalamaKazanc() {
        System.out.println("lütfen günlük kazancınızı giriniz");
        int i = 0;
        while (i < 7) {
            System.out.print(gunler[i] + ": ");
            gunlukKazanclar[i] = input.nextInt();
            i++;
        }
        int toplam = 0;
        for (int k = 0; k < 7; k++) {
            toplam += gunlukKazanclar[k];
        }
        ortalama = toplam / 7;
        return (int) ortalama;
    }
    public static String getOrtalamaninUstundeKazancGünleri() {
        int idx = 0;
        String ortalamaUstugün[]=new String[7];
        for (int w : gunlukKazanclar) {
            if (w>ortalama) {
                ortalamaUstugün[idx]=gunler[idx];
            }
            idx++;
        }
        return Arrays.toString(ortalamaUstugün);
    }
    public static String getOrtalamaninAltindaKazancGünleri(){
        int idx = 0;
        String ortalamaAltigün[]=new String[7];
        for (int w : gunlukKazanclar) {
            if (ortalama > w) {
                ortalamaAltigün[idx]= gunler[idx];
            }
            idx++;
        }
        return Arrays.toString(ortalamaAltigün);
    }
}