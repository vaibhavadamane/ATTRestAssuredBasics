package FeatchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FeatchDataFormVeryComplexJson 
{
	@Test
	public void getAllUser()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Response respoance = given()
		
		                     .when()
		
	                         .get("api/users?page=2")
		
	                         .then()
		
		                     .extract()
		
		                     .response();
		                     
		String respoances = respoance.asPrettyString();       
		
		System.out.println(respoances);
		
		JsonPath jp = respoance.jsonPath();
		
		String emailvalue = jp.getString("data[0].first_name");
		
		System.out.println(emailvalue);
}
}
