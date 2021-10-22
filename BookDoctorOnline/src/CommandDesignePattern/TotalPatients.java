package CommandDesignePattern;

import ObserverDesignePattern.Hospital;

public class TotalPatients implements HospitalCommand{

	private Hospital hospitalObject;
	
	
	public TotalPatients(Hospital hospitalObject) {
		super();
		this.hospitalObject = hospitalObject;
	}


	@Override
	public void executeCommand() {
		this.hospitalObject.totalPatients();
	}

}
