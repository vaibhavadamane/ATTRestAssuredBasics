package SerializationDeserialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import POJO.CreateUserRequestBody;
import POJO.CreateUserRespoanceBody;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateNewUser 
{

	@Test 
	public void createNewUser()
	{
		
		CreateUserRequestBody respoancesBody = new CreateUserRequestBody();
		
		respoancesBody.setId(0);
		respoancesBody.setUsername("vaibhavbhau");
		respoancesBody.setFirstName("Vaibhav");
		respoancesBody.setLastName("Adamane");
		respoancesBody.setEmail("vaibhav@123");
		respoancesBody.setPassword("sai@999");
		respoancesBody.setPhonel("329579579");
		respoancesBody.setUserStatus(0);
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		CreateUserRespoanceBody respoances = given()
		
		               .header("Content-type","application/json")
		
	 	               .body(respoancesBody)
		
	 	               .log().all()
	 	               
		               .when()
		
		               .post("/user")
		 
	                   .then()
	                   
	                   .log().all()
	    
	                   .extract()
	    
	                   .response().as(CreateUserRespoanceBody.class);
		
		String msg = respoances.getMessage();
		
		System.out.println(msg);
	
	
}
}