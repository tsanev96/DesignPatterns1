package Iterator;

public class BrowserHistory {
//    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count = 0;

    public void add(String url) {
        if (count < urls.length) {
            urls[count++] = url;
        }
    }

    public String pop() {
        return urls[--count];
    }

//    public ListIterator createIterator() {
//        return new ListIterator(this);
//    }

    public ArrayIterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {
        private final BrowserHistory history;
        private int index = 0;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.length && history.urls[index] != null;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

    // Why nested class ? This is part of the implementation of the browse history class
//    public class ListIterator implements Iterator<String> {
//        private final BrowserHistory history;
//        private int index = 0;
//
//        public ListIterator(BrowserHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return index < history.urls.size();
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
}
