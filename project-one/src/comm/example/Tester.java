package comm.example;

public class Tester {
    public static void main(String args[])
    {


     //local variable, reference variable;
       Person person=null;
       //default constructor getting called
       person=new Person();
       System.out.println(person.getDetails());
       person=new Person(2,"Rahul",20,new Address("Chennai","India"));
       System.out.println(person.getDetails());

    }
}
