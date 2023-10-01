package com.spotiffy.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spotiffy.pojo.Playlist;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateAndGetPlayList 
{	
	RequestSpecification req;
	ResponseSpecification respo;
	String playlistId;
	
	@BeforeClass
	public void specBulider()
	{
		RequestSpecBuilder requestspec = new RequestSpecBuilder();
		requestspec.setBaseUri("https://api.spotify.com");
		requestspec.setBasePath("/v1");
		requestspec.setContentType(ContentType.JSON);
		requestspec.addHeader("Authorization", "Bearer BQDJjymjh8VEsD3xXe-DN6LLVWzE-0SxytX2i7lJDFIUDf4N47ER0ZggSWAvME9hIY3Q_ugg_6vmxoCZzbSd2o190Y0Av_pWD-OUrErG6KGAECc8pO6B7HhdmLibLes9OF7sMM94UFQAu-dyfem5iiXpgdvbQJzINkT1nMwredvwZDx9KfJnMMqwYLIU4g7EvIzDLBs9dr4QDIh2U2Q1S6-UfPIQZIqTau2JUCc-t2hUJWyDIKNEChkRvCMF9O0rzC-csAeRbX9l2P-z");
		requestspec.log(LogDetail.ALL);
	    req = requestspec.build();
	    
	    ResponseSpecBuilder responsespec = new ResponseSpecBuilder();
	    responsespec.expectContentType(ContentType.JSON);
	    responsespec.log(LogDetail.ALL);
	    respo = responsespec.build();
	}
	
	@Test(priority=1)
	public void createPlaylist()
	{
		Playlist playlist = new Playlist();
		playlist.setName("Dada Kondkye");
		playlist.setDescription("Marathi Song Collection");
		playlist.setPublic(true);
	
	    Playlist responces = given(req)
		
		.body(playlist)
		
		.when()
		
		.post("/users/31vvwjrggfwftqklkq3q3pprbdqe/playlists")
		
		.then()
		
		.spec(respo)
		
		.extract()
		
		.response()
		
		.as(Playlist.class);
	     
	     String actualname = responces.getName();
		
	     String name = playlist.getName();
	     
	     Assert.assertEquals(name,actualname);
	     
	     playlistId = responces.getId();
	    
	}
	
	@Test(priority=2)
	public void getPlaylist()
	{
		
		given(req)
		
		.when()
		
		.get("/playlists/"+playlistId)
		
		.then()
		
		.spec(respo)
		
		.extract()
		
		.response();
		
	}
}
