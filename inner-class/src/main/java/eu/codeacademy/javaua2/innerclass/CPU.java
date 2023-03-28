package eu.codeacademy.javaua2.innerclass;

import lombok.ToString;
import lombok.Value;

@Value
public class CPU {

    double price;
    Processor processor;
    RAM ram;
}
