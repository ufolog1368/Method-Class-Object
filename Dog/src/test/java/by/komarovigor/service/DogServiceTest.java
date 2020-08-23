package by.komarovigor.service;

import junit.framework.TestCase;

public class DogServiceTest extends TestCase {

    public void testShouldPrintVoice() {
        DogService dogService = new DogService();
        dogService.Voice(true);
    }

    public void testShouldPrintNotVoiveTest() {
        DogService dogService = new DogService();
        dogService.Voice(false);
    }

    public void testShouldPrintEatTest() {
        DogService dogService = new DogService();
        dogService.Voice(true);

    }

    public void testShouldPrintNotEatTest() {
        DogService dogService = new DogService();
        dogService.Voice(false);

    }

    public void testDhouldPrintSleepTest() {
            DogService dogService = new DogService();
            dogService.Voice(true);

        }


    public void testShouldPrintNotSleepTest() {
        DogService dogService = new DogService();
        dogService.Voice(false);

    }
}