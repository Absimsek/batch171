package homework;

public class H2 {
    public static void main(String[] args) {
        int sonuc1 = alan(5,6);
        int sonuc2 = cevre(5,6);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
    }
    public static int alan(int a,int b){
        return a*b;
    }

    public static int cevre(int a,int b){
        return 2*a + 2*b;

    }
}
