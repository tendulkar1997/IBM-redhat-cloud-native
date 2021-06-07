package comm.example;

public class Tester {
    public static void main(String args[])
    {

        int a=10;
     //local variable, reference variable;
       Person person=null;
       person=new Person();
       person.createPerson(1,"Sachin",-90);
       System.out.println(person.getDetails());

    }
}
