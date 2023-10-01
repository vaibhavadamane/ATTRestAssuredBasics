package FeatchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DyanamicDataExtraction 
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
		
		JsonPath jp = respoance.jsonPath();
		
		int size = jp.getInt("data.size()");
		
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String lastname = jp.getString("data["+i+"].last_name");
//			System.out.println(lastname);
			if(lastname.equals("Ferguson"))
			{
				String emails = jp.getString("data["+i+"].email");
				System.out.println(emails);
			}
			
		}
}
}
