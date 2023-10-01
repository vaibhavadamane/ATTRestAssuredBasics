package UploadandDownload;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;


public class UploadFile 
{

	@Test
	public void uploadIages()
	{
		File image = new File("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshot 2023-01-17 124808.png");
		
		RestAssured.baseURI = "https://the-internet.herokuapp.com";
		
		given()
		
//	    MultiPart is a method to send the file to the server
		
		.multiPart("file",image)
		
		.log().all()
		
		.when()
		
		.post("/upload")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
	}
	
}
