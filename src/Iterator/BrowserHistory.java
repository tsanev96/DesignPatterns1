package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void add(String url) {
        urls.add(url);
    }

    public void pop() {
        urls.removeLast();
    }

    public ListIterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {
        private final BrowserHistory history;
        private int index = 0;

        public ListIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
