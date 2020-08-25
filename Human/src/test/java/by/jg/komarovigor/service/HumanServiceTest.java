package by.jg.komarovigor.service;

import by.jg.komarovigor.bean.Human;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class HumanServiceTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void greet() {
        var human = new Human();
        var humanService = new HumanService();
        String expected = "[main] INFO  by.jg.komarovigor.service.HumanService  - Age = 16, Name = Pit\n";
        humanService.greet();
        assertEquals(expected, systemOutRule.getLog());

    }
}