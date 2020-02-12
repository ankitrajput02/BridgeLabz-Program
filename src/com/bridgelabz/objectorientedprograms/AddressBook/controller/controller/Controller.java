package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import model.PersonDetails;



public class Controller {
	ObjectMapper objectMapper=new ObjectMapper();
	File file=new File("/home/admin1/workspace-pro/AddressBook/JsonFile/address1.json");
	public List<PersonDetails> readFile() throws JsonParseException, JsonMappingException, IOException{
		List<PersonDetails> list=objectMapper.readValue(file, new TypeReference <List<PersonDetails>>() {});
		return list;
	}
	@SuppressWarnings("deprecation")
	public List<PersonDetails> writeFile(List<PersonDetails> list) throws JsonGenerationException, JsonMappingException, IOException{
		objectMapper.defaultPrettyPrintingWriter().writeValue(file, list);
		return list;

	}
}
