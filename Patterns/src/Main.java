import Iterator.BrowserHistory;
import Iterator.Iterator;
import memento.Editor;
import memento.History;
import state.Brush;
import state.Canvas;
import state.Eraser;
import state.Selection;

public class Main {
    public static void main(String[] args) {
        // Simplicity is the ultimate sophistication

//        Main.memento();
//        Main.state();
        Main.iterator();


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

    public static void iterator() {
        var browserHistory = new BrowserHistory();
        browserHistory.add("google.com");
        browserHistory.add("stackoverflow.com");
        browserHistory.add("youtube.com");
//        browserHistory.pop();

        Iterator<String> iterator = browserHistory.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}