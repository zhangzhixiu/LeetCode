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
public class LRUCacheTest {

  private LRUCache lc;

  @Before
  public void init() {
    lc = new LRUCache(5);
  }

  @Test
  public void testGetNormal() {
    lc.clear();
    lc.set(1, 100);
    Assert.assertEquals(100, lc.get(1));
  }

  @Test
  public void testGetNotExist() {
    lc.clear();
    Assert.assertEquals(-1, lc.get(1));
  }

  @Test
  public void testGetExpired() {
    lc.clear();
    lc.set(1, 100);
    lc.set(2, 200);
    lc.set(3, 300);
    lc.set(4, 400);
    lc.set(5, 500);
    lc.set(6, 600);
    Assert.assertEquals(-1, lc.get(1));
    Assert.assertEquals(200, lc.get(2));
  }
}
