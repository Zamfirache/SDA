package structural.facade;



// unde il folosim? => atunci cand vrem sa ascundem complexitatea unui sistem
 // cand oferim o interfata uniforma clientului!!!!!!!
public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();


//        Memory me1 = new Memory();
//        Memory me2 = new Memory();
//        Memory me3 = new Memory();

//        ComputerFacade2 computerFacade2 = new ComputerFacade2(me1,me2,me3);
//        ComputerFacade2 computerFacade3 = new ComputerFacade2(me2,me3,me1);
//        ComputerFacade2 computerFacade4 = new ComputerFacade2(me3,me2,me1);

        ComputerFacade computerFacade = new ComputerFacade(memory, hardDrive, cpu);

        computerFacade.startComputer();
    }
}
