package com.github.zhangzhixiu.leetcode;

/**
 * Created by zhangzhixiu on 12/28/14.
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost){
        int[] diff = new int[gas.length];
        for(int i=0; i<diff.length; i++){
            diff[i] = gas[i]-cost[i];
        }
        int total = 0;
        int index = -1;
        int sum = 0;
        for (int i=0; i<diff.length; i++){
            sum +=diff[i];
            total += diff[i];
            if(sum<0){
                index = i;
                sum = 0;
            }
        }

        return total>=0?index+1:-1;
    }
}
