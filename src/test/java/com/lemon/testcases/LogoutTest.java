package com.lemon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @Project: jenkins_maven_test
 * @Create: 2021-06-19 21:22
 * @Desc：
 **/
public class LogoutTest {

    @BeforeMethod
    public void setup(){
        System.out.println("测试开始");
    }

    @Test
    public void logout(){
        System.out.println("退出登录");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("测试结束");
    }
}
