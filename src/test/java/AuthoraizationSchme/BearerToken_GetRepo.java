package AuthoraizationSchme;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;


public class BearerToken_GetRepo
{

	@Test
	public void getAllRepo()
	{
		
//		HashMap<String ,String> map = new HashMap<String, String>();
//		map.put("Accept","application/vnd.github+json");
//		map.put("Authorization", "Bearer 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");
//		map.put("X-GitHub-Api-Version", "2022-11-28");
		
		RestAssured.baseURI = "https://api.github.com";
		
		given()
		
		.header("Accept"," application/vnd.github+json")
		
		.header("Authorization", "Bearer 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")
		
		.header("X-GitHub-Api-Version", "2022-11-28")
		
		.log().all()
		
		.when()
		
		.get("/user/repos")
		
		.then()
		
		.log().all();
		
		
		
		
	}
	
	
}
