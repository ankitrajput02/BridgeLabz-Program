package operations;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import controller.Controller;
import model.CompanyDetail;
import model.CustomerDetail;
import model.TransactionDetail;
import utility.Utility;

public class Operations {

	CompanyDetail companyDetail = new CompanyDetail();
	CustomerDetail customerDetail = new CustomerDetail();
	TransactionDetail transactionDetail = new TransactionDetail();
	Controller controller = new Controller();

	public List<CompanyDetail> addCompany(List<CompanyDetail> compList) { // method to add new stock
		try {
			// taking required data from user
			System.out.println("Enter the name of company: ");
			companyDetail.setCompanyName(Utility.stringValidation(Utility.inputString()));
			System.out.println("Enter shares of company: ");
			companyDetail.setNoOfShares(Utility.inputNumber());
			System.out.println("Set price of 1 share: ");
			companyDetail.setPrice(Utility.inputFloat());
			compList.add(companyDetail);
			System.out.println("Data added");
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		return compList; // returning list of data
	}

	public List<CustomerDetail> addCustomer(List<CustomerDetail> custList) { // method to add new customer
		try {
			// taking required data from user
			System.out.println("Enter the name of customer: ");
			customerDetail.setCustName(Utility.stringValidation(Utility.inputString()));
			custList.add(customerDetail);
			System.out.println("Data added");
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		return custList; // returning list of data
	}

	public List<CustomerDetail> sellShare(List<CompanyDetail> compList, List<CustomerDetail> custList,
			List<TransactionDetail> txnList) throws JsonGenerationException, JsonMappingException, IOException { // method
		// to
		// sell
		// shares
		// of
		// user
		for (int i = 0; i < compList.size(); i++) {
			System.out.println(compList.get(i).getCompanyName()); // showing companies by name
		}
		int temp = 0;
		int findCust = 0;
		int findComp = 0;
		System.out.println("Enter name of company to sell shares: ");
		try {
			String compName = Utility.stringValidation(Utility.inputString());
			for (int i = 0; i < compList.size(); i++) {
				if (compList.get(i).getCompanyName().equalsIgnoreCase(compName)) { // matching user input with file
					findComp = 1;
					transactionDetail.setCompanyName(compName);
					// showing available shares of customer to sell
					for (int j = 0; j < custList.size(); j++) {
						System.out.println(custList.get(j).getCustName() + " " + custList.get(j).getNoOfShares());
					}
					System.out.println("Enter customer name to sell shares: ");
					String custName = Utility.stringValidation(Utility.inputString());
					for (int j = 0; j < custList.size(); j++) {
						if (custList.get(j).getCustName().equalsIgnoreCase(custName)) { // matching user input with file
							findCust = 1;
							transactionDetail.setCustomerName(custName);
							System.out.println("your available shares are " + custList.get(j).getNoOfShares());
							System.out.println("Enter number of shares to sell: ");
							int numOfShare = Utility.inputNumber();
							if (numOfShare <= custList.get(j).getNoOfShares()) {
								temp = 1;
								int custRemainingShares = custList.get(j).getNoOfShares() - numOfShare; // calculating
								// remaining
								// shares of
								// customer
								// displaying customer shares after selling
								System.out.println("After selling " + numOfShare + " shares, remaining shares of "
										+ custList.get(j).getCustName() + " are " + custRemainingShares);
								int compRemainingShares = compList.get(i).getNoOfShares() + numOfShare; // calculating
								// remaining
								// shares of
								// company
								// displaying company shares after selling
								System.out.println("After selling " + numOfShare + " shares, remaining shares of "
										+ compList.get(i).getCompanyName() + " are " + compRemainingShares);
								LocalDateTime datetime = LocalDateTime.now();
								// adding data to list of company and customer
								custList.get(j).setNoOfShares(custRemainingShares);
								compList.get(i).setNoOfShares(compRemainingShares);
								transactionDetail.setNoOfCustomerShares(custRemainingShares);
								transactionDetail.setNoOfCompanyShares(compRemainingShares);
								transactionDetail.setDatetime(datetime);
							}
							if (temp == 0) {
								System.out.println("You dont have enough shares to sell!");
							}
						}
					}
					if (findCust == 0) {
						System.out.println("User not found!");
					}
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		if (findComp == 0) {
			System.out.println("Company not found!");
		}
		txnList.add(transactionDetail);
		controller.writeFileCompany(compList); // writing company list in json file
		controller.writeFileTransaction(txnList); // writing transaction list in json file
		return custList; // returning customer list
	}

	public List<CustomerDetail> buyShare(List<CompanyDetail> compList, List<CustomerDetail> custList,
			List<TransactionDetail> txnList) throws JsonGenerationException, JsonMappingException, IOException { // method
		// to
		// sell
		// shares
		// showing list of companies and available shares
		for (int i = 0; i < compList.size(); i++) {
			System.out.println(compList.get(i).getCompanyName() + " " + compList.get(i).getNoOfShares());
		}
		int temp = 0;
		int findCust = 0;
		int findComp = 0;
		System.out.println("Enter name of company to buy shares: ");
		try {
			String compName = Utility.stringValidation(Utility.inputString());
			for (int i = 0; i < compList.size(); i++) {
				if (compList.get(i).getCompanyName().equalsIgnoreCase(compName)) { // matching user input with list
					findComp = 1;
					transactionDetail.setCompanyName(compName);
					// showing list of customers by name
					for (int j = 0; j < custList.size(); j++) {
						System.out.println(custList.get(j).getCustName());
					}
					System.out.println("Enter customer name to buy shares: ");
					String custName = Utility.stringValidation(Utility.inputString());
					for (int j = 0; j < custList.size(); j++) {
						if (custList.get(j).getCustName().equalsIgnoreCase(custName)) { // matching user input with list
							findCust = 1;
							transactionDetail.setCustomerName(custName);
							System.out.println("available shares of company " + compList.get(i).getNoOfShares()); // showing
							// available
							// shares
							// of
							// company
							System.out.println("Enter number of shares to buy: ");
							int numOfShares = Utility.inputNumber();
							if (numOfShares <= compList.get(i).getNoOfShares()) { // checking no of shares to buy are
								// less than available shares of
								// company
								temp = 1;
								int custRemainingShares = custList.get(j).getNoOfShares() + numOfShares; // calculating
								// remaining
								// shares of
								// customer
								System.out.println("After buying " + numOfShares + " shares, total shares of "
										+ custList.get(j).getCustName() + " are " + custRemainingShares);
								int compRemainingShares = compList.get(i).getNoOfShares() - numOfShares; // calculating
								// remaining
								// shares of
								// company
								System.out.println("After buying " + numOfShares + " shares, remaining shares of "
										+ compList.get(i).getCompanyName() + " are " + compRemainingShares);
								LocalDateTime datetime = LocalDateTime.now();
								// adding data to list of company and customer
								custList.get(j).setNoOfShares(custRemainingShares);
								compList.get(i).setNoOfShares(compRemainingShares);
								transactionDetail.setNoOfCustomerShares(custRemainingShares);
								transactionDetail.setNoOfCompanyShares(compRemainingShares);
								transactionDetail.setDatetime(datetime);
							}
							if (temp == 0) {
								System.out.println("you are crossing the limit of company shares!");
							}
						}
					}
					if (findCust == 0) {
						System.out.println("User not found!");
					}
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter valid input!");
		}
		if (findComp == 0) {
			System.out.println("Company not found!");
		}
		txnList.add(transactionDetail);
		controller.writeFileCompany(compList); // writing company list json file
		controller.writeFileTransaction(txnList); // writing transaction list json file
		return custList; // returning list of customer
	}

	public int totalSharesOfCompanies(List<CompanyDetail> compList) { // method to calculate total shares of comoanies
		int allShares = 0;
		// showing total shares of all companies
		for (int i = 0; i < compList.size(); i++) {
			System.out.println(
					"Name: " + compList.get(i).getCompanyName() + "\nShares: " + compList.get(i).getNoOfShares());
			allShares = allShares + compList.get(i).getNoOfShares();
		}
		return allShares; // returning list of all shares
	}

	public int totalSharesOfCustomers(List<CustomerDetail> custList) { // method to calculate total shares of customers
		int allShares = 0;
		// showing total shares of all customers
		for (int i = 0; i < custList.size(); i++) {
			System.out
			.println("Name: " + custList.get(i).getCustName() + "\nShares: " + custList.get(i).getNoOfShares());
			allShares = allShares + custList.get(i).getNoOfShares();
		}
		return allShares; // returning list of all shares
	}

}