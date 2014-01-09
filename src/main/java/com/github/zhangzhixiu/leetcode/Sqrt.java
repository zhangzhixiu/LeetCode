/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

/**
 * @author zhangzhixiu
 * 
 */
public class Sqrt
{
	public int sqrt(int x)
	{
		return (int)Math.sqrt(x);
		
//		if (x < 2) return x;
//		int left = 1, right = x / 2;
//		int last_mid = 0;
//		
//		while (left <= right)
//		{
//			int mid = left + (right - left) / 2;
//			if (x / mid > mid)
//			{
//				left = mid + 1;
//				last_mid = mid;
//			}
//			else if (x / mid < mid)
//			{
//				right = mid - 1;
//			}
//			else
//			{
//				return mid;
//			}
//		}
//		return last_mid;

	}
}
