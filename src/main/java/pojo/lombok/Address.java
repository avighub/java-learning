package pojo.lombok;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(setterPrefix = "set")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Address {
  private String city;
  private Integer zip;
  private String locality;
}
