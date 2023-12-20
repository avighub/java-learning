package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j (Simple Logging Facade ) standalone
 */
public class SLF4J {


  public static void main(String[] args)
    {
      //Bad way of logging
      System.out.println("DEBUG: This is a debug message from Sys Out statement.");


      final Logger logger = LoggerFactory.getLogger(SLF4J.class);
      logger.info("This is a INFO message coming from Log4J2");
      logger.debug("This is Debug message from Log4J2");
      logger.warn("This is Warning message from Log4J2");
      logger.error("This is Error message from Log4J2");

      // Parametrised logging
      String infoMessage = "Some param value";
      logger.info("The parameter value in the log message is {}", infoMessage);
    }


}





