package com.github.zhangzhixiu.leetcode;

/**
 * Created by zhangzhixiu on 12/22/14.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String result = "";
        while(n>0){
            result = (char)((n-1)%26+65)+result;
            n = (n-1)/26;
        }
        return result;
    }
}
