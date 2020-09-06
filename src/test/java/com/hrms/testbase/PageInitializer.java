package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;

public class PageInitializer extends BaseClass {
	public static LoginPageElements login;
	public static	DashboardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static void  initializePageObjects() {
		 login=	new LoginPageElements();
		 dashboard= new DashboardPageElements();
		 addEmp= new AddEmployeePageElements();
	}

}
