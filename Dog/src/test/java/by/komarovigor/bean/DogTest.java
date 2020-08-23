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
        Dog dog1 = new Dog();
        dog1.setName("Bob");

        Dog dog2 = new Dog();
        dog2.setName("Bob");

        boolean expected = true;
        boolean actual = dog1.equals(dog2);
        assertEquals(expected, actual);
    }

    public void testTestHashCode() {
    }

    public void testTestToString() {
    }
}