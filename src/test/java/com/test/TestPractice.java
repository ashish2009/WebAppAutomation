package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPractice {

	@Test
	public void verifyTestCaseOne(){
		Assert.assertTrue(true, "Test Case One Failed");
	}
	
	@Test
	public void verifyTestCaseTwo(){
		Assert.assertTrue(true, "Test Case Two Failed");
	}
	
	@Test
	public void verifyTestCaseThree(){
		Assert.assertTrue(false, "Test Case Three Failed");
	}
	
	@Test
	public void verifyTestCaseFour(){
		Assert.assertTrue(false, "Test Case Four Failed");
	}
	
	@Test
	public void verifyTestCaseFive(){
		Assert.assertTrue(true, "Test Case Five Failed");
	}
	
	@Test
	public void verifyTestCaseSix(){
		Assert.assertTrue(true, "Test Case Six Failed");
	}
	
	@Test
	public void verifyTestCaseSeven(){
		Assert.assertTrue(true, "Test Case Seven Failed");
	}
	
	@Test
	public void verifyTestCaseEight(){
		Assert.assertTrue(true, "Test Case Eight Failed");
	}
	
	@Test
	public void verifyTestCaseNine(){
		Assert.assertTrue(true, "Test Case Nine Failed");
	}
	
	@Test
	public void verifyTestCaseTen(){
		Assert.assertTrue(false, "Test Case Ten Failed");
	}
}
