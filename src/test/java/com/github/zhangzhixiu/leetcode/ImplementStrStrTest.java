/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * http://oj.leetcode.com/problems/implement-strstr/
 * @author zhangzhixiu
 * 
 */
@RunWith(JUnit4.class)
public class ImplementStrStrTest
{
	private ImplementStrStr iss;
	
	@Before
	public void init()
	{
		iss = new ImplementStrStr();
	}
	
	@After
	public void end()
	{
		iss = null;
	}
	
	@Test
	public void test()
	{
		Assert.assertEquals("c", iss.strStr("abcdef", "cde"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("a", iss.strStr("a", "a"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("", iss.strStr("", ""));
	}
}
