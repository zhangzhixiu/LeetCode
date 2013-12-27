/**
 * 
 */
package com.github.zhangzhixiu.leetcode;

/**
 * @author zhangzhixiu
 *
 */
public class ImplementStrStr
{
	public String strStr(String haystack, String needle)
	{
		if(haystack==null||needle==null) return null;
		if("".equals(haystack)&&"".equals(needle)) return "";
		int index = haystack.indexOf(needle);
        return index<0?null:haystack.substring(index, index+1);
    }
}
