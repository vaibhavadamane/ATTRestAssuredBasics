package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Delete_RequestForWorkspace 
{

	@Test
	public void deleteWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response respoanes = given()
		
		                     .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		                     .when()
		
		                     .delete("/workspaces/b5a670ae-7b4c-44ab-ae8b-eb54c775a2c1")
		
		                     .then()
		
		                     .extract()
		
		                     .response(); 
		
		String resp = respoanes.asPrettyString();
		
		System.out.println(resp);
		
		String line = respoanes.getStatusLine();
		
		System.out.println(line);
		
		
	}
}
