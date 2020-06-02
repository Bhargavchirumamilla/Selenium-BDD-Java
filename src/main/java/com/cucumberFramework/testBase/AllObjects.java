package com.cucumberFramework.testBase;

import com.cucumberFramework.pageObjects.HomePage;
import com.cucumberFramework.pageObjects.LoginPage;


public interface AllObjects {

	static LoginPage loginPage = new LoginPage(TestBase.driver);
	static HomePage homePage = new HomePage(TestBase.driver);
}
