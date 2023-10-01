package com.spotiffy.test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spotiffy.pojo.Playlist;

import API.SpecBulider;

public class CreatePlaylistWithReqResSpec
{

	@Test(priority=1)
	public void createPlaylist()
	{
		Playlist playlist = new Playlist();
		playlist.setName("Dada Kondkye1");
		playlist.setDescription("Marathi Song Collection");
		playlist.setPublic(true);
	
	    Playlist responces = given(SpecBulider.reqSpec())
		
		.body(playlist)
		
		.when()
		
		.post("/users/31vvwjrggfwftqklkq3q3pprbdqe/playlists")
		
		.then()
		
		.spec(SpecBulider.resSpec())
		
		.extract()
		
		.response()
		
		.as(Playlist.class);
	     
	     String actualname = responces.getName();
		
	     String name = playlist.getName();
	     
	     Assert.assertEquals(name,actualname);
	     
	    
	}
}
