import creational.singleton.Singleton1;
import creational.singleton.Singleton2;
import creational.singleton.Singleton3;
import creational.singleton.Singleton4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {

////        Singleton1 ob3 = new Singleton1("a"); // ob1 e referinta catre obiectul  new Singleton1() -> in heap in JVM
////        Singleton1 ob4 = new Singleton1("a");
//
//
////        Singleton1 ob1 = Singleton1.getInstance();
////        Singleton1 ob2 = Singleton1.getInstance();
//
//
//        Singleton2 ob3 = Singleton2.getInstance();
//        Singleton2 ob4 = Singleton2.getInstance();
//
//        Singleton3 ob5 = Singleton3.SINGLETON_3;
//        Singleton3 ob6 = Singleton3.SINGLETON_3;
//
//        System.out.println(ob3 == ob4);



        Runnable task1 = new Runnable() {   // Interfata Runable e folosita pt a reprezenta un task!!!
            @Override
            public void run() {
                Singleton4 singleton = Singleton4.getInstance();
                singleton.addElement(1);

                System.out.println("Obiect creat de " + Thread.currentThread().getName() + singleton + " si are elementele "+singleton.getList());
            }
        };


        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                Singleton4 singleton = Singleton4.getInstance();
                singleton.addElement(2);

                System.out.println("Obiect creat de " + Thread.currentThread().getName() + singleton + " si are elementele "+singleton.getList());
            }
        };

        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                Singleton4 singleton = Singleton4.getInstance();
                singleton.addElement(3);

                System.out.println("Obiect creat de " + Thread.currentThread().getName() + singleton + " si are elementele "+singleton.getList());
            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(3); // creez un pool cu 3 threaduri!!!

        executorService.submit(task1);  // asignez task1 unui thread din piscina de threaduri!!!
        executorService.submit(task2);
        executorService.submit(task3);




        executorService.shutdown();


    }
}