
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import controller.Controller;
import model.CompanyDetail;
import model.CustomerDetail;
import model.TransactionDetail;
import operations.Operations;
import utility.Utility;



public class CommercialData {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Controller controller = new Controller();
		Operations operations = new Operations();

		int choice = 0;

		System.out.println(
				"Select choice: \n1.Add company\n2.Add customer\n3.Buy share from company\n4.Sell share to company\n"
						+ "5.Total shares of all companies\n6.Total shares of all customers");
		try {
			choice = Utility.inputNumber();

			switch (choice) {
			case 1:
				List<CompanyDetail> read1 = controller.readFileCompany(); // reading json file of company
				List<CompanyDetail> list1 = operations.addCompany(read1); // method to add company
				controller.writeFileCompany(list1); // writing json file
				break;
			case 2:
				List<CustomerDetail> read2 = controller.readFileCustomer();// reading json file of customer
				List<CustomerDetail> list2 = operations.addCustomer(read2);// method to add company
				controller.writeFileCustomer(list2);// writing json file
				break;
			case 3:
				List<CompanyDetail> read5 = controller.readFileCompany();// reading json file of company
				List<CustomerDetail> read6 = controller.readFileCustomer();// reading json file of customer
				List<TransactionDetail> transactionList1 = new LinkedList<>();
				List<CustomerDetail> customerList1 = operations.buyShare(read5, read6, transactionList1); // method to
				// buy
				// shares
				controller.writeFileCustomer(customerList1);// writing json file
				break;
			case 4:
				List<CompanyDetail> read3 = controller.readFileCompany();// reading json file of company
				List<CustomerDetail> read4 = controller.readFileCustomer();// reading json file of customer
				List<TransactionDetail> transactionList = new LinkedList<>();
				List<CustomerDetail> customerList = operations.sellShare(read3, read4, transactionList); // method to
				// sell
				// shares
				controller.writeFileCustomer(customerList);// writing json file
				break;
			case 5:
				List<CompanyDetail> read7 = controller.readFileCompany();// reading json file of company
				int noOfStocksComp = operations.totalSharesOfCompanies(read7); // method to calculate total shares of
				// company
				System.out.println("Total number of stocks of Companies " + noOfStocksComp);
				break;
			case 6:
				List<CustomerDetail> read8 = controller.readFileCustomer();// reading json file of customer
				int noOfStocksCust = operations.totalSharesOfCustomers(read8); // method to calculate total shares of
				// customer
				System.out.println("Total number of stocks " + noOfStocksCust);
				break;

			default:
				System.out.println("Enter correct choice");
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter integer only");

		}

	}

}