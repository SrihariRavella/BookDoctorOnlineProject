package CommandDesignePattern;

public class HospitalManager {
	
	public static void command(HospitalCommand obj,String command) {
		if("totalDoctors".equals(command)) {
			obj.executeCommand();
		}else if("totalPatients".equals(command)){
			obj.executeCommand();
		}
	}

}
