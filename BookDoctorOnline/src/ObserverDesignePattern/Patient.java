package ObserverDesignePattern;

import FactoryDesignePattern.Person;
import IteratorDesignePattern.PersonCollection;
import IteratorDesignePattern.PersonIteratorClass;

public class Patient extends Person{

	private String patientId;
	private String patientName;
	private String patientMobileNumber;
	private String patientUserName;
	private String patientPassword;
	
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientMobileNumber() {
		return patientMobileNumber;
	}

	public void setPatientMobileNumber(String patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public String getPatientUserName() {
		return patientUserName;
	}

	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}


	@Override
	public Object createPersonObject() {
		Patient p = new Patient();
		return p;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientMobileNumber="
				+ patientMobileNumber + ", patientUserName=" + patientUserName + ", patientPassword=" + patientPassword
				+ "]";
	}
	
}
