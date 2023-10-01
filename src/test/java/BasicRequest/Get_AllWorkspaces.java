package BasicRequest;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Get_AllWorkspaces 
{

	@Test
	public void getAllWorkspace()
	{
       RestAssured.baseURI = "https://api.getpostman.com";
		
		 Response respoance = given()
				
				             .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		                     .when()
		
	                         .get("/workspaces")
		
	                         .then()
		
		                     .extract()
		
		                     .response();
		                     
//		String respoances = respoance.asPrettyString();       
//		
//		System.out.println(respoances);
		
		int statuscode = respoance.getStatusCode();
		
		System.out.println(statuscode);
		
		long time = respoance.getTime();
		
		System.out.println(time);
		
//		First Way to get headers to all headers
		
//		Headers headers = respoance.getHeaders();
		
		Headers head = respoance.headers();
		
		String value = head.toString();
		
		System.out.println(value);
		
//		Second way to get headers in list form
		
		List<Header> list = head.asList();
		
		Header h3 = list.get(3);
		
		String name = h3.getName();
		
	    String val = h3.getValue();
	    
	    System.out.println(name + " " + val);
	    
//	    third way to get headers to get particular value 
	    
	    String headvalue = respoance.getHeader("X-RateLimit-Remaining");
	    
	    System.out.println(headvalue);
		
		
	}
}
