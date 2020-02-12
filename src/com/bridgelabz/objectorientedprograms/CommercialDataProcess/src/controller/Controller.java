package controller;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import model.CompanyDetail;
import model.CustomerDetail;
import model.TransactionDetail;


public class Controller {
	CompanyDetail companyDetails = new CompanyDetail();
	CustomerDetail customerDetails = new CustomerDetail();
	ObjectMapper objectMapper = new ObjectMapper();
	File companyFile = new File("/home/admin1/workspace-pro/CommercialDataProcess/company.json");
	File customerFile = new File("/home/admin1/workspace-pro/CommercialDataProcess/customer.json");
	File transactionFile = new File("/home/admin1/workspace-pro/CommercialDataProcess/transaction.json");

	public List<CompanyDetail> readFileCompany() throws JsonParseException, JsonMappingException, IOException {
		List<CompanyDetail> read = objectMapper.readValue(companyFile, new TypeReference<List<CompanyDetail>>() {
		});
		return read;
	}

	@SuppressWarnings("deprecation")
	public void writeFileCompany(List<CompanyDetail> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.defaultPrettyPrintingWriter().writeValue(companyFile, list);
	}

	public List<CustomerDetail> readFileCustomer() throws JsonParseException, JsonMappingException, IOException {
		List<CustomerDetail> read = objectMapper.readValue(customerFile, new TypeReference<List<CustomerDetail>>() {
		});
		return read;
	}

	@SuppressWarnings("deprecation")
	public void writeFileCustomer(List<CustomerDetail> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.defaultPrettyPrintingWriter().writeValue(customerFile, list);
	}

	public List<TransactionDetail> readFileTransaction() throws JsonParseException, JsonMappingException, IOException {
		List<TransactionDetail> read = objectMapper.readValue(transactionFile, new TypeReference<List<TransactionDetail>>() {
		});
		return read;
	}

	@SuppressWarnings("deprecation")
	public void writeFileTransaction(List<TransactionDetail> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.defaultPrettyPrintingWriter().writeValue(transactionFile, list);
	}

}