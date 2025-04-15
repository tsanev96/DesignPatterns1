package state;

public class Demo {
    public static void main(String[] args) {
        // Open closed principles - classes should be open for extensions but closed for modification.
        // Adding new functionality without changing the existing code, supporting new function by adding new classes.
        var canvas = new Canvas();

        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
