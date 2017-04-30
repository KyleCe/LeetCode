package algorithm.easy;

import java.util.Stack;

/**
 * Created by Kyle on 25/04/2017.
 */
public class MinStack {

    Stack<Integer> mStack;
    Stack<Integer> mMinStack;
    int min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        mStack = new Stack<>();
        mMinStack = new Stack<>();
    }

    public void push(int x) {
        if (x < min) min = x;
        mStack.push(x);
        mMinStack.push(min);
    }

    public void pop() {
        if (mStack.isEmpty()) return;
        mStack.pop();
        mMinStack.pop();
        min = mMinStack.isEmpty() ? Integer.MAX_VALUE : mMinStack.peek();
    }

    public int top() {
        return mStack.peek();
    }

    public int getMin() {
        return min;
    }
}
