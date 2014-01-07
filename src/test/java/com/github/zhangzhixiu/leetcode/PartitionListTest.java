/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://oj.leetcode.com/problems/partition-list/
 * @author zhangzhixiu
 */
public class PartitionListTest
{
	private PartitionList plt;
	
	@Before
	public void init()
	{
		plt = new PartitionList();
	}
	
	@Test
	public void test1()
	{
		PartitionList.ListNode ln1 = plt.new ListNode(3);
		PartitionList.ListNode ln2 = plt.new ListNode(1);
		PartitionList.ListNode ln3 = plt.new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		
		PartitionList.ListNode head = plt.partition(ln1, 2);
		Assert.assertEquals(1, head.val);
		Assert.assertEquals(3, head.next.val);
		Assert.assertEquals(5, head.next.next.val);
	}
	
	@Test
	public void test2()
	{
		PartitionList.ListNode ln1 = plt.new ListNode(1);
		PartitionList.ListNode ln2 = plt.new ListNode(5);
		PartitionList.ListNode ln3 = plt.new ListNode(3);
		ln1.next = ln2;
		ln2.next = ln3;
		
		PartitionList.ListNode head = plt.partition(ln1, 2);
		Assert.assertEquals(1, head.val);
		Assert.assertEquals(5, head.next.val);
		Assert.assertEquals(3, head.next.next.val);
	}
	
	@Test
	public void test3()
	{
		PartitionList.ListNode ln1 = plt.new ListNode(2);
		PartitionList.ListNode ln2 = plt.new ListNode(3);
		PartitionList.ListNode ln3 = plt.new ListNode(1);
		ln1.next = ln2;
		ln2.next = ln3;
		
		PartitionList.ListNode head = plt.partition(ln1, 2);
		Assert.assertEquals(1, head.val);
		Assert.assertEquals(2, head.next.val);
		Assert.assertEquals(3, head.next.next.val);
	}
}
