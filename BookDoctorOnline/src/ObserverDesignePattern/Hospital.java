package ObserverDesignePattern;

import java.util.ArrayList;
import java.util.List;

import OnlineDoctor.Service;

public class Hospital {
	
	private List<Doctor> doctors = new ArrayList<>();
	private List<Patient> patients = new ArrayList<>();
	
	private List<String> slot1 = new ArrayList<>(10);
	private List<String> slot2 = new ArrayList<>(10);
	private List<String> slot3 = new ArrayList<>(10);
	private List<String> slot4 = new ArrayList<>(10);
	
	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public void registerDoctor(Doctor d) {
		getDoctors().add(d);
		System.out.println("Doctor Registration Success");
	}
	
	public void loginDoctor(String username,String password) throws InterruptedException {
		if(getDoctors().isEmpty()?false:true) {
			for(Doctor p:getDoctors()) {
				if(p.getDoctorUserName().equals(username)) {
					if(p.getDoctorPassword().equals(password)) {
						Service.doctorAfterLogin(username, password);
						break;
					}else {
						System.out.println("Invalid Password");
					}
				}else {
					System.out.println("Invalid UserName");
				}
			}
		}else {
			System.out.println("No Doctors To Show");
		}
	}
	
	public void registerPatient(Patient p) {
		patients.add(p);
		System.out.println("Patient Registration Success");
	}
	
	public void loginPatient(String username,String password) throws InterruptedException {
		if(patients.isEmpty()?false:true) {
			for(Patient p:patients) {
				if(p.getPatientUserName().equals(username)) {
					if(p.getPatientPassword().equals(password)) {
						Service.patientAfterLogin(username,password);
						break;
					}else {
						System.out.println("Invalid Password");
					}
				}else {
					System.out.println("Invalid UserName");
				}
			}
		}else {
			System.out.println("No Patients to Show");
		}
	}
	

	public List<Doctor> getDoctors() {
		return this.doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	public void addSlot1() {
		slot1.add("booked");
		System.out.println("Booked Slot1 remaining slots - "+(10-slot1.size()));
	}
	
	public void addSlot2() {
		slot2.add("booked");
		System.out.println("Booked Slot2 remaining slots - "+(10-slot2.size()));
	}

	public void addSlot3() {
		slot3.add("booked");
		System.out.println("Booked Slot3 remaining slots - "+(10-slot3.size()));
	}

	public void addSlot4() {
		slot4.add("booked");
		System.out.println("Booked Slot4 remaining slots - "+(10-slot4.size()));
	}
	

	public void notificationPatients() {
		for(Patient p:patients) {
			System.out.println(p.getPatientName()+" Doctor will be delay 30 Minutes");
		}
	}
	
	public void totalDoctors() {
		System.out.println("Total Doctors : "+doctors.size());
	}
	public void totalPatients() {
		System.out.println("Total Patients : "+patients.size());
	}
	
	
}
