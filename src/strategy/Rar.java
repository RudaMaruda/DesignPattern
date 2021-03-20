package strategy;

import java.io.File;
import java.util.List;

public class Rar implements CompressionStrategy{
    @Override
    public void compressFiles(List<File> files) {
        System.out.println("File has been compressed to RAR");

    }
}
