package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import IteratorDesignePattern.PersonIteratorClass;
import ObserverDesignePattern.Patient;

class IteratorDesignePatternTesting {

	@Test
	void test() {
		List<Patient> patients = new ArrayList<>();
		patients.add(new Patient());
		PersonIteratorClass p = new PersonIteratorClass(patients);
		assertTrue(p.hasNextPatient());
	}
	
	@Test
	void test1() {
		List<Patient> patients = new ArrayList<>();
		PersonIteratorClass p = new PersonIteratorClass(patients);
		assertFalse(p.hasNextPatient());
	}
	
	@Test
	void test2() {
		List<Patient> patients = new ArrayList<>();
		patients.add(new Patient());
		PersonIteratorClass p = new PersonIteratorClass(patients);
		assertTrue(p.nextPatient() instanceof Patient);
	}

}
