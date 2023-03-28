package eu.codeacademy.javaua2.innerclass;

import lombok.Value;

@Value
public class CPU {

    double price;

    @Value
    public class Processor {

        double cores;
        String manufacturerName;
    }

    @Value
    public class RAM {

        double memory;
        String manufacturerName;
    }
}
