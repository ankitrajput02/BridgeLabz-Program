package operations;

import java.util.List;

import model.PersonDetails;
import utility.Utility;

public class Operations {

	PersonDetails details=new PersonDetails();
	public List<PersonDetails> addUser(List<PersonDetails> list){
		System.out.println("Enter First Name");
		String fName=Utility.inputString();
		details.setfName(Utility.stringValidation(fName));
		System.out.println("Enter Last Name");
		String lName=Utility.inputString();
		details.setlName(Utility.stringValidation(lName));
		System.out.println("Enter Address");
		String address=Utility.inputString();
		details.setAddress(Utility.stringValidation(address));
		System.out.println("Enter City");
		String city=Utility.inputString();
		details.setCity(Utility.stringValidation(city));
		System.out.println("Enter State");
		String state=Utility.inputString();
		details.setState(Utility.stringValidation(state));
		System.out.println("Enter Zip");
		details.setZip(Utility.inputlong());
		System.out.println("Enter Mobile Number");
		details.setPhone(Utility.inputlong());
		list.add(details);
		return list;

	}
	public List<PersonDetails> deleteUser(List<PersonDetails> list,String name){
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getfName().equalsIgnoreCase(name)) {
				list.remove(i);
				System.out.println("Person Details Deleted");
			}
			else {
				System.out.println("Person not in List");
			}
		}
		return list;
	}
	public List<PersonDetails> editUser(List<PersonDetails>list ){
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getfName());
		}
		System.out.println("Enter first name");
		String firstName=Utility.inputString();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getfName().equalsIgnoreCase(firstName)) {
				PersonDetails temp=list.get(i);
				deleteUser(list, firstName);
				int n;
				do {
					System.out.println("1.Last Name\n2.Address\n3.City\n4.State\n5.Zip\n6.Phone");
					System.out.println("Select Choice to edit");
					n=Utility.inputNumber();
					switch(n) {
					case 1:
						System.out.println("Enter Last Name");
						temp.setlName(Utility.inputString());
						System.out.println("Last name Update");
						break;
					case 2:
						System.out.println("Enter Address");
						temp.setAddress(Utility.inputString());
						System.out.println("Address update");
						break;
					case 3:
						System.out.println("Enter City");
						temp.setCity(Utility.inputString());
						System.out.println("City Update");
						break;
					case 4:
						System.out.println("Enter State");
						temp.setState(Utility.inputString());
						System.out.println("State Update");
						break;
					case 5:
						System.out.println("Enter Zip Code");
						temp.setZip(Utility.inputNumber());
						System.out.println("Zip Code Update");
						break;
					case 6:
						System.out.println("Enter Mobile Number");
						temp.setPhone(Utility.inputlong());
						System.out.println("Mobile Number Update");
						break;
					case 7:
						break;
					default:
						System.out.println("Enter correct choice");
						break;
					}
					list.add(temp);
				}while(n!=7);
			}
		}
		return list;

	}
	
	public List<PersonDetails> sortByZip(List<PersonDetails>list){
		for(int i=0; i < list.size() ; i++) {
			for(int j=0;j < list.size() ; j++) {
				if(list.get(i).getZip() > list.get(j).getZip()) {
					PersonDetails temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;

	}
	public List<PersonDetails> sortByLastName(List<PersonDetails>list){
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getlName().compareToIgnoreCase(list.get(j).getlName()) > 0) {
					PersonDetails temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;

	}
	public List<PersonDetails> getDetails(List<PersonDetails>list){
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Enter First Name to get Details");
		String firstName=Utility.inputString();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getfName().equalsIgnoreCase(firstName)) {
				System.out.println("Name :"+list.get(i).getfName()+" "+list.get(i).getlName()+
						"\nAddress :"+list.get(i).getAddress()+"City :"+list.get(i).getCity()+
						"State :"+list.get(i).getState()+"Zip Code :"+
						list.get(i).getZip()+"Mobile No.:"+list.get(i).getPhone());
			}
		}
		return list;

	}
}
