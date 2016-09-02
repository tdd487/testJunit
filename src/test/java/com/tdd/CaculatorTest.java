package com.tdd;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/2.
 */
public class CaculatorTest {
    private static  Calculator calculator;

    private static Exception ex;
    @BeforeClass
    public static void BuildCaculator(){
        calculator = new Calculator();
        ex = new Exception("手动抛出异常！");
    }

    @Test(expected = Exception.class)
    public void testCalculator() throws Exception {
        Assert.assertEquals(10,calculator.add(2,8));
        throw ex;
    }
}
