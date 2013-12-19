/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhixiu
 * 
 */
public class MaxPointsOnALine
{
	public class Point
	{
		int x;
		int y;

		Point()
		{
			x = 0;
			y = 0;
		}

		Point(int a, int b)
		{
			x = a;
			y = b;
		}
	}

	public int maxPoints(Point[] points)
	{
		if(points.length==0)
			return 0;
		
		Map<Double, Integer> result = new HashMap<Double, Integer>();
		int max = 1;
		
		for(int i=0; i<points.length; i++)
		{
			result.clear();
			int vertical = 1;
			int duplicate = 1;
			
			for(int j=0; j<points.length; j++)
			{
				if(i==j) continue;
				if (points[j].x == points[i].x && points[j].y == points[i].y)
				{
					duplicate++;
					continue;
				}
				if((points[j].x - points[i].x) == 0)
				{
					vertical++;
				}
				else
				{
					Double key =  (0d + points[j].y - points[i].y) / (points[j].x - points[i].x);
					result.put(key, result.get(key)==null?1:result.get(key)+1);
				}
			}
			
			for(Integer value: result.values())
			{
				max = value+duplicate>max?value+duplicate:max;
			}
			max = vertical>max?vertical:max;
			max = duplicate>max?duplicate:max;
		}
		
		return max;
	}
}
