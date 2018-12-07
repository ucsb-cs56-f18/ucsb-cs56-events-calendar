package edu.ucsb.cs56.eventsCalendar.service;

import edu.ucsb.cs56.eventsCalendar.bean.Event;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.springframework.util.StreamUtils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.Charset;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ToJava {

	public static byte [] readByteDataFromResourceFile(String filename) throws java.io.IOException {
		java.io.InputStream in = new ToJava().getClass().getResourceAsStream(filename);
		byte[] data = StreamUtils.copyToByteArray(in);
		return data;
	}

	public static List eventsToList() throws java.io.IOException, java.net.URISyntaxException {
 		byte [] jsonData = readByteDataFromResourceFile("/developerApi.json");
 		ObjectMapper om = new ObjectMapper();
    		List<Event> list = om.readValue(jsonData, new TypeReference<List<Event>>(){});
    		return list;
	}

	public static void main(String [] args) throws java.io.IOException, java.net.URISyntaxException {
 		System.out.println("ToJava Demo");

 		// read buildings.json into a List<BuildingCode>
 		byte [] jsonData = readByteDataFromResourceFile("/developerApi.json");
 		ObjectMapper om = new ObjectMapper();
	    	List<Event> list = om.readValue(jsonData, new TypeReference<List<Event>>(){});
 		System.out.println(list);
	}
}

