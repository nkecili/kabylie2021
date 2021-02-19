package com.statefarm.project.qa.test.testbase;

import base.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.statefarm.project.qa.pages.HomePage;
import com.statefarm.project.qa.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SetUp extends WebAPI{

    public static HomePage homePage;
    public static LoginPage loginPage;
    public static void Init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);

    }
    @Before
    public void setUp_Init() throws IOException {
        Config config = new Config();
        config.loadProperties();
        Init();
    }
//   @Before(value="0")
//   public void connectToDatabase(){

//   }
    @After
    public void tearDown() throws IOException {
    screenShot( scenario);
    SetUp.driver.quit();
    }

}

