package utilities.faker;

import java.util.Random;

public final class FakerService {
  private static Random random = new Random();

  private FakerService() {
  }

  public static String[] usPhoneNumberExtensions = new String[]{
          "213", "323", "661", "310", "424", "773", "312", "872",
          "917", "212", "718", "347", "929", "305", "786", "313",
          "214", "469", "972", "202", "415", "628", "617", "508"
  };

  public static String getRandomId() {
    return FakerHelper.getRandomNumericStringWithLength(24);
  }

  public static String getRandomEmail() {
    return getRandomId() + "@example.com";
  }

  public static String getRandomName() {
    return FakerHelper.getRandomName().toLowerCase();
  }

  public static String getRandomLastName() {
    return FakerHelper.getRandomLastName().toLowerCase();
  }

  public static String getRandomPhoneNumber() {
    return usPhoneNumberExtensions[random.nextInt(usPhoneNumberExtensions.length)]
            + FakerHelper.getRandomNumericStringWithLength(7);
  }


  public static String getRandomString() {
    return FakerHelper.getRandomString(10);
  }

}
