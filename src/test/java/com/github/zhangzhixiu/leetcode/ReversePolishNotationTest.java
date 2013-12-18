package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * http://oj.leetcode.com/problems/evaluate-reverse-polish-notation/
 * @author zhangzhixiu
 *
 */
@RunWith(JUnit4.class)
public class ReversePolishNotationTest
{
	private ReversePolishNotation rpn;
	
	@Before
	public void init()
	{
		rpn = new ReversePolishNotation();
	}
	
	@Test
	public void test()
	{
		String[] tokens = {"2", "1", "+", "3", "*"};
		Assert.assertEquals(9, rpn.evalRPN(tokens));
		
		String[] tokens2 = {"4", "13", "5", "/", "+"};
		Assert.assertEquals(6, rpn.evalRPN(tokens2));
	}
}
