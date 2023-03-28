package eu.codeacademy.javaua2.innerclass.annonimus;

public class AnnonimClassExample {

    public void init() {
        this.doMath(
                new TwoDigits() {
                    @Override
                    public int withTwoDigits(int first, int second) {
                        return first + second;
                    }
                }
        );
    }

    private void doMath(TwoDigits twoDigits) {
        System.out.println(twoDigits.withTwoDigits(2, 5));
    }
}
