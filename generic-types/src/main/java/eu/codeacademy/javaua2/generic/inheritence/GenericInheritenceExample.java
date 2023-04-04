package eu.codeacademy.javaua2.generic.inheritence;

import eu.codeacademy.javaua2.generic.classgeneric.Box;

import java.io.Serializable;

public class GenericInheritenceExample {

    public void init() {
        draw(new Square());
        draw(new Rectangle());
        draw(new String());
        draw(new Figure(){});

        drawAsGeneric(new Square());
        drawAsGeneric(new Rectangle());
        drawAsGeneric(new String());

        drawAsGeneric2(new Box<Square>());
        drawAsGeneric2(new Box<Rectangle>());
        drawAsGeneric2(new Box<String>());
        drawAsGeneric2(new Box<Figure>());

        drawAsGeneric3(new Box<Square>());
        drawAsGeneric3(new Box<Rectangle>());
        drawAsGeneric3(new Box<String>());
        drawAsGeneric3(new Box<Figure>());

        drawAsGeneric4(new Box<Square>());
        drawAsGeneric4(new Box<Rectangle>());
        drawAsGeneric4(new Box<String>());
        drawAsGeneric4(new Box<Figure>());
    }

    private void draw(Figure figure) {
        //
    }


    private <T> void drawAsGeneric(T figure) {
        //
    }

    private void drawAsGeneric2(Box<Figure> figure) {
        //
    }

    private void drawAsGeneric3(Box<? extends Figure> figure) {  // same as private <T> void drawAsGeneric3(Box<T> figure)
        //
    }

    private void drawAsGeneric4(Box<? super Square> figure) {  // same as private <T> void drawAsGeneric3(Box<T> figure)
        //
    }
}
