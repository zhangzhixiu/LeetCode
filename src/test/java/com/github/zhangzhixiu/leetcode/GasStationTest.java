package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by zhangzhixiu on 12/28/14.
 */
@RunWith(JUnit4.class)
public class GasStationTest {

    private GasStation gs;

    @Before
    public void init(){
        gs = new GasStation();
    }

    @Test
    public void testOne(){
        Assert.assertEquals(0, gs.canCompleteCircuit(new int[]{2}, new int[]{1}));
    }

    @Test
    public void testTwoNode(){
        Assert.assertEquals(1, gs.canCompleteCircuit(new int[]{1, 100}, new int[]{50, 2}));
    }

    @Test
    public void testTwoNode2(){
        Assert.assertEquals(0, gs.canCompleteCircuit(new int[]{100, 1}, new int[]{50, 50}));
    }

    @Test
    public void testTwoNodeFailure(){
        Assert.assertEquals(-1, gs.canCompleteCircuit(new int[]{10, 10}, new int[]{100, 100}));
    }
}
