package comm.example;
public class CD {

    private int cdId;
    private String cdName;
    private double cdPrice;

    //default constructor
    public CD() {
        this(10);
        System.out.println("default");
    }

    //one argument constructor
    public CD(int cdId) {
        this(cdId,"Titanic");

        System.out.println("one");

    }
//two arguments constructor
    public CD(int cdId, String cdName) {
        this(cdId,cdName,100.1);
        System.out.println("two");
    }
//three arguments constructor
    public CD(int cdId, String cdName, double cdPrice) {
        this.cdId = cdId;
        this.cdName = cdName;
        this.cdPrice = cdPrice;
        System.out.println("three");
    }

    public String getDetails()
    {
        return "CD ID: "+cdId+" CD Name: "+cdName+" CD Price: "+cdPrice;
    }
}
