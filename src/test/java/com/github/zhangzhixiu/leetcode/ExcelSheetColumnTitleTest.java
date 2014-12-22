package com.github.zhangzhixiu.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by zhangzhixiu on 12/22/14.
 */
@RunWith(JUnit4.class)
public class ExcelSheetColumnTitleTest {
    private ExcelSheetColumnTitle esct;

    @Before
    public void init(){
        this.esct = new ExcelSheetColumnTitle();
    }

    @Test
    public void testOne(){
        Assert.assertEquals("A", esct.convertToTitle(1));
        Assert.assertEquals("Z", esct.convertToTitle(26));
        Assert.assertEquals("AA", esct.convertToTitle(27));
    }
}
