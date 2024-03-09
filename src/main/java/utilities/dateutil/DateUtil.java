package utilities.dateutil;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public final class DateUtil {
  public static void main(String[] args) {
    log.info(getCurrentDateYYYYmmdd().toString());
  }

  private DateUtil() {
  }

  public static LocalDate getCurrentDateYYYYmmdd() {
    return LocalDate.now();
  }

}
