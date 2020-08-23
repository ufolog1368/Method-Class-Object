package by.komarovigor.service;


import by.komarovigor.bean.Dog;
import junit.framework.TestCase;

public class DogServiceTest extends TestCase {

    public void testVoiceTest() {
        Dog dog = new Dog("Bob", 5, "Orange");
        DogService dogService=new DogService();
        String expected = "Hau hau hau";
        String actual=dogService.voice();
        assertEquals(expected, actual);
    }

    public void testEatTest() {
        DogService dogService=new DogService();
        dogService.eat();
        String expected = "om-nom-nom";
        String actual=dogService.eat();
        assertEquals(expected,actual);

    }

    public void testSleepTest() {
        DogService dogService=new DogService();
        dogService.sleep();
        String expected = "Zzzzzzzzzzzzzzzz";
        String actual=dogService.sleep();
        assertEquals(expected,actual);
    }

    public void testGameTest() {
        DogService dogService=new DogService();
        dogService.game();
        String expected = "Hrrrr";
        String actual=dogService.game();
        assertEquals(expected,actual);
    }

    public void testSweemTest() {
        DogService dogService=new DogService();
        dogService.sweem();
        String expected = "Pluh pluh";
        String actual=dogService.sweem();
        assertEquals(expected,actual);
    }
}