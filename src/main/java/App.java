import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try{
            throw new RuntimeException("Nereala kluda");
        } catch (RuntimeException e){
            log.error("Maven",e);
        }

        log.info("Maven");
        log.trace("Maven");
        log.debug("Maven");
        log.warn("Maven");
        log.error("Maven");
    }
}
