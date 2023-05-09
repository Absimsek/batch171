package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
//Object nasil olusturulur
//new keywordu sifirdan yeni bir object olusturmak icin kullanilir
//Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
//Class ismi  +  Object ismi  +  Assignment Operator +  "new" keywordu  +  Constructor
        Car             myCar               =               new            Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();


        Student alican = new Student();
        System.out.println("alican.name = " + alican.name);
        System.out.println("alican.adress = " + alican.adress);
        System.out.println("alican.grade = " + alican.grade);
        alican.feed();
        alican.study();


    }


}