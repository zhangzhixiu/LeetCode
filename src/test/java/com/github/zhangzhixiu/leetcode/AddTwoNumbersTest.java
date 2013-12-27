package com.github.zhangzhixiu.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * http://oj.leetcode.com/problems/add-two-numbers/
 * @author zhangzhixiu 
 * 
 */
@RunWith(JUnit4.class)
public class AddTwoNumbersTest
{
	private AddTwoNumbers atn;

	@Before
	public void init()
	{
		atn = new AddTwoNumbers();
	}

	@After
	public void end()
	{
		atn = null;
	}

	private AddTwoNumbers.ListNode generate(int number)
	{
		AddTwoNumbers.ListNode head = null;
		AddTwoNumbers.ListNode temp = null;

		do
		{
			int i = number % 10;
			number /= 10;
			if(head==null)
			{
				head = atn.new ListNode(i);
				temp = head;
			}
			else
			{
				temp.next = atn.new ListNode(i);
				temp = temp.next;
			}
		}
		while (number != 0);

		return head;
	}
	
	private int value(AddTwoNumbers.ListNode head)
	{
		int value = 0;
		int m = 1;
		while(head!=null)
		{
			value += m*head.val;
			head = head.next;
			m *=10;
		}
		
		return value;
	}
	
	@Test
	public void test1()
	{
		AddTwoNumbers.ListNode h = atn.addTwoNumbers(generate(342), generate(465));
		Assert.assertEquals(807, value(h));
	}
	
	@Test
	public void test2()
	{
		AddTwoNumbers.ListNode h = atn.addTwoNumbers(generate(0), generate(1231));
		Assert.assertEquals(1231, value(h));
	}
	
	@Test
	public void test3()
	{
		AddTwoNumbers.ListNode h = atn.addTwoNumbers(generate(223), generate(432));
		Assert.assertEquals(655, value(h));
	}
	
	@Test
	public void test4()
	{
		AddTwoNumbers.ListNode h = atn.addTwoNumbers(generate(5), generate(5));
		Assert.assertEquals(10, value(h));
	}
}
