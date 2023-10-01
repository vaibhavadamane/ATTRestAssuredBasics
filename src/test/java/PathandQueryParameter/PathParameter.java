package PathandQueryParameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PathParameter 
{
	@Test
	public void getSingleUser()
	{
	     RestAssured.baseURI = "https://reqres.in/";
	     
	                            given()
	    		 
	    		               .pathParam("User","2")
	    		               
	    		               .log().all()
	     
	                           .when()
	     
	                           .get("api/users/{User}")
	     
	                           .then()
	                           
	                           .log().all()
	     
	                           .extract()
	     
	                           .response();
	     
	     
	}
}
