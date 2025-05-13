package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton4 {


    private List<Integer> list = new ArrayList<>();


    private  Singleton4() {

        System.out.println("Instanta creata din "+Thread.currentThread().getName());
    }

    private static Singleton4 instance;


    public static Singleton4 getInstance()   // DOAR T1 VA PUNE LOCK PE RESURSA
    {
        if(instance == null){
            synchronized(Singleton4.class){  // bloc de sincronizare , iar clasa Singleton 4 e Monitorul sau Politistul!!!!
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }


//    public static synchronized Singleton4 getInstance() {  // syncronized are rolul de a sincroniza threadurile!!!!
//                                                            // T1 , T2 SI T3 vor pune pe rand lock la resursa si o vor elibera!!!
//        if (instance == null) {
//            instance = new Singleton4();
//        }
//        return instance;
//    }

    public List<Integer> getList() {
        return list;
    };

    public void addElement(Integer element) {
        list.add(element);
    }
}
