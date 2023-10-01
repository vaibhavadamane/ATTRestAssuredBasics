package UploadandDownload;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DownloadFile 
{

	@Test
	public void getDownload() throws Exception
	{
		RestAssured.baseURI = "https://github.com";
		
		byte[] byteArry = given()
		
		.log().all()
		
		.when()
		
		.get("/Vimannagar/ATTRestassuredBasics/blob/master/BDD flow2.png")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response()
		
		.asByteArray();
		
		OutputStream os = new FileOutputStream(new File("C:\\Users\\hp\\OneDrive\\Desktop\\Document\\BDD flow2.png"));
		
		os.write(byteArry);
		
		os.close(); //Mandatory field like Action class eg.bulid and perform
		
	}
	
}
