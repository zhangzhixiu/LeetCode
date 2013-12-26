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
 * http://oj.leetcode.com/problems/median-of-two-sorted-arrays/
 * @author zhangzhixiu
 * 
 */
@RunWith(JUnit4.class)
public class MedianOfTwoSortedArraysTest
{
	private MedianOfTwoSortedArrays mtsa;
	
	@Before
	public void init()
	{
		this.mtsa = new MedianOfTwoSortedArrays();
	}
	
	@Test
	public void test1()
	{
		int[] a = {1,2,3,4,5};
		int[] b = {2,3,4};
		
		Assert.assertEquals(3, (int)mtsa.findMedianSortedArrays(a, b));
	}

	@Test
	public void test2()
	{
		int[] a = {};
		int[] b = {1,2,3,4,5};
		
		Assert.assertEquals(3, (int)mtsa.findMedianSortedArrays(a, b));
	}
	
	@Test
	public void test3()
	{
		int[] a = {1};
		int[] b = {2,3,4,5,6};
		
		Assert.assertEquals(3.5, mtsa.findMedianSortedArrays(a, b), 0.01);
	}
}
