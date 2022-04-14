package com.testng;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class BaseApiTest {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.port = 443;
        RestAssured.basePath = "/api";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
