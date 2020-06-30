package com.devops.qa;

import org.testng.Assert;
import org.testng.Assert.ThrowingRunnable;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class IntegrationsTest1 {
	
	@Test
	public void integrations_test_method1() {
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void integrations_test_method2() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void integrations_test_method3() {
		Assert.assertFalse(true);
	}
	
	@Test
	public void integrations_test_method4() {
		Assert.assertThrows((ThrowingRunnable) new SkipException("This is used to throw exception"));
	}
}
