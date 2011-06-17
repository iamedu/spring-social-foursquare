package org.springframework.social.foursquare.api.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.foursquare.api.FoursquareUser;
import org.springframework.social.test.client.MockRestServiceServer;

public class AbstractFoursquareApiTest {

	public FoursquareTemplate foursquare;
	
	protected MockRestServiceServer mockServer;

	protected HttpHeaders responseHeaders;
	
	@Before
	public void setup() {
		foursquare = new FoursquareTemplate("CLIENT_ID", "ACCESS_TOKEN");
		mockServer = MockRestServiceServer.createServer(foursquare.getRestTemplate());
		responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.APPLICATION_JSON);
	}
	
	public void assertProfile(FoursquareUser profile) {
		assertEquals("Matt", profile.getFirstName());
		assertEquals("Wright", profile.getLastName());
		assertEquals(5, profile.getMayorshipInfo().getTotal());
		assertEquals(555, profile.getCheckinInfo().getTotal());
	}
}