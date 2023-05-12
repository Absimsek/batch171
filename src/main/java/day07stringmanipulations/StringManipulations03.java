package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Ornek:1 Bir stringin baş ve sonunda space karakteri varsa siliniz
        // "    Ali Can     "==> "Ali Can"

        String s= "    Ali Can     "  ;
        System.out.println(s);
        //trim() methodu baştan ve sondan space silmek için kullanılır. orta tarafa karışmaz.
        String sTrimmed= s.trim();
        System.out.println(sTrimmed);

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatını bulunuz
        // String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99=1332.98
        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2=tv.replace("$", "");
        System.out.println(tv2);

        String laptop2= laptop.replace("$", "");
        System.out.println(laptop2);

        double totalPrice=Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);
        //Ornek 3: Verilen ismi ilk isminin ilk harfini ve soy isminin ilk harfini yazdırınız
        // "    Ali Can    " ==> AC
        String name= "    ali cAN    ";
        System.out.println(name);
        char first =name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.println(""+first+last);




    }
}
