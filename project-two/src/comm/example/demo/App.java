package comm.example.demo;
import comm.example.CD;
public class App {

    public static void main(String[] args)
    {
        CD myCD = new CD();
        System.out.println(myCD.getDetails());
        myCD.createCD(200);
        System.out.println(myCD.getDetails());
        myCD.createCD(200,"Godzilla");
        System.out.println(myCD.getDetails());
        myCD.createCD(200,"Godzilla",30);
        System.out.println(myCD.getDetails());
    }
}
