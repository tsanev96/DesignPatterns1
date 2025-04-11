import memento.Editor;
import memento.History;
import state.Brush;
import state.Canvas;
import state.Eraser;
import state.Selection;

public class Main {
    public static void main(String[] args) {
//        Main.memento();
        Main.state();
    }

    public static void memento() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.add(editor.createState()); // saving content in history

        editor.setContent("b");
        history.add(editor.createState());

        editor.setContent("c");
//        history.add(editor.createState());

        editor.restore(history.pop()); // previous state
        System.out.println(editor.getContent()); // b
    }

    public static void state() {
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