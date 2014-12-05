package com.github.zhangzhixiu.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhixiu on 12/5/14.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        Boolean flag = true;
        int index = digits.length;
        while(flag){
            index--;
            if(digits[index]==9){
                digits[index]=0;
                if(index==0){
                    int[] result = new int[digits.length+1];
                    result[0] = 1;
                    for(int i=1; i<result.length-1; i++){
                        result[i] = digits[i-1];
                    }
                    return result;
                }
            }else {
                digits[index] = digits[index] + 1;
                flag = false;
            }
        }
        return digits;
    }
}
