package strategy;

import java.io.File;
import java.util.List;

public class CompresionContext {
    private CompressionStrategy compressionStrategy;

    public CompresionContext setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
        return this;
    }

    public void createArchieve(List<File> files ){

        compressionStrategy.compressFiles(files);
    }
}
