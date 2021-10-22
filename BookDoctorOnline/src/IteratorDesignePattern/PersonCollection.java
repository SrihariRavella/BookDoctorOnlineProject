package IteratorDesignePattern;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignePattern.Doctor;
import ObserverDesignePattern.Patient;

public class PersonCollection implements Person{

	@Override
	public personIterator getDoctorIterator(List<Doctor> doctors) {
		return new PersonIteratorClass(doctors,"1");
	}

	@Override
	public personIterator getPatientIterator(List<Patient> iteratorList) {
		return new PersonIteratorClass(iteratorList);
	}
	


}
