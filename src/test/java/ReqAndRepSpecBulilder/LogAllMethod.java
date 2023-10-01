package ReqAndRepSpecBulilder;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LogAllMethod 

// Used Log.all method to get the Request and Responses information without using the json path
{
	@Test
	public void getAllWorkspace()
	{
       RestAssured.baseURI = "https://api.getpostman.com";
		
		 Response respoance = given()
				
				             .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
				             .log().all()
				             
		                     .when()
		
	                         .get("/workspaces")
		
	                         .then()
	                         
	                         .log().all()
		
		                     .extract()
		
		                     .response();
		                     
}
}
