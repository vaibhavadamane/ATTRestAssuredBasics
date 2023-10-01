package BasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateNewUseronSwagger 
{

	static String value;
	@Test (priority = 1)
	public void createNewUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response resp = given()
		
		                .header("Content-type","application/json")
		
	 	                .body("{\r\n" + 
				        "  \"id\": 0,\r\n" + 
			           	"  \"username\": \"User5\",\r\n" + 
			         	"  \"firstName\": \"Kunalbhau\",\r\n" + 
			        	"  \"lastName\": \"Rawaut\",\r\n" + 
				        "  \"email\": \"rauat@123.gmail.com\",\r\n" + 
			        	"  \"password\": \"kuna@123\",\r\n" + 
		          		"  \"phone\": \"987545689\",\r\n" + 
			 	        "  \"userStatus\": 0\r\n" + 
			          	"}")
		
		               .when()
		
		               .post("/user")
		 
	                   .then()
	    
	                   .extract()
	    
	                   .response();
		
		String data = resp.asPrettyString();
		
		System.out.println(data);
		
//		Getting the value from responses through Jason path
		
		JsonPath jp = resp.jsonPath();
		
		value = jp.getString("message");
		
		System.out.println(value);
		
	}
		
//		Doing the validation through comparison

	    @Test(priority=2)
		public void getNewUser()
		{
			RestAssured.baseURI = "https://petstore.swagger.io/v2";
			
		Response respoances = given()
			
		                     .when()
		    
		                     .get("/user/User5")
		    
		                     .then()
		    
		                     .extract()
		    
		                     .response();
		
		String data1 = respoances.asPrettyString();
		
		System.out.println(data1);
		
		JsonPath jp = respoances.jsonPath();
		
		String idvalue = jp.getString("id");
		
		System.out.println(idvalue);
		    
		Assert.assertEquals(value, idvalue);
		    
		}
		
		
		
	
	
}
