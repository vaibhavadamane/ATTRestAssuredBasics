package FeatchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetTheSpecificData
{

//	To Get the email of the person who's last name is "Ferguson" 
	
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
			
			for(int i=0;i<6;i++)
			{
				String lastname = jp.getString("data["+i+"].last_name");
//				System.out.println(lastname);
				if(lastname.equals("Ferguson"))
				{
					String emails = jp.getString("data["+i+"].email");
					System.out.println(emails);
				}
				
			}
	}

}