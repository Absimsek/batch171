package homework;

public class H3 {
    public static void main(String[] args) {
        double cevre = cembercevre(2) ;
        double alan = dairealan(2);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
    public static double cembercevre (double r){
        return 2*3.14*r;
    }
    public static double dairealan (double r){
        return 3.14*r*r;
    }
}
