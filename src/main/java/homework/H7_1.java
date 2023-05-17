package homework;

import java.util.Scanner;

public class H7_1 {
    public static void main(String[] args) {

        /*
    Homework
    1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
    uygun mesaj veren kodu yaziniz


 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd =input.nextLine();

        if (pwd.equals("pwd123!")){
            System.out.println("Sifreniz dogru");
        }else {
            System.out.println("Yanlis sifre girdiniz.Lütfen tekrar deneyin");
        }







    }
}
