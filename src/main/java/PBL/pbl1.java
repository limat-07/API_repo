package PBL;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class pbl1 {

	@Test
	public void test_ListUsers() {
		RestAssured.useRelaxedHTTPSValidation();
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		int statusCode = response.getStatusCode();
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		System.out.println("mario");
		Assert.assertEquals(statusCode, 200);
	}
}
