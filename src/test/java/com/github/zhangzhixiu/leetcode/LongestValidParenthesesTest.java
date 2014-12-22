/**
 *
 */
package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author zhangzhixiu
 *
 */
@RunWith(JUnit4.class)
public class LongestValidParenthesesTest {

  private LongestValidParentheses lvp;

  @Before
  public void init() {
    lvp = new LongestValidParentheses();
  }

  @Test
  public void test() {
    Assert.assertEquals(0, lvp.longestValidParentheses("("));
    Assert.assertEquals(2, lvp.longestValidParentheses("(()"));
    Assert.assertEquals(2, lvp.longestValidParentheses("()(()"));
    Assert.assertEquals(4, lvp.longestValidParentheses(")()())"));
  }
}
