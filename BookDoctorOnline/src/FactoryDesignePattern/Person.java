package FactoryDesignePattern;

public abstract class Person {

	private String personId;
	private String personName;
	private String personMobile;
	private String personUserName;
	private String personPassword;
	
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonMobile() {
		return personMobile;
	}
	public void setPersonMobile(String personMobile) {
		this.personMobile = personMobile;
	}
	public String getPersonUserName() {
		return personUserName;
	}
	public void setPersonUserName(String personUserName) {
		this.personUserName = personUserName;
	}
	public String getPersonPassword() {
		return personPassword;
	}
	public void setPersonPassword(String personPassword) {
		this.personPassword = personPassword;
	}

	public abstract Object createPersonObject();


}
