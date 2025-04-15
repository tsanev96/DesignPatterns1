package strategy;

public class Demo {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new AES());
        chatClient.send("hello world");
    }
}
