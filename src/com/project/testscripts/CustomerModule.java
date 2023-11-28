package com.project.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.generic.BaseClass;

public class CustomerModule extends BaseClass {

	@Test(priority = 1)
	public void createCustomer() {
		Reporter.log("create Customer");
	}

	@Test(priority = 2)
	public void modifyCustomer() {
		Reporter.log("modify Customer");
	}

	@Test(priority = 3)
	public void deleteCustomer() {
		Reporter.log("delete Customer");
	}

}
