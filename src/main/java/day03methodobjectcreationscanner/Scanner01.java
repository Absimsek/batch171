package day03methodobjectcreationscanner;
// java nin util kutuphanesinden scanner import(ithal) edildi
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        //1.adım scanner classtan object olustur
        Scanner input = new Scanner(System.in);

        //2.adim kullanıcıya olan mesaji yaz
        System.out.println("Lutfen yasinizi giriniz");

        //3.adım uygun methodu kullanarak kullanicnin verdigi datayi memory e yerlestir
        byte age= input.nextByte();
        System.out.println("age = " + age);
    }
}
