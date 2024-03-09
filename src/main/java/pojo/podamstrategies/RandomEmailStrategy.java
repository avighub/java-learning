package pojo.podamstrategies;

import uk.co.jemos.podam.common.AttributeStrategy;
import utilities.faker.FakerService;

import java.lang.annotation.Annotation;
import java.util.List;

public class RandomEmailStrategy implements AttributeStrategy<String> {
  @Override
  public String getValue(Class<?> aClass, List<Annotation> list) {
    return FakerService.getRandomEmail();
  }
}
