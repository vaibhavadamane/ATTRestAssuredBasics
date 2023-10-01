package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Delate_RequestForVaibhavWorkspace 
{

	@Test
	public void deleteRequest()
	{
		
		RestAssured.baseURI = "https://api.getpostman.com";
		
	     Response resp = given()
	     
	     .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
	     
	     .when()
	     
	     .delete("/workspaces/578b8982-05a4-4b68-b53a-d7df0aec90dd")
	     
	     .then()
	     
	     .extract()
	     
	     .response();
	     
	    String respoances = resp.asPrettyString();
	    
	    System.out.println(respoances);
	     
	    int code = resp.getStatusCode();
	    
	    System.out.println(code);
	     
	}
}
