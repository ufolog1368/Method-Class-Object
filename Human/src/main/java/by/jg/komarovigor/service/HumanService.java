package by.jg.komarovigor.service;


import by.jg.komarovigor.bean.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanService {
    Logger logger = LoggerFactory.getLogger(HumanService.class);

    public void greet(){
        Human human = new Human();
        logger.info("Age = {}, Name = {}", human.getAge(), human.getName());

    }
}
