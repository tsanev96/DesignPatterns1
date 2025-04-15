package template;

public class ChatWindow extends Window {
    public ChatWindow() {}

    @Override
    protected void onClosed() { System.out.println("Chat window closed"); }

    @Override
    protected void onClosing() { System.out.println("Some action before chat window is closed"); }
}
