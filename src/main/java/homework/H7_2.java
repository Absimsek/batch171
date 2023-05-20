package homework;

import java.util.Scanner;

public class H7_2 {
    public static void main(String[] args) {
/*
        2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        Pazar ==> 1. gun , Pazartes ==> 2. gun...

      */
        Scanner input= new Scanner(System.in);
        System.out.println("Please type a day name here");
        String day=input.nextLine();

        if (day.equalsIgnoreCase("sunday")){
            System.out.println("Day 1");
        } else if (day.equalsIgnoreCase("monday")) {
            System.out.println("Day 2");
        }else if (day.equalsIgnoreCase("tuesday")) {
            System.out.println("Day 3");
        }else if (day.equalsIgnoreCase("wednesday")) {
            System.out.println("Day 4");
        }else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("Day 5");
        }else if (day.equalsIgnoreCase("friday")) {
            System.out.println("Day 6");
        }else if (day.equalsIgnoreCase("saturday")) {
            System.out.println("Day 7");
        }else {
            System.out.println("that is not a day name.Please type a day name");
        }


    }
}
