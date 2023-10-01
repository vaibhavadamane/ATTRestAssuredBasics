package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GET_RequestForSingleUser 
{

	@Test
	public void getSingleUser()
	{
		RestAssured.baseURI = "https://reqres.in";
		
		Response responces = given()
		
		.when()
		
		.get("api/users/2")
		
		.then()
		
		.extract()
		
		.response();
		
		String repo = responces.asPrettyString();
		
		System.out.println(repo);
		
		int sc = responces.getStatusCode();
		
		System.out.println(sc);
		
		long time = responces.getTime();
		
		System.out.println(time);
		
		String line = responces.getStatusLine();
		
		System.out.println(line);
		
	}
}
