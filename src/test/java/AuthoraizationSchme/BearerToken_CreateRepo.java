package AuthoraizationSchme;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerToken_CreateRepo 
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
		
		.body("{\r\n" + 
				"  \"name\": \"VaibhavAdamanerepo2\",\r\n" + 
				"  \"description\": \"This is my private repo\",\r\n" + 
				"  \"homepage\": \"https://github.com\",\r\n" + 
				"  \"private\": true,\r\n" + 
				"  \"is_template\": true\r\n" + 
				"}")
		
		.log().all()
		
		.when()
		
		.post("/user/repos")
		
		.then()
		
		.log().all();
		
	}
}
