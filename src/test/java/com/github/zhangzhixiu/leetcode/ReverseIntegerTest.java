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
 * https://oj.leetcode.com/problems/reverse-integer/
 * 
 * @author zhangzhixiu
 *
 */
@RunWith(JUnit4.class)
public class ReverseIntegerTest {
  private ReverseInteger ri;

  @Before
  public void init() {
    ri = new ReverseInteger();
  }

  @Test
  public void testZero() {
    Assert.assertEquals(0, ri.reverse(0));
  }

  @Test
  public void testNormal() {
    Assert.assertEquals(123, ri.reverse(321));
  }

  @Test
  public void test10X() {
    Assert.assertEquals(1, ri.reverse(10));
  }

  @Test
  public void testNagetive() {
    Assert.assertEquals(-123, ri.reverse(-321));
  }
}
