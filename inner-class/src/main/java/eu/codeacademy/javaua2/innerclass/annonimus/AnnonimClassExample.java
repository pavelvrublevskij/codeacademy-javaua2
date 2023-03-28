package eu.codeacademy.javaua2.innerclass.annonimus;

public class AnnonimClassExample {

    private int doMathSum(int first, int second) {
        class MathSum implements TwoDigits {
            @Override
            public int withTwoDigits(int first, int second) {
                return first + second;
            }
        }

        MathSum mathSum = new MathSum();
        return mathSum.withTwoDigits(first, second);
    }

    public void init() {
        System.out.println(doMathSum(2, 5));
    }
}
