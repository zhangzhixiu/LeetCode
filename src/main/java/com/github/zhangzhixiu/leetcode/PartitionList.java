/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

/**
 * @author zhangzhixiu
 * 
 */
public class PartitionList
{
	public class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
			next = null;
		}
	}

	public ListNode partition(ListNode head, int x)
	{
		ListNode temp = head;
		ListNode lastLess = null;
		ListNode firstGreater = null;
		ListNode lastGreater = null;
		while(temp!=null)
		{
			if(temp.val>=x)
			{
				if(firstGreater==null) firstGreater = temp;
				lastGreater = temp;
			}
			else//val<x
			{
				if(firstGreater!=null)
				{
					if(lastLess==null)
					{
						head = temp;
						lastGreater.next = temp.next;
						head.next = firstGreater;
						lastLess = head;
					}
					else
					{
						lastLess.next = temp;
						lastGreater.next = temp.next;
						temp.next = firstGreater;
						lastLess = temp;
					}
				}
				else//firstGreater==null
				{
					lastLess = temp;
				}
			}
			temp = temp.next;
		}
		
		return head;
	}
}
