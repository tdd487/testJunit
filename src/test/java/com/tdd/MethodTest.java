package com.tdd;

import org.junit.*;

/**
 * Created by Administrator on 2016/9/2.
 */
public class MethodTest {

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("beforeClass...");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("afterClass...");
    }

    @Before
    public void setUp(){
        System.out.println("before..");
    }

    @After
    public void tearDown(){
        System.out.println("after...");
    }

    @Test()
    public void test1(){
        System.out.println("test1...");
    }

    @Test()
    public void test2(){
        System.out.println("test2...");
    }

}
