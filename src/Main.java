import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        Main.memento();
    }

    public static void memento() {
        // Memento pattern
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


}