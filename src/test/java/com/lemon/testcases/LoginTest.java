package com.lemon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @Project: jenkins_maven_test
 * @Create: 2021-06-19 19:22
 * @Desc： 登录用例
 **/
public class LoginTest {

    @BeforeMethod
    public void setup(){
        System.out.println("测试开始");
    }

    @Test
    public void loginTest(){
        System.out.println("登录成功");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("测试结束");
    }
}
