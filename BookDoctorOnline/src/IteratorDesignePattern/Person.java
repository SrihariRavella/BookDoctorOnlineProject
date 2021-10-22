package IteratorDesignePattern;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignePattern.Doctor;
import ObserverDesignePattern.Patient;

public interface Person {

	public personIterator getDoctorIterator(List<Doctor> iterateList);
	
	public personIterator getPatientIterator(List<Patient> iteratorList);
	
}
