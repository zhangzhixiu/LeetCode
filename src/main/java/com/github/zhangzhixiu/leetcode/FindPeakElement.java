/**
 *
 */
package com.github.zhangzhixiu.leetcode;

/**
 * @author zhangzhixiu
 *
 */
public class FindPeakElement {
  public int findPeakElement(int[] num) {
    for (int i = 0; i<num.length-1; i++) {
      if (num[i+1]<num[i]) {
        return i;
      }
    }
    return num.length-1;
  }
}
