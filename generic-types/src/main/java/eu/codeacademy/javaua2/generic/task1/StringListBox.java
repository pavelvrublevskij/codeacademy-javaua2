package eu.codeacademy.javaua2.generic.task1;

import java.util.List;

public class StringListBox implements ListBox<String> {

    private List<String> stringValues;


    public StringListBox(List<String> stringValues) {
        this.stringValues = stringValues;
    }

    @Override
    public void addElements(String[] values) {
        stringValues.addAll(List.of(values));
    }

    @Override
    public void addElement(String value) {
        this.stringValues.add(value);
    }

    @Override
    public List<String> getElements() {
        return this.stringValues;
    }
}
