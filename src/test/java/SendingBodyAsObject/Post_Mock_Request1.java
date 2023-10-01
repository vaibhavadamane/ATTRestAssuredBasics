package SendingBodyAsObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post_Mock_Request1 
{

//	Complex Json Pass in the request by using the Object
	
	public void complexJsonBody()
	{
		
//		Defining the Array of id
		List<Integer> id = new ArrayList<Integer>();
		id.add(5);
		id.add(9);
		
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("id", "1001");
		map1.put("type", "Regular");
		
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("id",id);
		map2.put("type", "Chocolate");
		
		List<HashMap<String, Object>> batter = new ArrayList<HashMap<String,Object>>();
		batter.add(map1);
		batter.add(map2);
		
		HashMap<String, List<HashMap<String, Object>>> batters = new HashMap<String, List<HashMap<String,Object>>>();
		batters.put("batter", batter);
		
//		Toppings
		HashMap<String, String> tooping1  = new HashMap<String, String>();
		tooping1.put("id", "5001");
		tooping1.put("type", "None");
	
		HashMap<String, String> tooping2  = new HashMap<String, String>();
		tooping2.put("id", "5002");
		tooping2.put("type", "Glazed");
		
		HashMap<String, String> tooping3  = new HashMap<String, String>();
		tooping3.put("id", "5005");
		tooping3.put("type", "Sugar");
		
		List<HashMap<String, String>> object = new ArrayList<HashMap<String,String>>();
		object.add(tooping1);
		object.add(tooping2);
		object.add(tooping3);
		
//		Combing all thing
		HashMap<String, Object> mainObject =  new HashMap<String, Object>();
		mainObject.put("id", "0001");
		mainObject.put("type", "donut");
		mainObject.put("name", "Cake");
		mainObject.put("ppu", 0.55);
	    mainObject.put("batters", batters);
	    mainObject.put("topping",object);
		
		RestAssured.baseURI = "https://6e8d3849-3509-458d-a497-0e7c55b68ad2.mock.pstmn.io";
		
		given()
		
	    .header("X-Do-Not-Track", "true")
		
		.contentType(ContentType.JSON)
		
		.body(mainObject)
		
		.log().all()
		
		.when()
		
		.post("/post/complexJson")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
	}
	
	
	
}
