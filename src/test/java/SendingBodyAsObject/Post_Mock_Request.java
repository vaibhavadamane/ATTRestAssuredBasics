package SendingBodyAsObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Post_Mock_Request 
{

	@Test
	public void postRequest()
	{
		HashMap<String,String> object1 = new HashMap<String, String>();
		object1.put("id","1001");
		object1.put("type","Regular");
		
		HashMap<String,String> object2 = new HashMap<String, String>();
		object2.put("id","1002");
		object2.put("type","Chocolate");
		
		List<HashMap<String, String>> batterobject = new ArrayList<HashMap<String,String>>();
		batterobject.add(object1);
		batterobject.add(object2);
		
		HashMap<String,Object> mainObject = new HashMap<String, Object>();
		mainObject.put("batter",batterobject);
		
		RestAssured.baseURI = "https://6e8d3849-3509-458d-a497-0e7c55b68ad2.mock.pstmn.io";
		
		given()
		
		.body(mainObject)
		
//		.header("x-mock-match-request-body","true")
		
		.log().all()
		
		.when()
		
		.post("/post1")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
	}
	
}
