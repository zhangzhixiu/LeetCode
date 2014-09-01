/**
 *
 */
package com.github.zhangzhixiu.leetcode;

import java.util.Stack;

/**
 * @author zhangzhixiu
 *
 */
public class ReverseWordsInAString {
  public String reverseWords(String s) {
    String result = "";
    char[] c = s.toCharArray();
    Stack<String> stack = new Stack<String>();
    String str = "";
    for (int i = 0; i < c.length; i++) {
      if (c[i] == " ".charAt(0)) {
        push(stack, str);
        str = "";
      } else {
        str += String.valueOf(c[i]);
      }
    }
    push(stack, str);
    while (stack.size() > 0) {
      result += stack.pop();
      if (stack.size() != 0) {
        result += " ";
      }
    }
    return result;
  }

  private void push(Stack<String> stack, String str) {
    if (!str.equals(" ") && !str.equals("")) {
      stack.push(str);
    }
  }

}
