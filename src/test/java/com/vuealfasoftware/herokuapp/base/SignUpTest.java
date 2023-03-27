package com.vuealfasoftware.herokuapp.base;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void test(){
        driver.get("https://vue-alfabank-demo.web.app/sign-up");
    }
}
