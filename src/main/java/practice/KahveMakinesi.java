package practice;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz... \n 1.türk kahvesi \n 2.filtre kahve \n 3.espresso");
        String hangiKahve=input.nextLine();

        if (hangiKahve.equalsIgnoreCase("türk kahvesi")){
            System.out.println("türk kahveniz hazırlanıyor");
        } else if (hangiKahve.equalsIgnoreCase("filtre kahve")) {
            System.out.println("filtre kahveniz hazırlanıyor");
        } else if (hangiKahve.equalsIgnoreCase("espresso")) {
            System.out.println("espressonuz hazırlanıyor");
        }else {
            System.out.println("Hatalı tuşlama yaptınız...");
        }

        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String sut=input.nextLine();

        if (sut.equalsIgnoreCase("evet")){
            System.out.println("sütünüz ekleniyor");
        } else if (sut.equalsIgnoreCase("hayır")) {
            System.out.println("süt eklenmiyor");
        }else {
            System.out.println("hatalı tuşlama yaptınız");
        }

        System.out.println("şeker eklememizi istermisiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String seker=input.nextLine();

        if (seker.equalsIgnoreCase("evet")){
            System.out.println("kaç şeker istersiniz ? (Lütfen sadece sayı giriniz)");
            int kacSeker=input.nextInt();
            String bosKod=input.nextLine();

            if (kacSeker>=0){
                System.out.println(kacSeker +" şeker ekleniyor");
            }else {
                System.out.println("hatalı tuşlama yaptınız");
            }
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.println(" şeker eklenmiyor");
        }else {
            System.out.println("hatalı tuşlama yaptınız");
        }

        System.out.println("hangi boyutta olsun ? (büyük boy,orta boy,küçük boydan birini seçiniz)");

        String boy=input.nextLine();

        if (boy.equalsIgnoreCase("büyük boy")){
            System.out.println("kahveniz " + boy.toLowerCase()+ " hazırlanıyor");
        } else if (boy.equalsIgnoreCase("orta boy")) {
            System.out.println("kahveniz "+ boy.toLowerCase()+ " hazırlanıyor");
        } else if (boy.equalsIgnoreCase("küçük boy")) {
            System.out.println("kahveniz "+ boy.toLowerCase()+ " hazırlanıyor");
        }else {
            System.out.println("hatalı tuşlama yaptınız");
        }

        System.out.println(hangiKahve +" "+ boy + " hazırdır");

    }
}
