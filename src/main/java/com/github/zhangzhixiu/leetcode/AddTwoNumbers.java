/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

/**
 * @author zhangzhixiu
 * 
 */
public class AddTwoNumbers
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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode head = null;
		ListNode temp = null;
		while(l1!=null||l2!=null)
		{
			if(l1!=null&&l2!=null)
			{
				if(temp!=null)
				{
					temp.next = new ListNode(l1.val+l2.val);
					temp = temp.next;
				}
				else
				{
					head = new ListNode(l1.val+l2.val);
					temp = head;
				}
			}
			else if(l1==null)
			{
				if(temp!=null)
				{
					temp.next = new ListNode(l2.val);
					temp = temp.next;
				}
				else
				{
					head = new ListNode(l2.val);
					temp = head;
				}
			}
			else if(l2==null)
			{
				if(temp!=null)
				{
					temp.next = new ListNode(l1.val);
					temp = temp.next;
				}
				else
				{
					head = new ListNode(l1.val);
					temp = head;
				}
			}
			
			if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;
		}
		
		temp = head;
		Boolean f = false;
		while(temp!=null)
		{
			if(f)
			{
				temp.val = temp.val+1;
			}
			f = false;
			if(temp.val>9)
			{
				f = true;
				temp.val = temp.val-10;
			}
			
			if(temp.next==null&&f)
			{
				temp.next = new ListNode(1);
				f = false;
			}
			
			temp = temp.next;
		}
		
		return head;
	}
}
