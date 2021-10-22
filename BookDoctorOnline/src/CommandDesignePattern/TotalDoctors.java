package CommandDesignePattern;

import ObserverDesignePattern.Hospital;

public class TotalDoctors implements HospitalCommand{

	private Hospital hospitalObject;
	
	public TotalDoctors(Hospital hospitalObject) {
		super();
		this.hospitalObject = hospitalObject;
	}


	@Override
	public void executeCommand() {
		this.hospitalObject.totalDoctors();
	}

}
