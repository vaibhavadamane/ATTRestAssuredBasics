package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Post_CreateWorkspace
{

	@Test
	public void createNewWorkspace()
	{
		RestAssured.baseURI = "https://api.getpostman.com";
		
		Response respoances = given()
		
		                      .body("{\r\n" + 
				                    "    \"workspace\": {\r\n" + 
			                       	"        \"name\": \"ATTWorkSpace\",\r\n" + 
				                    "        \"description\": \"Test API's\",\r\n" + 
				                    "        \"type\": \"personal\"\r\n" + 
				                    "    }\r\n" + 
				                    "}")
		
		                       .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		                       .when()
		
		                       .post("/workspaces")
		
		                       .then()
		
	                           .extract()
		
		                       .response();
		
		String resp = respoances.asPrettyString();
		
		System.out.println(resp);
		
	}
	
//	public void createNewWorplace1()
//	{
//		RestAssured.baseURI = "https://api.getpostman.com";
//		
//		Response respoances = given()
//		
//		.header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
//		
//		.body("{\r\n" + 
//				"    \"workspace\": {\r\n" + 
//				"        \"name\": \"Vaibhav\",\r\n" + 
//				"        \"description\": \"Test API's\",\r\n" + 
//				"        \"type\": \"personal\"\r\n" + 
//				"    }\r\n" + 
//				"}")
//		
//		.when()
//		
//		.post("workspaces")
//		
//		.then()
//		
//		.extract()
//		
//		.response();
//		
//		String repo = respoances.asPrettyString();
//		
//		System.out.println(repo);
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
