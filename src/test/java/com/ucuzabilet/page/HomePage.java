package com.ucuzabilet.page;

import com.ucuzabilet.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;

    public HomePage() {methods = new Methods();}

    public void homePageControl(){
        methods.waitBySecond(2);
        Assert.assertTrue(methods.isElementVisible(By.id("ub-ets-logo")));
    }

    public void whereToFrom(){
        methods.sendKeys(By.id("from_text"),"izm");
        methods.waitBySecond(1);
        methods.click(By.className("ui-menu-item"));
        methods.waitBySecond(3);
    }




}
