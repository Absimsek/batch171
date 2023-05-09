package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args){
       double kup = getCube(5);
        System.out.println(kup);
        System.out.println("kup = " + kup);
        print("java is easy");

        /*method oluşturmak için 2.bir yol daha var.
        ilk olarak variable ları yazaman gerekiyor daha sonra parametreyi ekliyorsun
        imleç ile yazdığığınız methodun üstüne gelip ordan seçerek de method oluşturabilirsin
         */
        int a =3;
        int b = 5;
        carpmaYap(a,b);




    }

    public static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    //Ornek 1 : Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullanınız
    static double getCube(double a){
    return a*a*a;
    }
    /* Acces modifier ı default yaparsak acces modifier YAZMAYIZ yani yukardaki kod icin static double yeterli!!!

    defaul static double getCube(double a){
    } bu hali yanlıştır
     */

    // Ornek 2 girilen bir kelimeyi ekrana yazdıran bir method olusturup kullaniniz
    public static void print(String str){
        System.out.println(str);
    }

    // eger bir method yei bir data üretmiyorsa return type i void olur
    // methodun return type i void ise method body icinde return keywordu yazilmaz.

    /*
    homework
    1- cember cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2- dairenin alanını hesaplayan methodu olusturunuz ve kullaniniz
     */



}
