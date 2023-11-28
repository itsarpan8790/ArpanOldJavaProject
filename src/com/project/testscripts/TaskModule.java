package com.project.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.generic.BaseClass;

public class TaskModule extends BaseClass{
	
	@Test(priority = 1)
	public void createTask() {
		Reporter.log("create Task");
	}

	@Test(priority = 2)
	public void modifyTask() {
		Reporter.log("modify Task");
	}

	@Test(priority = 3)
	public void deleteTask() {
		Reporter.log("delete Task");
	}
}
