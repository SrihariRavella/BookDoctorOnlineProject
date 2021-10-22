package IteratorDesignePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ObserverDesignePattern.Doctor;
import ObserverDesignePattern.Patient;

public class PersonIteratorClass implements personIterator{

	private List<Doctor> doctorList = new ArrayList<>(Arrays.asList());
	private List<Patient> patientList = new ArrayList<>(Arrays.asList());

	PersonIteratorClass(List<Doctor> doctors,String var){
		if(var.equals("1")) {
			this.doctorList=doctors;
		}
		
	}
	
	public PersonIteratorClass(List<Patient> patients){
		this.patientList=patients;
	}
	
	int i,j;
	@Override
	public boolean hasNextDoctor() {
		if(i < this.doctorList.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object nextDoctor() {
		if(this.hasNextDoctor()) {
			return this.doctorList.get(i++);
		}
		return null;
	}

	@Override
	public boolean hasNextPatient() {
		if(j < this.patientList.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object nextPatient() {
		if(this.hasNextPatient()) {
			return this.patientList.get(j++);
		}
		return null;
	}


}
