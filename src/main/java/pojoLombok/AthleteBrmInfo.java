package pojoLombok;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AthleteBrmInfo {

	/**
	 * defining as private as encapuslationto be used only via getter and setter
	 */
	
	private String clubName;
	private Integer brmyear;
	private Boolean brmFinish;
	private String brmMonth;

}
