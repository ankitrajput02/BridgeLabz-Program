package book;

import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import controller.Controller;
import model.PersonDetails;
import operations.Operations;
import utility.Utility;

public class AddressBook {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Operations operations = new Operations();
		Controller controller = new Controller();
		List<PersonDetails> read = controller.readFile();
		for (PersonDetails pd : read) {
			System.out.println("Name :" + pd.getfName() + " " + pd.getlName() + " Address :" + pd.getAddress()
					+ " City :" + pd.getCity() + " State :" + pd.getCity() + " State :" + pd.getState() + " Zip Code :"
					+ pd.getZip() + " Mobile :" + pd.getPhone());
		}
		int ch;
		do {
			System.out.println(
					"Select Choice...\n1.Add Person Details\n2.Delete Person data\n3.Edit Person Details\n4.List Sort By Zip\n5.List Sort By Last Name\n6.Get Person Details\n7.Exit");
			ch = Utility.inputNumber();
			switch (ch) {
			case 1:
				// Add user data
				List<PersonDetails> read1 = controller.readFile();
				List<PersonDetails> list1 = operations.addUser(read1);
				controller.writeFile(list1);
				break;
			case 2:
				// delete user data
				List<PersonDetails> read2 = controller.readFile();
				for (int i = 0; i < read2.size(); i++) {
					System.out.println(read2.get(i).getfName());
				}
				System.out.println("Enter First name to delete user data");
				String name = Utility.inputString();
				List<PersonDetails> list2 = operations.deleteUser(read2, name);
				controller.writeFile(list2);
				break;
			case 3:
				// edit user
				List<PersonDetails> read3 = controller.readFile();
				List<PersonDetails> list3 = operations.editUser(read3);
				controller.writeFile(list3);
				break;
			case 4:
				// sort by zip
				List<PersonDetails> read4 = controller.readFile();
				List<PersonDetails> list4 = operations.sortByZip(read4);
				System.out.println("Sorted By Zip Code");
				for (PersonDetails details : list4) {
					System.out.println(details.getfName() + "\t" + details.getlName() + "\t" + details.getAddress()
							+ "\t" + details.getCity() + "\t" + details.getState() + "\t" + details.getZip() + "\t"
							+ details.getPhone());
				}
				break;
			case 5:
				// sort by Last name
				List<PersonDetails> read5 = controller.readFile();
				List<PersonDetails> list5 = operations.sortByLastName(read5);
				System.out.println("Sorted By Last Name");
				for (PersonDetails details : list5) {
					System.out.println(details.getfName() + "\t" + details.getlName() + "\t" + details.getAddress()
							+ "\t" + details.getCity() + "\t" + details.getState() + "\t" + details.getZip() + "\t"
							+ details.getPhone());
				}
				break;
			case 6:
				// Get Person Details
				List<PersonDetails> read6 = controller.readFile();
				operations.getDetails(read6);
				break;
			default:
				System.out.println("Please enter correct choice");
				return;
			}
		} while (ch != 7);
	}

}
