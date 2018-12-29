package algorithm.easy;

import java.util.Collection;

public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private int index = 0;

    private static final int DEFAULT_CAP = 10;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_CAP];
    }

    private E pop(){
        return elements[index];
    }

    public void push(E e){
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void pushAll(Iterable<? extends E> src){
        for(E e:src) push(e);
    }

    public void popAll(Collection<? super E> dst){
        while (!isEmpty()){
            dst.add(pop());
        }
    }

    //... other code
}
