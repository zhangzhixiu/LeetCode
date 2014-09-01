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
 * https://oj.leetcode.com/problems/reverse-words-in-a-string/
 * 
 * @author zhangzhixiu
 *
 */
@RunWith(JUnit4.class)
public class ReverseWordsInAStringTest {

  private ReverseWordsInAString rws;

  @Before
  public void init() {
    rws = new ReverseWordsInAString();
  }

  @Test
  public void testEmpty() {
    String a = "";
    Assert.assertEquals("", rws.reverseWords(a));
  }

  @Test
  public void testBlank() {
    String a = " ";
    Assert.assertEquals("", rws.reverseWords(a));
  }

  @Test
  public void testOneWord() {
    String a = "a";
    Assert.assertEquals("a", rws.reverseWords(a));
  }

  @Test
  public void testNormal() {
    String a = "a b c";
    Assert.assertEquals("c b a", rws.reverseWords(a));
  }

  @Test
  public void testMultiBlank() {
    String a = "a   b";
    Assert.assertEquals("b a", rws.reverseWords(a));
  }

  @Test
  public void testInitialBlank() {
    String a = " a";
    Assert.assertEquals("a", rws.reverseWords(a));
  }

  @Test
  public void testLastBlank() {
    String a = "a ";
    Assert.assertEquals("a", rws.reverseWords(a));
  }
}
