/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

/**
 * @author zhangzhixiu
 * 
 */
public class MedianOfTwoSortedArrays
{
	public double findMedianSortedArrays(int A[], int B[])
	{
		int sizeA = A.length;
		int sizeB = B.length;
		int total = sizeA + sizeB;
		if (total % 2 == 1)
			return findKth(A, 0, sizeA, B, 0, sizeB,
					total / 2 + 1);
		else
			return (findKth(A, 0, sizeA, B, 0, sizeB, total / 2) + findKth(A,
					0, sizeA, B, 0, sizeB, total / 2 + 1)) / 2.0;
	}

	private int findKth(int A[], int startA, int i, int B[], int startB, int j,
			int k)
	{
		if (i > j)
			return findKth(B, startB, j, A, startA, i, k);// modify
		if (i == 0)
			return B[startB + k - 1];
		if (k == 1)
			return A[startA] > B[startB] ? B[startB] : A[startA];
		// divide k into two parts
		int ia = k / 2 > i ? i : k / 2;
		int ib = k - ia;
		if (A[startA + ia - 1] < B[startB + ib - 1])
			return findKth(A, startA + ia, i - ia, B, startB, j, k - ia);
		else if (A[startA + ia - 1] > B[startB + ib - 1])
			return findKth(A, startA, i, B, startB + ib, j - ib, k - ib);
		else
			return A[startA + ia - 1];
	}
}
