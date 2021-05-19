package pojoLombok;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

//Adding not_null for optional field
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class AthleteAddress {

	/**
	 * Made private as per encapsulation and this will be controlled only by
	 * getter and setter
	 */
	private String city;
	private Integer zip;
	private String locality;
	private String state;


}
