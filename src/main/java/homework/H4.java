package homework;

public class H4 {
    String name = "Ali";
    byte age =40;
    boolean isretired= false;



    public static void main(String[] args) {

            H4 ali = new H4();
            System.out.println("ali.name = " + ali.name);
            System.out.println("ali.age = " + ali.age);
            System.out.println("ali.isretired = " + ali.isretired);
            ali.teach();
    }
    public void teach(){
        System.out.println("alanında uzman birisidir");
    }


}
