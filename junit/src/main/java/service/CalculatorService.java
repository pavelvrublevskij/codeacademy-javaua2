package service;


import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;

public class CalculatorService {


    public Integer findMaxValue(ArrayList<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        Integer maxNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number != null && number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }


    public Integer calculate(Integer firstNumber, Integer secondNumber, Character operation) {
        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Illegal operation " + operation);
        }
    }

    public Integer fibonacciSequence(int index) {

        if (index == 1 || index == 2) {
            return 1;
        }
        if (index < 1) {
            return -1;
        }
        Integer first = 1;
        Integer second = 1;
        for (int i = 2; i < index; i++) {
            Integer sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }

    public Pair<Double, Double> solveQuadraticEquation(Integer a, Integer b, Integer c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Ban input");
        }

        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            return new MutablePair<>(root1, root2);
        } else if (determinant == 0) {
            root1 = -b / (2 * a);
            return  new MutablePair<>(root1, null);
        } else {
            return new MutablePair<>(null, null);
        }
    }

}
