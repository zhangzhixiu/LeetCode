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
 * http://oj.leetcode.com/problems/two-sum/
 * @author zhangzhixiu
 *
 */
@RunWith(JUnit4.class)
public class TwoSumTest
{
	private TwoSum twoSum;
	
	@Before
	public void init()
	{
		twoSum = new TwoSum();
	}
	
	@After
	public void end()
	{
		twoSum = null;
	}
	
	@Test
	public void test()
	{
		int[] result = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
	}
}
