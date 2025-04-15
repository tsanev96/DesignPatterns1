package strategy;

public class GrayScaleFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying grayscale filter" + fileName);
    }
}
