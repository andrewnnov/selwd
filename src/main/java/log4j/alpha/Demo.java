package log4j.alpha;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {

    private static Logger log = Logger.getLogger(Demo.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.debug("I am debugging");
        log.info("object is present");
        log.warn("Ya ya ya");
        log.error("object is not present");
        log.fatal("this is fatal");



    }
}
