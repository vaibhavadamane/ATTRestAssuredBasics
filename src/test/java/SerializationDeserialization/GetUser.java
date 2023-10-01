package SerializationDeserialization;

import org.testng.annotations.Test;

import POJO.GetUserResponcesBody;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class GetUser 
{

	@Test
	public void getUser()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		 GetUserResponcesBody res = given()
		
		.when()
		
		.get("/api/users?page=2")
		
		.then()
		
		.extract()
		
		.response().as(GetUserResponcesBody.class);
		
		 Integer page = res.getPage();
		 
		 System.out.println(page);
		 
		 System.out.println(res.getData().get(4).getFirst_name());    
		 
		 System.out.println(res.getSupport().getUrl());
		
		 System.out.println(res.getSupport().getText());
	}
	
	
	
	
	
	
	
	
	
}
