package JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FactoryDesignePattern.HospitalFactory;
import ObserverDesignePattern.Doctor;
import ObserverDesignePattern.Patient;

class FactoryDesigneTestCases {

	@Test
	void test() {
		HospitalFactory test = new HospitalFactory();
		assertTrue(test.getPersonObject("1") instanceof Doctor);
	}
	
	@Test
	void test1() {
		HospitalFactory test = new HospitalFactory();
		assertTrue(test.getPersonObject("2") instanceof Patient);
	}

}
