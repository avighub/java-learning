package logging;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log4J2_slf4JDemo {


    public static void main(String[] args) {
        //Bad way of logging
        System.out.println("DEBUG: This is a debug message from SOUT statement.");

        System.out.println("=================SLF4J + log4J2===========");
        log.info("This is a INFO message coming from Log4J2");
        log.debug("This is Debug message from Log4J2");
        log.warn("This is Warning message from Log4J2");
        log.error("This is Error message from Log4J2");

        //parametrised logging
        String infoMessage="Some param value";
        log.info("The parameter value in the log message is {}", infoMessage);




    }


}





