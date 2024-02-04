package pojo.traditional;

public class Address {

	private String city;
	private Integer zip;
	private String locality;

	public Address(String city, Integer zip, String locality) {
		this.city = city;
		this.zip = zip;
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "Athlete Address: [city=" + this.city + ", zip=" + this.zip + ", locality=" + this.locality + "]";
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
