/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

import java.util.ArrayList;

/**
 * @author zhangzhixiu
 * 
 */
public class Combinations
{
	public ArrayList<ArrayList<Integer>> combine(int n, int k)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		dfs(n, k, 1, 0, path, result);
		return result;
	}

	private void dfs(int n, int k, int start, int cur, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result)
	{
		if (cur == k)
		{
			result.add(new ArrayList<Integer>(path));
		}
		for (int i = start; i <= n; ++i)
		{
			path.add(i);
			dfs(n, k, i + 1, cur + 1, path, result);
			path.remove(path.size() - 1);
		}
	}
}
