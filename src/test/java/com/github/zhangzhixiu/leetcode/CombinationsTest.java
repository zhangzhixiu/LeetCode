/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://oj.leetcode.com/problems/combinations/
 * 
 * @author zhangzhixiu
 * 
 */
public class CombinationsTest
{
	private Combinations c;

	@Before
	public void init()
	{
		c = new Combinations();
	}

	@Test
	public void test1()
	{
		Assert.assertEquals(1, c.combine(1, 1).size());
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(45, c.combine(10, 2).size());
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(252, c.combine(10, 5).size());
	}
}
