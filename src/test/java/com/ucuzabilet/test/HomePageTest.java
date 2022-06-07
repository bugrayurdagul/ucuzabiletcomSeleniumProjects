package com.ucuzabilet.test;

import com.ucuzabilet.driver.BaseTest;
import com.ucuzabilet.page.HomePage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage;

    @Before
    public void forStart()
    {
        homePage = new HomePage();
    }


    @Test
    public void homePageControlTest(){

        homePage.homePageControl();
    }

    @Test
    public void whereToFromTest(){

    }


}
