package PathandQueryParameter;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class QueryParameter
{

//	Example of the single query parameter
	@Test(enabled=false)
	public void getPageUser()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		given()
		
		.queryParam("page", "2") //so here we can give query Parameter
		
		.log().all()
		
		.when()
		
		.get("/api/users")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
	}
	
//	Multiple Query Parameter example
	@Test(enabled=true)
	public void getReqWithMultipalParameter()
	{
		HashMap<String, String> mp = new HashMap<String, String>();
		
		mp.put("foo1", "bar1");
		mp.put("foo2", "bar2");
		mp.put("foo3", "bar3");
				
        RestAssured.baseURI = "https://postman-echo.com";
		
		given()
		
//		.queryParam("foo1", "bar1")
//		.queryParam("foo2", "bar2")
		
//		Used Another Method QueryParams
		
		.queryParams(mp)
		
		.log().all()
		
		.when()
		
		.get("/get")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
	}
	}
