package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J2Demo {


    public static void main(String[] args) {
        //Bad way of logging
        System.out.println("DEBUG: This is a debug message from SOUT statement.");

        //Using Log4J2 - apache
        Logger log = LogManager.getLogger(Log4J2Demo.class);
        log.info("This is a INFO message coming from Log4J2");
        log.debug("This is Debug message from Log4J2");
        log.warn("This is Warning message from Log4J2");
        log.error("This is Error message from Log4J2");


    }


}





