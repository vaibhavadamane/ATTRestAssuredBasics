package AsserationUsage;

	import static io.restassured.RestAssured.*;
	import static io.restassured.matcher.RestAssuredMatchers.*;
	import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class ApplyAsseration 
{
	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		  given()
				
          .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		  .when()
		
	      .get("/workspaces")
		
	      .then()
		
		  .assertThat() //It will give the all assertion method that we have to use
		                     
		  .header("Transfer-Encoding","chunked")
		                     
		  .contentType(ContentType.JSON)
		                     
		  .statusCode(200)
		                      
//		  .body("workspaces.id",contains("91c61504-358f-4e30-8995-63333321c600","c7b0bb8c-093c-4426-b0bf-f578b16861f0"));
		                 
//         if we change the sequences than it get 
		  
//		  .body("workspaces.id",contains("70e2da72-f519-4699-b19b-3d491946e50e","91c61504-358f-4e30-8995-63333321c600","c7b0bb8c-093c-4426-b0bf-f578b16861f0"));
		  
//		  .body("workspaces.id",containsInAnyOrder("70e2da72-f519-4699-b19b-3d491946e50e","91c61504-358f-4e30-8995-63333321c600","c7b0bb8c-093c-4426-b0bf-f578b16861f0"))
	  
		  .body("workspaces.name",hasItem("ATTWorkSpace")) // failed as hasItem parameter doesn't match with any of the values
		  
		  .body("workspaces[0]",hasKey("id")) // if we have id available then it will mark the case as passed
	  
		  .body("workspaces[1]",hasEntry("id","c7b0bb8c-093c-4426-b0bf-f578b16861f0" ))
		  
		  .body("workspaces.name", hasItem("RestAssuredNew"));
	}
	
	
}
