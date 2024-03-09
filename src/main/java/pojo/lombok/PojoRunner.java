package pojo.lombok;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PojoRunner {

  public static void main(String[] args) throws JsonProcessingException {
    // Testing Non Default values
    Address address = Address.builder()
            .setCity("Blr")
            .build();
    ObjectMapper mapper = new ObjectMapper();

    log.info(mapper.writeValueAsString(address));
  }
}
