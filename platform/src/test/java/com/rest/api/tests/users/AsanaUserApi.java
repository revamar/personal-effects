package com.rest.api.tests.users;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToObject;

import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AsanaUserApi {
	
	private RequestSpecification httpRequest;
	
	@BeforeClass
	public void initRequestMethod()
	{
		baseURI = "https://app.asana.com/api/1.0";
		 httpRequest = given();
	}
	
	@Test
	public void getUsersOfAsanaApi()
	{
		httpRequest.auth().oauth2("1/1166865218709483:80074f9f50f11d5a95b4a6eccb1f8452");
		Response response = httpRequest.request(Method.GET, "/users");
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("Content-Type"+response.getContentType());
		
		 Headers allHeaders = response.headers();
		 for(Header header : allHeaders)
		 {
			 Reporter.log("Key: " + header.getName() + " Value: " + header.getValue());
		 }
		 
		 Map<String, String> cokiesMap=response.cookies();
		 Reporter.log("cokies map has been created");
		 Set<String> entry=cokiesMap.keySet();
		 Reporter.log("key entry set has been created");
		 for(String key: entry) {
			 Reporter.log(key + cokiesMap.get(key));
		 }
		 
	}
	
	@Test
	public void validateUserBody() {
		Response response= httpRequest.when().auth().oauth2("1/1166865218709483:80074f9f50f11d5a95b4a6eccb1f8452").get("/users");
		response.then().assertThat().statusCode(200).body("data.gid[0]", equalToObject("1167059766961354"),
				"data.gid[1]", equalToObject("1166865218709483"));
		
	}
	
	
}
