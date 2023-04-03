package eu.codeacademy.javaua2.generic.task2;

import org.junit.jupiter.api.Test;

class TypeArrayPrinterTest {

    @Test
    void printArrayIntegers() {
        Integer[] ints = new Integer[]{1, 2, 3};
        new TypeArrayPrinter<Integer>().printArray(ints);
    }

    @Test
    void printArrayStrings() {
        String[] strings = new String[]{"Code", "Academy", "World"};
        new TypeArrayPrinter<String>().printArray(strings);
    }
}
