package eu.codeacademy.javaua2.innerclass;

public class HardwareManagement {

    public void init() {
        var proc = new Processor(5.0, "AMD");
        var ram = new RAM(50, "rX");
        var cpu = new CPU(300.99, proc, ram);

        System.out.println(cpu);
    }

}
