package com.rest.api.tests.projects;

import javax.management.RuntimeErrorException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AsanaProjectApi {

	private RequestSpecification httpRequest;
	
	@BeforeClass
	public void initRequestMethod()
	{
		 RestAssured.baseURI = "https://app.asana.com/api/1.0";
		 httpRequest = RestAssured.given();
		 httpRequest.auth().oauth2("1/1166865218709483:80074f9f50f11d5a95b4a6eccb1f8452");
	}
	
	@Test
	public void getProjectsProjectsListApi()
	{
		Response httpResponse=httpRequest.get("/projects");
		Reporter.log(httpResponse.getSessionId()+"\n\t");
		Reporter.log(httpResponse.getStatusLine());
		Reporter.log(httpResponse.jsonPath().prettyPrint());
		Assert.assertEquals(httpResponse.getStatusLine(), "HTTP/1.1 200 OK");
		Assert.assertEquals(httpResponse.getStatusCode(), 200);
		
		
		Headers allHeaders = httpResponse.headers();
		 for(Header header : allHeaders)
		 {
			 Reporter.log("Key: " + header.getName() + " Value: " + header.getValue());
		 }
	}
	@Test
	public void failedTest()
	{
		Assert.assertEquals(true, false, "This explicitly has been made failed");
	}
	
	@Test
	public void failedTestError()
	{
		Error er=new Error();
		er.getMessage();
		throw new RuntimeErrorException(er);
	}
	
	@Test
	public void skipTestError()
	{
		throw new SkipException("Skipping this case for the check");
		
	}
}
