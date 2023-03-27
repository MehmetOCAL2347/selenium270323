package com.vuealfasoftware.herokuapp.base;

public class TestUtilities extends BaseTest{

    protected void sleep(int duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
