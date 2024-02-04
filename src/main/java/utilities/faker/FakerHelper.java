package utilities.faker;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class FakerHelper {
  private static Random rand = new Random();

  private FakerHelper() {
  }

  private static final Faker FAKER = new Faker();

  static String getRandomName() {
    return getAlphabetsOnlyString(FAKER.name().firstName());
  }

  static String getRandomFirstNameInLowerCase() {
    return getRandomName().toLowerCase();
  }

  static String getRandomLastName() {
    return getAlphabetsOnlyString(FAKER.name().lastName());
  }

  static String getRandomNumericStringWithLength(int count) {
    return String.valueOf(FAKER.number().digits(count));
  }

  static String getRandomString(int length) {
    return FAKER.lorem().fixedString(length);
  }

  static int getRandomNumber() {
    return FAKER.number().randomDigit();
  }

  static String getRandomValueFromList(List<String> values) {
    int randomIndex = rand.nextInt(values.size());
    return values.get(randomIndex);
  }

  private static String getAlphabetsOnlyString(String input) {
    return input.replaceAll("[^a-zA-Z]+", "");
  }

  private static final Map<Class<?>, List<? extends Enum<?>>> ENUM_VALUEMAP = new ConcurrentHashMap<>();

  public static <T extends Enum<?>> T getRandomEnumValue(Class<T> clazz) {
    List<? extends Enum<?>> values = ENUM_VALUEMAP
            .computeIfAbsent(clazz, c -> new CopyOnWriteArrayList<>(Arrays.asList(clazz.getEnumConstants())));

    return (T) values.remove(rand.nextInt(values.size() - 1));
  }
}
