package BasicRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*; //it will give the all static method present into the rest Assured 

import org.testng.annotations.Test;
                                            //Package without mentioning its name.

public class GET_RequestForAllUser
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
		
		int code = respoance.statusCode();
		
		long time = respoance.getTime();
		
		System.out.println(code + " " + time);
}
	
//	@Test
//	public void getSingleUser()
//	{
//	     RestAssured.baseURI = "https://reqres.in/";
//	     
//	     Response respoances = given()
//	     
//	                           .when()
//	     
//	                           .get("api/users/2")
//	     
//	                           .then()
//	     
//	                           .extract()
//	     
//	                           .response();
//	     
//	     String repo = respoances.asPrettyString();
//	    
//	     System.out.println(repo);
//	     
//	     
//	}
	

}
