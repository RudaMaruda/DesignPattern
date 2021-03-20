package adapter.task.convert;

import adapter.task.Converter;

public class DocConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("Convert doc");
    }
}
