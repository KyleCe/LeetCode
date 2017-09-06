package test.draft;

import java.util.*;

public class ForEachClass implements Iterable<String> {
    private String[] mWords = {"Hello", "world", "Java"};

    @Override
    public Iterator iterator() {
        return new Iterator<String>() {
            private int index = 0;

            public boolean hasNext() {
                return index < mWords.length;
            }

            public String next() {
                return mWords[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}
