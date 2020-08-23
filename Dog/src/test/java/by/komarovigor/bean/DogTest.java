package by.komarovigor.bean;

import junit.framework.TestCase;

public class DogTest extends TestCase {

    public void testTestGetName() {
        Dog dog = new Dog();
        dog.setName("Bob");
        String expected = "Bob";
        String actual = dog.getName();
        assertEquals(expected, actual);

    }

    public void testGetAge() {
    }

    public void testGetColor() {
    }

    public void testTestEquals() {
    }

    public void testTestHashCode() {
    }

    public void testTestToString() {
    }
}