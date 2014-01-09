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
public class SqrtTest
{
	private Sqrt s;
	
	@Before
	public void init()
	{
		s = new Sqrt();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, s.sqrt(1));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, s.sqrt(0));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(5, s.sqrt(30));
	}
}
