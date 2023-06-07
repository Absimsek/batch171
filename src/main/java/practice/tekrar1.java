package practice;


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tekrar1 {
     /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.
        */


    public static void main(String[] args) {
        int[] num = new int[6];
        Scanner input= new Scanner(System.in);

for (int i=0 ; i<num.length; i++){
    System.out.println(i+1  + ". elemanı giriniz");
    num[i]=input.nextInt();

}
        List<Integer> teksayi= new ArrayList<>();
        for (int i = 0; i <num.length ; i++) {
            if (num[i]%2 !=0){
                teksayi.add(num[i]);
            }
        }



        System.out.println(Arrays.toString(num));
        System.out.println(teksayi);

    }
}