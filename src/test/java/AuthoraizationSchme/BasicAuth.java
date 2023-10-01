package AuthoraizationSchme;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth 
{

	@Test
	public void basicAuth()
	{
		
		RestAssured.baseURI = "https://postman-echo.com";
		
		given()
		
//		.auth()
//		
//		.basic("postman", "password")
		
		.headers("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==")
		
		.log().all()
		
		.when()
		
		.get("/basic-auth")
		
		.then()
		
		.log().all();
		
		
	}
	
	
}
