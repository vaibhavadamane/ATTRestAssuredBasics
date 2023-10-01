package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Head_RequestForGet 
{

	@Test
	public void headRequest()
	{
		RestAssured.baseURI = "https://api.getpostman.com/workspaces";
		
		Response respoances = given()
		
		                      .header("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133")
		
		                      .when()
		
		                      .head()
		
		                      .then()
		
		                      .extract()
		
		                      .response();
		
		String resp = respoances.asPrettyString();
		
		System.out.println(resp);
		
		int code = respoances.getStatusCode();
		
		long time = respoances.getTime();
		
		System.out.println("Status Code = " + code + " " + "Time = " + time);
		
//		Getting the Headers Information
//		A) Getting single header information
//		printing only the specified index position of name and value of header
		
		Headers header = respoances.headers();
		
		List<Header> value = header.asList();
		
		Header v = value.get(0);
	
		String name = v.getName();
		
		String value1 = v.getValue();
		
		System.out.println(name + " " + value1);
		
//		B) Fetching all values of header
		
		String allvalue = header.toString();
		
		System.out.println(allvalue);

//		C) Get individual value of header
		
		String singleValue = respoances.getHeader("x-frame-options");
		
		System.out.println(singleValue);
		
	}
}
