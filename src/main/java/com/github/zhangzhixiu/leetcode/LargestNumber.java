package com.github.zhangzhixiu.leetcode;

import java.util.*;

/**
 * Created by zhangzhixiu on 15/1/20.
 */
public class LargestNumber {

    public String largestNumber(int[] num) {
        List<char[]> list = new ArrayList<>(num.length);
        for (Integer i : num) {
            list.add(String.valueOf(i).toCharArray());
        }
        Collections.sort(list, new Comparator<char[]>() {
            @Override
            public int compare(char[] o1, char[] o2) {
                int max = o1.length > o2.length ? o1.length : o2.length;
                int min = o1.length < o2.length ? o1.length : o2.length;
                for (int i = 0; i < max; i++) {
                    if (i < min) {
                        int compare = Integer.valueOf(o1[i]) - Integer.valueOf(o2[i]);
                        if (compare != 0) {
                            return -compare;
                        }
                    } else {
                        return compare(o1.length == max ? Arrays.copyOfRange(o1, min, max) : o1, o2.length == max ? Arrays.copyOfRange(o2, min, max) : o2);
                    }
                }
                return 0;
            }
        });

        String result = "";
        Boolean init = true;
        for (char[] chars : list) {
            if (init && chars[0] == '0') {
                return "0";
            }
            init = false;
            result += String.valueOf(chars);
        }

        return result;
    }
}
