package pojo;

public class CreateAthletePOJO {

	/**
	 * defining as private as encapulationto be used only via getter and setter
	 */
	private String fname;
	private String lname;
	private String state;
	private String brmStatus;

	/**
	 * This constructor will return the json object and will be called from Test
	 * classes
	 * 
	 * @param fname
	 * @param lname
	 * @param state
	 * @param brmStatus
	 */
	public CreateAthletePOJO(String fname, String lname, String state, String brmStatus) {
		this.fname = fname;
		this.lname = lname;
		this.state = state;
		this.brmStatus = brmStatus;
	}

	/**
	 * This will be used to print the Pojo object as String
	 */
	@Override
	public String toString() {
		return "CreateAthletePOJO [fname=" + fname + ", lname=" + lname + ", state=" + state + ", brmStatus="
				+ brmStatus + "]";
	}

	/**
	 * Getters and Setters for all private fields
	 */
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBrmStatus() {
		return brmStatus;
	}

	public void setBrmStatus(String brmStatus) {
		this.brmStatus = brmStatus;
	}

}
