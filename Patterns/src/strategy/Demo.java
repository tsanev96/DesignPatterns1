package strategy;

public class Demo {
    public static void main(String[] args) {
        var storage = new ImageStorage();
        var fileName = "image.jpg";
        storage.store(
                fileName,
                new JPEGCompressor(),
                new BlackAndWhiteFilter()
        );
        storage.store(
                fileName,
                new PNGCompressor(),
                new BlackAndWhiteFilter()
        );
    }
}
