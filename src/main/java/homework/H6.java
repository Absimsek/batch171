package homework;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
      //  1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String a = "123456abcdef-*";
        int h1= a.replaceAll("[0-9]", "").length();
        System.out.println(h1);//8

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String b= "abcdefgh";
        String h2=b.substring(1,b.length()-1).toUpperCase();
        System.out.println(h2);//BCDEFG

       // 3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        String c ="AbCdEfGh";
        int h3_1= c.charAt(0);
        int h3_2=c.length()-1;

        System.out.println("ilk karakterin ASCII degeri "+h3_1);//65
        System.out.println("son karakterin ASCII degeri "+h3_2);//7

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //console a yazdirin

        String d="siVAs";
        String h4=d.toUpperCase().charAt(0)+d.toLowerCase().substring(1);
        System.out.println(h4);//Sivas

        //5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        //        a)En az 6 character olsun
        //        b)En az bir tane buyuk harf olsun
        //        c)En az bir tane kucuk harf olsun
        //        d)En az bir tane rakam olsun
        Scanner psw = new Scanner(System.in);
        System.out.println("lütfen sifrenizi giriniz");
        String sifre=psw.nextLine();
        boolean firstReq=sifre.length()>5;
        boolean secondReq=sifre.replaceAll("[^A-Z]","").length()>0;
        boolean thirdReq=sifre.replaceAll("[^a-z]","").length()>0;
        boolean fourthReq=sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println("firstReq = " + firstReq);
        System.out.println("secondReq = " + secondReq);
        System.out.println("thirdReq = " + thirdReq);
        System.out.println("fourthReq = " + fourthReq);
        System.out.println("are every requirement met "+(firstReq&&secondReq&&thirdReq&&fourthReq));


    }
}
