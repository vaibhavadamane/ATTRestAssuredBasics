package SpotiffyAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class NegativeScienario 
{

	@Test(enabled=false)
	public void userShouldNotBeCreatePlaylist()
	{
        RestAssured.baseURI="https://api.spotify.com/v1/users";
		
		given()
		
		.headers("Content-Type","application/json")
		
		.header("Authorization","Bearer BQBuMJC5-3tkiXmuCMZIka8GPTgJe-YDtcXzWG5aiMvlOsCTKkbrGeu5G1as2gMSQKnkGqntejcl8yXQId5lGQ_XTzRe13hHnCKe-lSfOAEt_1MgGZwkMdTaXTy0jJIcn4dvtqXETAL7BKMU2yNLZXUh72tSyYbklKjLgHNljxiKaktWiGtZDtyAjTxkplGJ_G-sOqR7wbGYjF0gz_Qx9udC_DfYcmEdUNpxCrMZgmenhVMrugdYa40AK5CmOLyVFhEKgr6RmePTGElr")
		
		.body("{\r\n" + 
				"    \"name\": \"\",\r\n" + 
				"    \"description\": \"Khasari laal Yadav Song\",\r\n" + 
				"    \"public\": true\r\n" + 
				"}")
		
		.log().all()
		
		.when()
		
		.post("/31vvwjrggfwftqklkq3q3pprbdqe/playlists")
		
		.then()
		
		.assertThat()
		
		.statusCode(400)
		
		.log().all();
		
	}
	
	@Test(enabled=true)
	public void shouldNotBeAuthorised()
	{
        RestAssured.baseURI="https://api.spotify.com/v1/users";
		
		given()
		
		.headers("Content-Type","application/json")
		
		.header("Authorization","Bearer BQD4BvD_ex0gca7Nul5QLO41Iypj2Sr5XwpzF3jltsQOcqjbRlM2mRFkprPA-WKty8uxlPVo_NGRIT4GhAjiYIWA0JvDl-wk7KR4afp2Uxogv5GE1oIenmKFsftVGS7UNwgpL0bFTFX39yLm5Cv1qKvMS2W8rbnF95vvH5TtZXb4_7TVrjV_BgjwDp2kxzNS8AU7Q-LLgcp2Uhmd_62TuG5jcycazhRPk1wgyVOfsLkgeKnI-5QpAB0DOp9hkT0rxr8skHv3opFndhcI")
		
		.body("{\r\n" + 
				"    \"name\": \"South Song\",\r\n" + 
				"    \"description\": \"Allu Arjun Song\",\r\n" + 
				"    \"public\": true\r\n" + 
				"}")
		
		.log().all()
		
		.when()
		
		.post("/31vvwjrggfwftqklkq3q3pprbdqe/playlists")
		
		.then()
		
		.assertThat()
		
		.statusCode(401)
		
		.log().all();
		
	}
	
	
	
	
	
	
}
