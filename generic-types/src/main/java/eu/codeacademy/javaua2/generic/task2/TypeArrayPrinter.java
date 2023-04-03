package eu.codeacademy.javaua2.generic.task2;

import java.util.Arrays;

public class TypeArrayPrinter<E> {

    public void printArray(E[] elements) {
        Arrays.stream(elements)
                .forEach(System.out::println);
    }
}
