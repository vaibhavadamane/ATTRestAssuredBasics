package SpotiffyAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_User_Playlists 
{

	@Test
	public void getUserPlaylists()
	{
        RestAssured.baseURI = "https://api.spotify.com/v1/me/playlists";
		
		given()
		
		.header("Authorization","Bearer BQBuMJC5-3tkiXmuCMZIka8GPTgJe-YDtcXzWG5aiMvlOsCTKkbrGeu5G1as2gMSQKnkGqntejcl8yXQId5lGQ_XTzRe13hHnCKe-lSfOAEt_1MgGZwkMdTaXTy0jJIcn4dvtqXETAL7BKMU2yNLZXUh72tSyYbklKjLgHNljxiKaktWiGtZDtyAjTxkplGJ_G-sOqR7wbGYjF0gz_Qx9udC_DfYcmEdUNpxCrMZgmenhVMrugdYa40AK5CmOLyVFhEKgr6RmePTGElr")
	
		.log().all()
		
		.when()
		
		.get()
		
		.then()
		
		.log().all();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
