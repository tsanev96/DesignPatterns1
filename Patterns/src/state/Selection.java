package state;

public class Selection implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Draw a dashed rectangle");
    }

    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }
}
