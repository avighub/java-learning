package pojoLombok;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

//Adding not_null for optional field
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class AthleteAllInfo {

    /**
     * Made private as per encapsulation and this will be controlled only by
     * getter and setter
     */
    private int id;
    private String fname;
    private String lname;

    //Making separate pojo class for nested json
    private AthleteAddress address;
    private AthleteBrmStatus brmStatus;

    //Making an array object with List
    @Singular("brmInfo")
    private List<AthleteBrmInfo> brmInfo;

}
