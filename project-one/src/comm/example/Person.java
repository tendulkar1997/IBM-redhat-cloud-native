package comm.example;

public class Person {

    //instance variables
    private   int personId;
    private String personName;
    private int personAge;
    //compositions
    private Address address=null;

    //default constructors
    public Person()
    {

    }
    //parameterized constructors
    public Person(int personId,String personName,int personAge,Address address)
    {
        this.personId=personId;
        this.personName=personName;
        this.personAge=personAge;
        this.address=address;
    }

   /* public void createPerson(int id,String name,int age)
    {
        if((id<0)||(age>100))
        {
            System.out.println("invalid age");
            personAge=0;
        }
        else
        {
         personAge=age;
        }

        personId=id;
        personName=name;
    }*/

    public String getDetails()
    {
        if(this.address==null)
        {
            address=new Address("dummy address1","dummy address 2");
        }
        return "Person ID: "+personId + " Person Name: "+personName+" Person Age: "+personAge+"Address: "+this.address.getAddress();
    }

}
