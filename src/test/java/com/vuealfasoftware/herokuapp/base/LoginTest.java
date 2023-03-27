package com.vuealfasoftware.herokuapp.base;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void test(){
        driver.get("https://vue-alfabank-demo.web.app/login");
    }

}
