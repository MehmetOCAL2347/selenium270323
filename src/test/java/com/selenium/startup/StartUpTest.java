package com.selenium.startup;

import org.testng.annotations.Test;

public class StartUpTest {

    @Test
    public void startUpTest(){
        System.out.println("Step-1: Check Chrome Version");
        System.out.println("Step-2: Check Firefox Version");
        System.out.println("Step-3: Download chrome and firefox driver");
        System.out.println("Step-4: Add driver to src -> main -> resources");
        System.out.println("Step-5: If your chrome version is (111.0.5563.65) so add dependency below;");
        System.out.println("<dependency>\n" +
                                    "    <groupId>org.seleniumhq.selenium</groupId>\n" +
                                    "    <artifactId>selenium-http-jdk-client</artifactId>\n" +
                                    "    <version>4.8.1</version>\n" +
                                    "</dependency>");
        System.out.println("Step-6: Add property to your project below;");
        System.out.println("System.setProperty(\"webdriver.http.factory\", \"jdk-http-client\");");
        System.out.println("Step-7: You should check java and other dependency versions on pom.xml to prevent any version errors");
    }

}
