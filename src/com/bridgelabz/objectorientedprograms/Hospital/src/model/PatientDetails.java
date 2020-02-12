package model;

public class PatientDetails {
	String patientName;
	int pID;
	long phone;
	int age;
	String assignDoctor;
	public String getAssignDoctor() {
		return assignDoctor;
	}
	public void setAssignDoctor(String assignDoctor) {
		this.assignDoctor = assignDoctor;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setpName(String patientName) {
		this.patientName = patientName;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
