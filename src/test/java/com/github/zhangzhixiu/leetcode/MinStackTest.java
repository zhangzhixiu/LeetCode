package com.github.zhangzhixiu.leetcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by zhangzhixiu on 12/4/14.
 */
@RunWith(JUnit4.class)
public class MinStackTest {
    private MinStack ms;

    @Before
    public void init() {
        ms = new MinStack();
    }

    @After
    public void end() {

    }

    @Test
    public void testPush() {
        ms.push(1);
        Assert.assertEquals(1, ms.top());
        Assert.assertEquals(1, ms.getMin());
    }

    @Test
    public void testMin() {
        ms.push(1);
        ms.push(2);
        ms.push(3);
        Assert.assertEquals(1, ms.getMin());
        ms.push(-1);
        Assert.assertEquals(-1, ms.getMin());
        ms.pop();
        Assert.assertEquals(1, ms.getMin());
    }
}
