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
 * http://oj.leetcode.com/problems/max-points-on-a-line/
 * @author zhangzhixiu
 *
 */
@RunWith(JUnit4.class)
public class MaxPointsOnALineTest
{
	private MaxPointsOnALine maxPointsOnALine;
	
	@Before
	public void init()
	{
		maxPointsOnALine = new MaxPointsOnALine();
	}
	
	@Test
	public void test1()
	{
		MaxPointsOnALine.Point[] p = {};
		Assert.assertEquals(0, maxPointsOnALine.maxPoints(p));
	}
	
	@Test
	public void test2()
	{
		MaxPointsOnALine.Point p1 = maxPointsOnALine.new Point(1,1);
		MaxPointsOnALine.Point p2 = maxPointsOnALine.new Point(1,1);
		MaxPointsOnALine.Point p3 = maxPointsOnALine.new Point(1,1);
		MaxPointsOnALine.Point[] p = {p1,p2,p3};
		Assert.assertEquals(3, maxPointsOnALine.maxPoints(p));
	}
	
	@Test
	public void test3()
	{
		MaxPointsOnALine.Point p1 = maxPointsOnALine.new Point(1,1);
		MaxPointsOnALine.Point p2 = maxPointsOnALine.new Point(1,2);
		MaxPointsOnALine.Point p3 = maxPointsOnALine.new Point(1,3);
		MaxPointsOnALine.Point[] p = {p1,p2,p3};
		Assert.assertEquals(3, maxPointsOnALine.maxPoints(p));
	}
	
	@Test
	public void test4()
	{
		MaxPointsOnALine.Point p1 = maxPointsOnALine.new Point(1,1);
		MaxPointsOnALine.Point p2 = maxPointsOnALine.new Point(2,2);
		MaxPointsOnALine.Point p3 = maxPointsOnALine.new Point(3,3);
		MaxPointsOnALine.Point p4 = maxPointsOnALine.new Point(3,4);
		MaxPointsOnALine.Point[] p = {p1,p2,p3,p4};
		Assert.assertEquals(3, maxPointsOnALine.maxPoints(p));
	}
	
	@Test
	public void test5()
	{
		MaxPointsOnALine.Point p1 = maxPointsOnALine.new Point(0,0);
		MaxPointsOnALine.Point p2 = maxPointsOnALine.new Point(1,0);
		MaxPointsOnALine.Point[] p = {p1,p2};
		Assert.assertEquals(2, maxPointsOnALine.maxPoints(p));
	}
}
