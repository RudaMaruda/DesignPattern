package adapter.task;

import adapter.task.convert.DocConverter;
import adapter.task.convert.HtmlConverter;
import adapter.task.convert.TxtConverter;

public class AllToPdfAdapter implements Adapter{

    // obiekt wejsciowy - w naszym przypadki DocConverter, HtmlConverter lub TxtConverter
    private Converter converter;

    public AllToPdfAdapter(Converter converter) {
        this.converter = converter;
    }

    @Override
    public void convertFromAdapter() {
        this.converter.convert();
    }
}
