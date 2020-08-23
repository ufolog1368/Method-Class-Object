package by.komarovigor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DogService {
    Logger logger = LoggerFactory.getLogger(DogService.class);

    public void Voice(boolean say){
        if (!say){
            return;
        }
        logger.info("Hau hau hau");
        return;
    }
    public void Eat(boolean say){
        if (!say) {
            return;
        }
        logger.info("om-nom-nom");
        return;
    }
    public void Sleep(boolean say){
        if (!say) {
            return;
        }
        logger.info("Zzzzzz");
    }
}
