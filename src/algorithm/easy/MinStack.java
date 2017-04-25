package algorithm.easy;

import java.util.Stack;

/**
 * Created by Kyle on 25/04/2017.
 */
public class MinStack {

    Stack<Integer> mStack;
    Stack<Integer> mMinStack;
    int min = Integer.MIN_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        mStack = new Stack<>();
        mMinStack = new Stack<>();
    }

    public void push(int x) {
        if(x < min) {
            min = x;
            mMinStack.push(min);
        }
        mStack.push(x);
    }

    public void pop() {
        int popValue = mStack.pop();
        if (popValue == min) {
            mMinStack.pop();
            if(!mMinStack.empty()){
                min = mMinStack.pop();
                mMinStack.push(min);
            }
        }
    }

    public int top() {
        int top = mStack.pop();
        mStack.push(top);
        return top;
    }

    public int getMin() {
        return min;
    }
}

