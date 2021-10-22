package OnlineDoctor;

import java.util.List;
import java.util.Scanner;

import CommandDesignePattern.HospitalManager;
import CommandDesignePattern.TotalDoctors;
import FactoryDesignePattern.HospitalFactory;
import IteratorDesignePattern.PersonCollection;
import IteratorDesignePattern.PersonIteratorClass;
import ObserverDesignePattern.Doctor;
import ObserverDesignePattern.Hospital;
import ObserverDesignePattern.Patient;

public class Service {
	
	private static Scanner sc = new Scanner(System.in);
	private static Hospital hospital = new Hospital();
	
	public static void header() throws InterruptedException {
		for(int i=0;i<150;i++) {
			System.out.print("*");
			Thread.sleep(30);
		}
	}
	
	public static void body() throws InterruptedException {
		System.out.println("Enter Your Choice");
		System.out.println("1. Doctor");
		System.out.println("2. Patient");
		String choice1 = sc.next();
		
		switch(choice1) {
		case "1":doctorRegLogin();
			break;
		case "2":patientRegLogin();
			break;
		}
	}
	
	public static void doctorRegLogin() throws InterruptedException{
		System.out.println("1. Doctor Registration");
		System.out.println("2. Doctor Login");
		String doctorChoice = sc.next();
		switch(doctorChoice) {
		case "1":
			System.out.println("Enter DoctorId:");
			String did=sc.next();
			System.out.println("Enter DoctorName:");
			String dname=sc.next();
			System.out.println("Enter DoctorUserName:");
			String username=sc.next();
			System.out.println("Enter DoctorPassword:");
			String password=sc.next();
			
			Doctor d =(Doctor) new HospitalFactory().getPersonObject("1");
			d.setDoctorId(did);
			d.setDoctorName(dname);
			d.setDoctorUserName(username);
			d.setDoctorPassword(password);
			hospital.registerDoctor(d);
			System.out.println(d.toString());
			doctorRegLogin();
			break;
		case "2":
			System.out.println("Enter DoctorUserName:");
			String uname=sc.next();
			System.out.println("Enter DoctorPassword:");
			String pass=sc.next();
			hospital.loginDoctor(uname, pass);
			break;
		}
		
	}
	
	public static void patientRegLogin() throws InterruptedException {
		System.out.println("1. Patient Registration");
		System.out.println("2. Patient Login");
		String patientChoice = sc.next();
		switch(patientChoice) {
		case "1":
			System.out.println("Enter PatientId:");
			String pid=sc.next();
			System.out.println("Enter PatientName:");
			String pname=sc.next();
			System.out.println("Enter PatientMobile:");
			String pmobile=sc.next();
			System.out.println("Enter PatientUserName:");
			String username=sc.next();
			System.out.println("Enter PatientPassword:");
			String password=sc.next();
			
			Patient p = (Patient)new HospitalFactory().getPersonObject("2");
			p.setPatientId(pid);
			p.setPatientName(pname);
			p.setPatientMobileNumber(pmobile);
			p.setPatientUserName(username);
			p.setPatientPassword(password);
			System.out.println(p.toString());
			hospital.registerPatient(p);
			patientRegLogin();
			break;
		case "2":
			System.out.println("Enter PatientUserName:");
			String uname=sc.next();
			System.out.println("Enter PatientPassword:");
			String pass=sc.next();
			hospital.loginPatient(uname,pass);

			break;
		}
		
	}
	
	public static void patientAfterLogin(String username,String password) throws InterruptedException {
		System.out.println("Patient Login Success as :"+username);
		try {
			header();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Patient currentObj = null;
		List<Patient> patients = hospital.getPatients();
		for(Patient p:patients) {
			if(p.getPatientUserName().equals(username) && p.getPatientPassword().equals(password)) {
				currentObj=p;
			}
		}
		System.out.println("Patient Profile");
		System.out.println("\n"+currentObj.toString());
		do {
			System.out.println("1. Iterate All Registered Patients");
			System.out.println("2. Book a Doctor");
			System.out.println("3. Logout");
			System.out.println("Enter Your Choice :");
			String ch = sc.next();
			switch(ch) {
			case "1":PersonIteratorClass itr = (PersonIteratorClass) new PersonCollection().getPatientIterator(patients);
					 while(itr.hasNextPatient()) {
						 Object nextPatient = itr.nextPatient();
						 System.out.println(nextPatient.toString());
					 }
				break;
			case "2":	System.out.println("1. Slot1 (8AM to 10AM)");
			 			System.out.println("2. Slot2 (11AM to 1PM)");
			 			System.out.println("3. Slot3 (2PM to 4PM)");
			 			System.out.println("4. Slot4 (5PM to 8PM)");
			 			System.out.println("Enter Your Choice");
			 			String next = sc.next();
			 			switch(next) {
			 			case "1":  hospital.addSlot1();
			 				break;
			 			case "2":hospital.addSlot2();
			 				break;
			 			case "3":hospital.addSlot3();
			 				break;
			 			case "4":hospital.addSlot4();
			 				break;
			 			}
				break;
			case "3": System.out.println("Logging Out");
				header();
				body();
				break;
			}
			System.out.println("Do u want to Continue : (Y / N)");
		}while("y".equalsIgnoreCase(sc.next()));
	}
	
	public static void doctorAfterLogin(String username,String password) throws InterruptedException {
		System.out.println("Doctor Login Success as "+username);
		try {
			header();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Doctor currentObj = null;
		List<Doctor> doctors = hospital.getDoctors();
		List<Patient> patients = hospital.getPatients();
		for(Doctor d:doctors) {
			if(d.getDoctorUserName().equals(username) && d.getDoctorPassword().equals(password)) {
				currentObj=d;
			}
		}
		System.out.println("Doctors Profile");
		System.out.println("\n"+currentObj.toString());
		do {
			System.out.println("1. Iterate All Registered Doctors");
			System.out.println("2. Iterate All Registered Patients");
			System.out.println("3. Notify patients ");
			System.out.println("4. Total Doctors ");
			System.out.println("5. Total Patients ");
			System.out.println("6. Logout");
			
			System.out.println("Enter Your Choice :");
			String ch = sc.next();
			switch(ch) {
			case "1":PersonIteratorClass p = (PersonIteratorClass) new PersonCollection().getDoctorIterator(doctors);
					 while(p.hasNextDoctor()) {
						 Object nextPerson = p.nextDoctor();
						 System.out.println("\n"+nextPerson.toString());
					 }
				break;
			case "2":PersonIteratorClass itr = (PersonIteratorClass) new PersonCollection().getPatientIterator(patients);
					 while(itr.hasNextPatient()) {
						 Object nextPerson = itr.nextPatient();
						 System.out.println("\n"+nextPerson.toString());
					 }
				break;
			case "3":hospital.notificationPatients();
				break;
			case "4":HospitalManager.command(new TotalDoctors(hospital), "totalDoctors");
				break;
			case "5":HospitalManager.command(new TotalDoctors(hospital), "totalPatients");
				break;
			case "6":header();
					body();
				break;
			}
			System.out.println("Do u want to Continue : (Y / N)");
		}while("y".equalsIgnoreCase(sc.next()));
	}
}
