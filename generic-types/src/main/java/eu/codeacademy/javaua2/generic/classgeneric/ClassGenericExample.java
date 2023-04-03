package eu.codeacademy.javaua2.generic.classgeneric;

public class ClassGenericExample {

    public void init() {
        Box box = new Box();
        box.setObject(10);

        Integer number = (Integer) box.getObject();  // all ok
        System.out.println(number);

        box.setObject("Labas");

        String text = (String) box.getObject();  // all ok
        System.out.println(text);

        Integer number2 = (Integer) box.getObject();  // Runtime Exception of class cast exception
        System.out.println(number2);
    }
}
