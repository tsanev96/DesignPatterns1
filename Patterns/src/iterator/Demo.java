package iterator;

public class Demo {
    public static void main(String[] args) {
        var browserHistory = new BrowserHistory();
        browserHistory.add("google.com");
        browserHistory.add("stackoverflow.com");
        browserHistory.add("youtube.com");
//      browserHistory.pop();

        Iterator<String> iterator = browserHistory.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
