package FeatchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FeatchDataFormComplexJson 
{
	@Test
	public void getUserId()
	{
	     RestAssured.baseURI = "https://reqres.in/";
	     
	     Response respoances = given()
	     
	                           .when()
	   
	                           .get("api/users/2")
	     
	                           .then()
	     
	                           .extract()
	     
	                           .response();
	     
	     String repo = respoances.asPrettyString();
	    
	     System.out.println(repo);
	     
	     JsonPath jp = respoances.jsonPath();
	     
	     int idvalue = jp.getInt("data.id");
	      
	     System.out.println(idvalue);
	}
}
