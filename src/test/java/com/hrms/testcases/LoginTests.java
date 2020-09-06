package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import com.hrms.pages.DashboardPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginTests extends CommonMethods{
	
	@Test(groups="smoke")
	public void validLogin() {
		
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
		DashboardPageElements dashboard = new DashboardPageElements();
		AssertJUnit.assertTrue(dashboard.welcome.isDisplayed());
	}
	
	@Test(groups="regression", dataProvider="getData")
	public void invalidLogin(String username,String password, String text) {
		
		sendText(login.userNametextBox, username);
		sendText(login.passwordTextBox, password);
		click(login.btnLogin);
		AssertJUnit.assertEquals(login.spanMessage.getText(), text);
	}
	
	
	@DataProvider
	public String [][] getData(){
			String [][] data={
			{"", "Hum@nhrm123", "Username cannot be empty"},
			{"Admin", "", "Password cannot be empty"},
			{"Admin", "Hum@nhrm12", "Invalid credentials"},
//			
	};
	return data;
	}

}
