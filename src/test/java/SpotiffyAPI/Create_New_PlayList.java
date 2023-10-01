package SpotiffyAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Create_New_PlayList 
{

	@Test
	public void createNewPlaylist()
	{
		RestAssured.baseURI="https://api.spotify.com/v1/users";
		
		given()
		
		.headers("Content-Type","application/json")
		
		.header("Authorization","Bearer BQDvCfOuapDMlNsjoF5N8VUOtQuHHY8k97_KnqJW7lyhQz4qqtXr0uo_N6CGrsm0NJNY7UamzSYYikuqfM6cm_5Z1bE606Ky1OKb7vn3xgeB_nsDVDzrST8zdgG7byEfXVJaHB7epfA2pllbbnVK3BL6L7aCyYVsi41hYipvKinsU9xSrbZ80Q3vYFCY9pvg_iNW1eD070y8QPzMZQt0lcg5rXEzptmkO7jxHcibJuiwsCGf9GwkIgu8BrvzvS_5wTLFaLeUIMzsdsvH")
		
		.body("{\r\n" + 
				"    \"name\": \"Bhojpuri Song\",\r\n" + 
				"    \"description\": \"Khasari laal Yadav Song\",\r\n" + 
				"    \"public\": true\r\n" + 
				"}")
		
		.log().all()
		
		.when()
		
		.post("/31vvwjrggfwftqklkq3q3pprbdqe/playlists")
		
		.then()
		
		.log().all();
		
	}
	
	
	
	
}
