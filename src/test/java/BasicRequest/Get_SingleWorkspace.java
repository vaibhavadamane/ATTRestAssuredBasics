package BasicRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_SingleWorkspace 
{

	@Test
	public void getSingleWorkspace()
	{
		 RestAssured.baseURI = "https://api.getpostman.com";
			
		 Response respoance = given()
				
				             .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		                     .when()
		
	                         .get("/workspaces/91c61504-358f-4e30-8995-63333321c600")
		
	                         .then()
		
		                     .extract()
		
		                     .response();
		                     
		String respoances = respoance.asPrettyString();       
		
		System.out.println(respoances);
		
		int statuscode = respoance.getStatusCode();
		
		System.out.println(statuscode);
		
		long time = respoance.getTime();
		
		System.out.println(time);
	}

	}

