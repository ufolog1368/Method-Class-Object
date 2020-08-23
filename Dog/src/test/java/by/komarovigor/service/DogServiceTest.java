package by.komarovigor.service;


import junit.framework.TestCase;

public class DogServiceTest extends TestCase {

    public void testVoiceTest() {
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
}