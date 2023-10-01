package FeatchData;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetDataFormReadyMadeJson 
{

     @Test
     public void getData()
     {
//    	 String body = "{\r\n" + 
//    	 		"\"dashboard\": {\r\n" + 
//    	 		"\"purchaseAmount\": 910,\r\n" + 
//    	 		"\"website\": \"www.abc.com\"\r\n" + 
//    	 		"},\r\n" + 
//    	 		"\"courses\": [\r\n" + 
//    	 		"{\r\n" + 
//    	 		"\"title\": \"Selenium Python\",\r\n" + 
//    	 		"\"price\": 50,\r\n" + 
//    	 		"\"copies\": 6\r\n" + 
//    	 		"},\r\n" + 
//    	 		"{\r\n" + 
//    	 		"\"title\": \"Cypress\",\r\n" + 
//    	 		"\"price\": 40,\r\n" + 
//    	 		"\"copies\": 4\r\n" + 
//    	 		"},\r\n" + 
//    	 		"{\r\n" + 
//    	 		"\"title\": \"RPA\",\r\n" + 
//    	 		"\"price\": 45,\r\n" + 
//    	 		"\"copies\": 10\r\n" + 
//    	 		"}\r\n" + 
//    	 		"]\r\n" + 
//    	 		"}";
//    	 
//    	 This is not recommended way to declare the body so we can store it on other class and call it
    	 
    	 JsonPath jp = new JsonPath(BodyDefination.getBody());
    	 
    	 String website = jp.getString("dashboard.website");
    	 
    	 System.out.println(website);
    	 
//    	Print the No of Course Return by Api
    	 
    	 int size = jp.getInt("courses.size()");
    	 
    	 System.out.println("No of the Courses = " + size );
    	 
//    	 Print the PurchaseAmount
    	 
    	 int amount = jp.getInt("dashboard.purchaseAmount");
    	 
    	 System.out.println("PurchaseAmount = " + amount);
    	 
//    	 Print the title of the first courses
    	 
    	String title = jp.getString("courses[0].title");
    	
    	System.out.println("Title of the first Courses = " + title);
    	 
//    	 Print All courses titles and their respective Prices
    	
    	 for(int i=0;i<size;i++)
    	 {
    	   String title1 = jp.getString("courses["+i+"].title");
    	   
    	   int price = jp.getInt("courses["+i+"].price");
    	   
    	   System.out.println(title1 + " " + ":" + " " + price);
    	 }
    	 
//    	 Print the number of copies sold by RPA
    	 
    	 int copies = jp.getInt("courses[2].copies");
    	 
    	 System.out.println("Copies sold by RPA = " + copies);
    	 
//    	 Verify sum of all course prices matches with purchase amount 
    	 
    	 int sum = 0;
    	 
    	 for(int i=0;i<size;i++)
    	 {
    		 int price1 = jp.getInt("courses["+i+"].price");
    		 
    		 int copy = jp.getInt("courses["+i+"].copies");
    		 
    		 sum = sum + price1 * copy;
    	 }
    	  
    	 System.out.println("Sum of all Courses = " + sum);
    	 
    	 Assert.assertEquals(amount, sum);
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
;