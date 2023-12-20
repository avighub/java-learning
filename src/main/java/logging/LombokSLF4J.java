package logging;

import lombok.extern.slf4j.Slf4j;

/**
 *  Slf4j (Simple Logging Facade ) comes along with Lombok library and it makes logging super flexible
 *
 */
@Slf4j
public class LombokSLF4J {


  public static void main(String[] args)
    {
      //Bad way of logging
      System.out.println("DEBUG: This is a debug message from Sys Out statement.");

      log.info("This is a INFO message coming from Log4J2");
      log.debug("This is Debug message from Log4J2");
      log.warn("This is Warning message from Log4J2");
      log.error("This is Error message from Log4J2");

      // Parametrised logging
      String infoMessage = "Some param value";
      log.info("The parameter value in the log message is {}", infoMessage);
    }


}





