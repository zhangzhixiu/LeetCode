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
public class FindPeakElementTest {

  private FindPeakElement fpe;

  @Before
  public void init(){
    fpe = new FindPeakElement();
  }

  @Test
  public void test() {
    Assert.assertEquals(0, fpe.findPeakElement(new int[] {2, 1}));
  }
}
