package structural.facade;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(Memory memory, HardDrive hardDrive, CPU cpu) {
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.cpu = cpu;
    }


    public void startComputer(){
        System.out.println("Starting Computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer ready.");

    }
}
