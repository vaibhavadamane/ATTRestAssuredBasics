package SendingBodyAsObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Get_Mock_Request 
{

	@Test
	public void getRequest()
	{	
		RestAssured.baseURI = "https://6e8d3849-3509-458d-a497-0e7c55b68ad2.mock.pstmn.io";
		
		given()
		
        .log().all()
        
        .when()
        
        .get("/get")
        
        .then()
        
        .log().all()
        
        .extract()
        
        .response();
	}
}
