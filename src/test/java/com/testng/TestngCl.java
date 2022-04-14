package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestngCl {
//    @Test
//    public void test(){
//        System.out.println("Test Cases");
//        Assert.assertFalse(false);
//    }


@Test

public void test_1(){
           given().
                   get("https://reqres.in/api/users?page=2").
                   then() .
                   statusCode(200);



     }
}