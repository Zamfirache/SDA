package structural.decorator;

import structural.decorator.decorators.CreamDecorator;
import structural.decorator.decorators.MilkDecorator;
import structural.decorator.decorators.SugarDecorator;

// la ce ma ajuta? => Sa extind functionalitatea dinamic unui obiect deja existent!!!!


// unde se intalneste? => AOP Spring ( aspect orientated programming)
 // ca aplicatii practice ale AOP ( aspecte) => Tranzactionabilitate ( pe asta il invatati la JDBC si Hibernate)
 //                                            => Caching
 //                                            => Securitatea
//                                             =>Logging
public class Main {
    public static void main(String[] args) {

        Coffe coffe = new SimpleCoffe();

        Coffe coffe2 = new MilkDecorator(coffe); // aici vrem doar o cafea simpla cu LAPTE!!!

        coffe = new SugarDecorator(coffe);  // adugam zahar la o cafea simpla
        coffe = new MilkDecorator(coffe); // adaugam si lapte unei cafele cu zahar
        coffe = new CreamDecorator(coffe);  // adaugam si crema !!!


        System.out.println(coffe2.getDescription() + "  cu pretul  " + coffe2.getPrice());

    }
}
