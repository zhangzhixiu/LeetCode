/**
 *
 */
package com.github.zhangzhixiu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhixiu
 *
 */
public class ReverseInteger {
  public int reverse(int x) {
    if (x == 0) {
      return 0;
    }
    Boolean isPositive = x > 0;
    if (!isPositive) {
      x=-x;
    }
    List<Integer> lst = new ArrayList<Integer>();
    while (x != 0) {
      lst.add(x % 10);
      x = x / 10;
    }
    int result = 0;
    int multi = 1;
    for (int i = lst.size() - 1; i >= 0; i--) {
      result = result + lst.get(i) * multi;
      multi *= 10;
    }
    if (!isPositive) {
      result *= (-1);
    }
    return result;
  }
}
