package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by zhangzhixiu on 12/5/14.
 */
@RunWith(JUnit4.class)
public class PlusOneTest {
    private PlusOne po;

    @Before
    public void init() {
        po = new PlusOne();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{9, 8}, po.plusOne(new int[]{9, 7}));
        Assert.assertArrayEquals(new int[]{1, 0, 0}, po.plusOne(new int[]{9, 9}));
    }
}
