package model;
public class DoctorDetails {
	String dName;
	int dID;
	String spec;
	String avail;
	private int doctorAppointment;
	public int getDoctorAppointment() {
		return doctorAppointment;
	}
	public void setDoctorAppointment(int doctorAppointment) {
		this.doctorAppointment = doctorAppointment;
	}
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getAvail() {
		return avail;
	}
	public void setAvail(String avail) {
		this.avail = avail;
	}
}
