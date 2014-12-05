package com.github.zhangzhixiu.leetcode;

import java.util.Stack;

/**
 * Created by zhangzhixiu on 12/4/14.
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!min.empty()) {
            if (min.lastElement() >= x) {
                min.push(x);
            }
        }
        else {
            min.push(x);
        }
    }

    public void pop() {
        Integer top = stack.pop();
        if (min.lastElement().equals(top)) {
            min.pop();
        }
    }

    public int top() {
        return stack.lastElement();
    }

    public int getMin() {
        return min.lastElement();
    }

}
