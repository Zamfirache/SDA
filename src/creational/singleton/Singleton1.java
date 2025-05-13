package creational.singleton;

import java.util.logging.Logger;

public class Singleton1 {

    private String name;

    Logger log = Logger.getLogger(this.getClass().getName());


    public Singleton1()
    {

    }

    private static Singleton1 instance = new Singleton1();  // EAGER INITIALIZATION


    public static Singleton1 getInstance()
    {
        return instance;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
