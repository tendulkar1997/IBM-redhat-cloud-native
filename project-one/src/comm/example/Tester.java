package comm.example;

public class Tester {
    public static void main(String args[])
    {


     //local variable, reference variable;
       Person person=null;
       person=new Person(2,"Sachin",-2,new Address("Chennai","India"));
       System.out.println(person.getDetails());

    }
}
