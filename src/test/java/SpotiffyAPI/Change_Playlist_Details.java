package SpotiffyAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Change_Playlist_Details 
{

	@Test
	public void putChangePlaylistDeatails()
	{
        RestAssured.baseURI = "https://api.spotify.com";
		
		given()
		
		.header("Content-Type","application/json")
		
		.header("Authorization","Bearer BQBuMJC5-3tkiXmuCMZIka8GPTgJe-YDtcXzWG5aiMvlOsCTKkbrGeu5G1as2gMSQKnkGqntejcl8yXQId5lGQ_XTzRe13hHnCKe-lSfOAEt_1MgGZwkMdTaXTy0jJIcn4dvtqXETAL7BKMU2yNLZXUh72tSyYbklKjLgHNljxiKaktWiGtZDtyAjTxkplGJ_G-sOqR7wbGYjF0gz_Qx9udC_DfYcmEdUNpxCrMZgmenhVMrugdYa40AK5CmOLyVFhEKgr6RmePTGElr")
	
		.body("{\r\n" + 
				"    \"name\": \"Punjabi Songs\",\r\n" + 
				"    \"description\": \"Desi Gangster Song\",\r\n" + 
				"    \"public\": false\r\n" + 
				"}'")
		
		.log().all()
		
		.when()
		
		.put("/v1/playlists/1tqG9zXZtPvrqQDdQxtNBw")
		
		.then()
		
		.log().all();
	
	}
	
}
