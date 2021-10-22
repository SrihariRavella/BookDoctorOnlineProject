package ObserverDesignePattern;

import FactoryDesignePattern.Person;

public class Doctor extends Person{

	private String doctorId;
	private String doctorName;
	private String doctorUserName;
	private String doctorPassword;
	
	public Doctor() {
		
	}
	public Doctor(String doctorId, String doctorName, String doctorUserName, String doctorPassword) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorUserName = doctorUserName;
		this.doctorPassword = doctorPassword;
	}
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorUserName() {
		return doctorUserName;
	}
	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}
	public String getDoctorPassword() {
		return doctorPassword;
	}
	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	@Override
	public Object createPersonObject() {
		Doctor d = new Doctor();
		return d;
	}
	
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName +  ", doctorUserName=" + doctorUserName + ", doctorPassword=" + doctorPassword
				+ "]";
	}
	
}
