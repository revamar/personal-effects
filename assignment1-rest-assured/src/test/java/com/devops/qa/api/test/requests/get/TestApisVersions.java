package com.devops.qa.api.test.requests.get;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//@Listeners({ExtentITestListenerAdapter.class})
public class TestApisVersions{

	RequestSpecification request;
	Response response;
	
	@BeforeClass
	public void initRequestMethod()
	{
		 RestAssured.baseURI = "https://ap17.salesforce.com/services/data";
		 request = RestAssured.given();
		 request.auth().oauth2("00D2x000003szl6!AQMAQFrecocOkCDNm7zaG0fH3ZAm6N1dGPY5Q5EyYwF5SuMjbbTjG.390xeyzJLjvS811OQiFiiBqbEmJ0.9UfaZR1c15ZLC");
		 response=request.get("/");
	}
	
	@Test
	public void verifyVersionApiStatusCode()
	{
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test
	public void verifyVersionApiContentType()
	{
		Assert.assertEquals(response.getContentType(), "application/json;charset=UTF-8");
	}
	
	@Test
	public void verifyVersionApiContentEncoding()
	{
		Assert.assertEquals(response.getHeaders().getValue("Content-Encoding"), "gzip");
	}
	
	@Test
	public void verifyVersionApiStatusLine()
	{
		Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
	}
	
	@Test
	public void verifyVersionApiAssertFailCase()
	{
		Assert.assertFalse(true);
	}


}
