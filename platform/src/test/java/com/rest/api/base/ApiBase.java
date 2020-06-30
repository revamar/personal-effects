package com.rest.api.base;

import io.restassured.http.Header;
import io.restassured.response.Response;

public interface ApiBase {
	public void validateContentTypeHeader(Header actual, String expected, Response response);
	public void validateTransferEncodingHeader(Header actual, String expected, Response response);
	public void validateConnectionHeader(Header actual, String expected, Response response);
	public void validateXframeOptionsHeader(Header actual, String expected, Response response);
	public void validateXxssProtectionHeader(Header actual, String expected, Response response);
	public void validateXContentTypeOptionsHeader(Header actual, String expected, Response response);
	public void validateContentSecurityPolicyHeader(Header actual, String expected, Response response);
	public void validateXAsanaApiVersionHeader(Header actual, String expected, Response response);
	public void validateXRobotsTagHeader(Header actual, String expected, Response response);
	public void validateStrictTransportSecurityHeader(Header actual, String expected, Response response);
	public void validateDatacenterTimeEndHeader(Header actual, String expected, Response response);
	public void validateXLoadBalancerHeader(Header actual, String expected, Response response);
	public void validateContentEncodingHeader(Header actual, String expected, Response response);

}
