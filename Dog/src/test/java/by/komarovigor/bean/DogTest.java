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
        Dog dog = new Dog();
        dog.setAge(3);
        int expected = 3;
        int actual = dog.getAge();
        assertEquals(expected, actual);
    }

    public void testGetColor() {
        Dog dog = new Dog();
        dog.setColor("Orange");
        String expected = "Orange";
        String actual = dog.getColor();
        assertEquals(expected, actual);
    }

    public void testTestEquals() {
    }

    public void testTestHashCode() {
    }

    public void testTestToString() {
    }
}