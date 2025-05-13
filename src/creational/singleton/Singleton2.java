package creational.singleton;

public class Singleton2 {

    private Singleton2() // constructor private
    {

    }

    private static Singleton2 instance;


    public static Singleton2 getInstance()   // LAZY INITIALIZATION
    {
        if(instance == null)
        {
            instance = new Singleton2();
        }

        return instance;
    }




    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
