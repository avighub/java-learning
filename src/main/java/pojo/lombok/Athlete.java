package pojo.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pojo.podamstrategies.RandomEmailStrategy;
import uk.co.jemos.podam.common.PodamIntValue;
import uk.co.jemos.podam.common.PodamStrategyValue;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Athlete {

  private String firstName;
  private String lastName;
  private String state;
  private String brmStatus;
  private Address address;

  @PodamStrategyValue(RandomEmailStrategy.class)
  private String email;

  @PodamIntValue(minValue = 10)
  private int intFieldWithMinValueOnly;

  @PodamIntValue(numValue = "20")
  private int intFieldWithPreciseValue;

  @PodamIntValue(minValue = 55, maxValue = 100)
  private int intFieldWithMaxValueOnly;

}
