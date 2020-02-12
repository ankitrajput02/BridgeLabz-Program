package clinic;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import utility.Utility;
import controller.Controller;
import model.Appointment;
import model.DoctorDetails;
import model.PatientDetails;
import operations.Operations;

public class ClinicManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Controller controller=new Controller();
		Operations operations=new Operations();
		System.out.println("Select choice....\n1.To Add Doctor\n2.To Add Patient\n3.Doctor Details"
				+ "\n4.Patient Details\n5.Take Appointment\n6.Appointment Details\n7.Search Doctor"
				+ "\n8.Search Patient");
		try {
			int ch=Utility.inputNumber();
			switch(ch) {
			case 1:
				List<DoctorDetails> read1 = controller.readFileDoctor();
				List<DoctorDetails> list1 = operations.addDoctor(read1);
				controller.writeFileDoctor(list1);
				break;
			case 2:
				List<PatientDetails> read2 = controller.readFilePatient();
				List<PatientDetails> list2 = operations.addPatient(read2);
				controller.writeFilePatient(list2);
				break;
			case 3:
				List<DoctorDetails> read3 = controller.readFileDoctor();
				operations.getDoctorDetails(read3);
				break;
			case 4:
				List<PatientDetails> read4 = controller.readFilePatient();
				operations.getPatientDetails(read4);
				break;
			case 5:
				List<Appointment> read5 = controller.readFileAppo();
				List<PatientDetails> patientDetails = controller.readFilePatient();
				List<DoctorDetails> doctorDetails = controller.readFileDoctor();
				List<Appointment> list5 = operations.takeAppointment(read5,patientDetails,doctorDetails);
				controller.writeFileAppo(list5);
				break;
			case 6:
				List<Appointment> read6 = controller.readFileAppo();
				operations.appointmentDetails(read6);
				break;
			case 7:
				List<DoctorDetails> read7 = controller.readFileDoctor();
				operations.searchDoctor(read7);
				break;
			case 8:
				List<PatientDetails> read8 = controller.readFilePatient();
				operations.searchPatient(read8);
				break;
			default:
				System.out.println("Enter correct choice");

			}	
		}catch(InputMismatchException e){
			System.out.println("Enter Integer Only");
		}

	}

}
