package com.vuealfasoftware.herokuapp.base;

import org.testng.annotations.Test;

public class LoginTest extends TestUtilities{

    @Test
    public void test(){
        sleep(3000);
        driver.get("https://vue-alfabank-demo.web.app/login");
    }

}
