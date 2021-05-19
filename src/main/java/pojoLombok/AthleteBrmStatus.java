package pojoLombok;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AthleteBrmStatus {

	/**
	 * defining as private as encapuslationto be used only via getter and setter
	 */
	private boolean srStatus;
	private boolean rStatus;
	private String clubMember;


}
