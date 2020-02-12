package operations;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import controller.Controller;
import model.Appointment;
import model.DoctorDetails;
import model.PatientDetails;
import utility.Utility;

public class Operations {
	DoctorDetails doctorDetails = new DoctorDetails();
	PatientDetails patientDetails = new PatientDetails();
	Appointment appointment = new Appointment();
	Controller controller = new Controller();

	public List<DoctorDetails> addDoctor(List<DoctorDetails> doctorList) {
		try {
			System.out.println("Enter Doctor Name");
			String dName = Utility.inputString();
			doctorDetails.setdName(Utility.stringValidation(dName));
			System.out.println("Enter Doctor ID");
			int dID = Utility.inputNumber();
			doctorDetails.setdID(dID);
			System.out.println("Enter Doctor Specialization");
			String spec = Utility.inputString();
			doctorDetails.setSpec(Utility.stringValidation(spec));
			System.out.println("Enter Doctor Availability");
			String avail = Utility.inputString();
			doctorDetails.setAvail(Utility.stringValidation(avail));
		} catch (InputMismatchException e) {
			System.out.println("Enter Valid Input");
		}
		doctorList.add(doctorDetails);
		System.out.println("Doctor Details Added");
		return doctorList;
	}

	// Doctor Details Display
	public List<DoctorDetails> getDoctorDetails(List<DoctorDetails> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Name " + list.get(i).getdName() + " ID: " + list.get(i).getdID() + " Specialization: "
					+ list.get(i).getSpec() + " Availability: " + list.get(i).getAvail());
		}

		return list;
	}

	// Patient Details Display
	public List<PatientDetails> getPatientDetails(List<PatientDetails> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Name :" + list.get(i).getPatientName() + " Patient ID :" + list.get(i).getpID()
					+ " Age :" + list.get(i).getAge() + " Mobile Numbers :" + list.get(i).getPhone());
		}
		return list;
	}

	// Search Doctor
	public void searchDoctor(List<DoctorDetails> doctorList) {
		for (int i = 0; i < doctorList.size(); i++) {
			System.out.println(doctorList.get(i).getdName());
		}
		System.out.println("Enter Name of Doctor");
		String name = Utility.inputString();
		int flag = 0;
		for (int i = 0; i < doctorList.size(); i++) {
			if (doctorList.get(i).getdName().equalsIgnoreCase(name)) {
				System.out.println("Name " + doctorList.get(i).getdName() + " ID: " + doctorList.get(i).getdID()
						+ " Specialization: " + doctorList.get(i).getSpec() + " Availability: "
						+ doctorList.get(i).getAvail());
				flag++;
			}
		}
		if (flag == 0) {
			System.out.println("Doctor is not in List");
		}
	}

	// Search Patient
	public void searchPatient(List<PatientDetails> patientList) {
		for (int i = 0; i < patientList.size(); i++) {
			System.out.println(patientList.get(i).getPatientName());
		}
		System.out.println("Enter Name of Patient");
		String name = Utility.inputString();
		int flag = 0;
		for (int i = 0; i < patientList.size(); i++) {
			if (patientList.get(i).getPatientName().equalsIgnoreCase(name)) {
				System.out.println("Name " + patientList.get(i).getPatientName() + " ID: " + patientList.get(i).getpID()
						+ " Age :" + patientList.get(i).getAge() + " Mobile Number: " + patientList.get(i).getPhone());
				flag++;
			}
		}
		if (flag == 0) {
			System.out.println("Patient is Not in List");
		}
	}

	public List<PatientDetails> addPatient(List<PatientDetails> patientList) {
		try {
			System.out.println("Enter Name of Patient");
			String sName = Utility.inputString();
			patientDetails.setpName(Utility.stringValidation(sName));
			System.out.println("Enter Patient ID");
			int pID = Utility.inputNumber();
			patientDetails.setpID(pID);
			System.out.println("Enter Mobile no.");
			long phone = Utility.inputlong();
			patientDetails.setPhone(phone);
			System.out.println("Enter Age of Patient");
			int age = Utility.inputNumber();
			patientDetails.setAge(age);

		} catch (InputMismatchException e) {
			System.out.println("Enter Valid Input");
		}
		patientList.add(patientDetails);
		System.out.println("Patient Details Added");
		return patientList;
	}

	public List<Appointment> takeAppointment(List<Appointment> read5, List<PatientDetails> patientList,
			List<DoctorDetails> doctorList) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
			System.out.println("Available Doctors");
			getDoctorDetails(doctorList);
			System.out.println("Select available Doctor");
			String dName = Utility.inputString();
			for (int i = 0; i < doctorList.size(); i++) {
				if (doctorList.get(i).getdName().equalsIgnoreCase(dName)) {
					System.out.println("Enter Patient Name ");
					String patientName = Utility.inputString();
					patientDetails.setpName(patientName);
					appointment.setPatientName(patientName);
					//System.out.println("Assign Doctor "+dName);
					patientDetails.setAssignDoctor(dName);
					appointment.setDoctorName(dName);
					System.out.println("Enter Patient ID");
					patientDetails.setpID(Utility.inputNumber());
					System.out.println("Enter Patient age");
					patientDetails.setAge(Utility.inputNumber());
					System.out.println("Enter Patients Mobile no.");
					patientDetails.setPhone(Utility.inputlong());
					int appoint = doctorList.get(i).getDoctorAppointment();
					appoint = appoint + 1;
					doctorList.get(i).setDoctorAppointment(appoint);
					appointment.setDoctorAppointment(appoint);
					appointment.setPatientID(patientList.size()+1);
					appointment.setDoctorSpecialization(doctorList.get(i).getSpec());
					appointment.setDoctorAvailability(doctorList.get(i).getAvail());
				}
			}
			patientList.add(patientDetails);
			read5.add(appointment);
			controller.writeFileDoctor(doctorList);
			controller.writeFilePatient(patientList);
	
		return read5;

	}

	public List<Appointment> appointmentDetails(List<Appointment> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Doctor Name :" + list.get(i).getDoctorName() + "Patient Name :"
					+ list.get(i).getPatientName() + "Patient ID :" + list.get(i).getPatientID()
					+ "Doctor Specialization :" + list.get(i).getDoctorSpecialization() + "Doctor Availability "
					+ list.get(i).getDoctorAvailability() + "Doctor Appointment " + list.get(i).getDoctorAppointment());
		}
		return list;
	}

}
