package com.project.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.generic.BaseClass;

public class ProjectModule extends BaseClass {
	
	@Test(priority = 1)
	public void createProject() {
		Reporter.log("create Project");
	}

	@Test(priority = 2)
	public void modifyProject() {
		Reporter.log("modify Project");
	}

	@Test(priority = 3)
	public void deleteProject() {
		Reporter.log("delete Project");
	}
}
