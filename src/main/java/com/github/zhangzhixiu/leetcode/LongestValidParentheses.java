/**
 *
 */
package com.github.zhangzhixiu.leetcode;

import java.util.Stack;

/**
 * @author zhangzhixiu
 *
 */
public class LongestValidParentheses {
  public int longestValidParentheses(String s) {
    char[] array = s.toCharArray();
    int count = 0;
    int max = 0;
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i<array.length; i++) {
      if (array[i]=='(') {
        stack.push('(');
      } else {
        if (stack.isEmpty()) {
          max = count>max ? count : max;
          count = 0;
          stack.clear();
        } else {
          stack.pop();
          count++;
          max = count>max ? count : max;
        }
      }
    }
    return max*2;
  }
}
