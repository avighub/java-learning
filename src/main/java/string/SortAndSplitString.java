package string;

import java.io.File;

public class SortAndSplitString {
  public static void main(String[] args)
    {
      // Given below input of time , sort them based on minute in ascending order
      String[] timeStamps = {"10:20", "11:02", "12:03"};

    }

  static String[] sortBasedOnMinuteInAscendingOrder(String[] timeStamps)
    {
      String[] sortedTimeStamps = new String[0];
      for (String timeStamp : timeStamps) {
        int parsedTimeStampSuffix = Integer.parseInt(timeStamp.split(":")[1]);
        int minParsedTimeStampSuffix = Integer.parseInt(sortedTimeStamps[0].split(":")[1]);
        if (parsedTimeStampSuffix < minParsedTimeStampSuffix) {
          sortedTimeStamps[0] = timeStamp;
        }
      }
      return sortedTimeStamps;
    }
}
