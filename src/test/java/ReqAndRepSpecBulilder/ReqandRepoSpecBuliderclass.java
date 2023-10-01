package ReqAndRepSpecBulilder;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
  
public class ReqandRepoSpecBuliderclass 
{
	RequestSpecification requestspecifiaction;
	ResponseSpecification responcespecificatin;
	
	@BeforeClass
	public void reqrepospecbulider()
	{
		
	RequestSpecBuilder requestspecbulilder = new RequestSpecBuilder();
	requestspecbulilder.setBaseUri("https://api.getpostman.com");
	requestspecbulilder.addHeader("x-api-key","PMAK-649480de000f4c0040e29882-28f05324b67145ffdf0d868fc09e2b4133");
	requestspecbulilder.log(LogDetail.ALL);
    requestspecifiaction = requestspecbulilder.build();

	ResponseSpecBuilder responcesbulider = new ResponseSpecBuilder();
	responcesbulider.expectStatusCode(200);
	responcesbulider.expectContentType(ContentType.JSON);
	responcesbulider.log(LogDetail.ALL);
    responcespecificatin = responcesbulider.build();
	
	}
	
	@Test (priority=1)
	public void getAllWorkspace()
	{
		
       Response response = RestAssured.given()
        
        .spec(requestspecifiaction)
        
        .when()
        
        .get("/workspaces")
        
        .then()
        
        .spec(responcespecificatin)
        
        .extract()
        
        .response();
       
      System.out.println(response.asPrettyString()); 
		                     
}	
}
