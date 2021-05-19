package pojo;

public class AthleteAddressPOJO {

	/**
	 * Made private as per encapsulation and this will be controlled only by
	 * getter and setter
	 */
	private String city;
	private Integer zip;
	private String locality;

	/**
	 * This constructor will be called from Test class
	 * 
	 * @param city
	 * @param zip
	 * @param locality
	 */
	public AthleteAddressPOJO(String city, Integer zip, String locality) {
		this.city = city;
		this.zip = zip;
		this.locality = locality;
	}

	/**
	 * This is a override method which will be used to print or use the json
	 * object as String
	 */
//	@Override
	public String toString() {
		return "AddressAthlete [city=" + this.city + ", zip=" + this.zip + ", locality=" + this.locality + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

}
