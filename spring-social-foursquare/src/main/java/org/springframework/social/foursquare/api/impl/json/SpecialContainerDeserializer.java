package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.springframework.social.foursquare.api.Special;

public class SpecialContainerDeserializer extends AbstractFoursquareDeserializer<SpecialContainer> {

	@Override
	public SpecialContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return new SpecialContainer(deserializeNestedResponseObject(jp, "special", Special.class));
	}
	
}
