package adapter.task.convert;

import adapter.task.Converter;

public class TxtConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("Convert txt");
    }
}
