package FactoryDesignePattern;

import ObserverDesignePattern.Doctor;
import ObserverDesignePattern.Patient;

public class HospitalFactory {

	public Object getPersonObject(String option) {
		if("1".equals(option)) {
			Doctor d = (Doctor) new Doctor().createPersonObject();
			return d;
		}else if("2".equals(option)) {
			Patient p = (Patient) new Patient().createPersonObject();
			return p;
		}
		return null;
	}
}
