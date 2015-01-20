package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {

    private LargestNumber ln;

    @Before
    public void setUp() throws Exception {
        ln = new LargestNumber();
    }

    @Test
    public void testLargestNumber() throws Exception {
        Assert.assertEquals("0", ln.largestNumber(new int[]{0, 0}));
        Assert.assertEquals("10", ln.largestNumber(new int[]{1, 0}));
        Assert.assertEquals("4321", ln.largestNumber(new int[]{4, 32, 1}));
        Assert.assertEquals("9879876", ln.largestNumber(new int[]{9876, 987}));
        Assert.assertEquals("9879987", ln.largestNumber(new int[]{9879, 987}));
        Assert.assertEquals("987987", ln.largestNumber(new int[]{987, 987}));
    }
}
