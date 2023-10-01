package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Put_ReuestforUpdate 
{

	@Test
	public void updateWorkSpace()
	{
		RestAssured.baseURI = "https://api.getpostman.com/workspaces";
		
	    Response respoance = given()
	    
	                         .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
	    
	                         .body("{\r\n" + 
	    	               	 "    \"workspace\": {\r\n" + 
	    		             "        \"name\": \"RestAssuredNew\",\r\n" + 
	    		             "        \"description\": \"My Name is Don\",\r\n" + 
	    		             "        \"type\": \"private\"\r\n" + 
	    		             "    }\r\n" + 
	    		             "}")
	    
	                         .when()
	    
	                         .put("/c7b0bb8c-093c-4426-b0bf-f578b16861f0")
	    
	                         .then()
	    
	                         .extract()
	    
	                         .response();
	    
	    String repo = respoance.asPrettyString();
	    
	    System.out.println(repo);
				
	}
}
