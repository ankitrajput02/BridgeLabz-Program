package controller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import model.StockDetails;

/**Controller class to perform read and write operations Using ObjectMapper
 * 
 *
 */
public class MyController {
	ObjectMapper objectMapper = new ObjectMapper();
	/**An abstract representation of file and directory pathnames.
	 * 
	 */
	File file = new File("/home/admin1/workspace-pro/StockAccountManagement/src/stockmanagement.json");

	public List<StockDetails> readFile() throws IOException{
		List<StockDetails> list = objectMapper.readValue(file, new TypeReference <List<StockDetails>>() {});
		return list;

	}
	@SuppressWarnings("deprecation")
	public List<StockDetails> writeFile(List<StockDetails> list) throws IOException {
		// TODO Auto-generated method stub
		objectMapper.defaultPrettyPrintingWriter().writeValue(file, list);
		return list;
	}


}