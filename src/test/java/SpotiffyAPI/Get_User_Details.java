package SpotiffyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Get_User_Details 
{

	@Test
	public void getUserDeatails()
	{
		RestAssured.baseURI = "https://api.spotify.com";
		
		given()
		
		.header("Authorization","Bearer BQDvCfOuapDMlNsjoF5N8VUOtQuHHY8k97_KnqJW7lyhQz4qqtXr0uo_N6CGrsm0NJNY7UamzSYYikuqfM6cm_5Z1bE606Ky1OKb7vn3xgeB_nsDVDzrST8zdgG7byEfXVJaHB7epfA2pllbbnVK3BL6L7aCyYVsi41hYipvKinsU9xSrbZ80Q3vYFCY9pvg_iNW1eD070y8QPzMZQt0lcg5rXEzptmkO7jxHcibJuiwsCGf9GwkIgu8BrvzvS_5wTLFaLeUIMzsdsvH")
	
		.log().all()
		
		.when()
		
		.get("/v1/me")
		
		.then()
		
		.log().all();
	
	}
	
	
	
}
