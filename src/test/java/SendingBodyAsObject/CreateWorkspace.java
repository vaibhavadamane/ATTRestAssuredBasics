package SendingBodyAsObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateWorkspace 
{

	@Test
	public void createWorkspace()
	{
		
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("name","NewWorkspace2");
		hm.put("description","Create for paractices");
		hm.put("type","personal");
		
		HashMap<String ,Object> jsonObject = new HashMap<String, Object>();
		jsonObject.put("workspace", hm);
		
		RestAssured.baseURI = "https://api.getpostman.com";
		
		given()
		
		.header("x-api-key", "PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		.body(jsonObject)
		
		.log().all()
		
		.when()
		
		.post("/workspaces")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
	}
	
}
