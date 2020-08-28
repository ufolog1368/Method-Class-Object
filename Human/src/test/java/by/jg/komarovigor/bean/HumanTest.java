package by.jg.komarovigor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void getAge() {
        var human = new Human();
        human.setAge(40);
        int expected = 40;
        int actual = human.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        var human = new Human();
        human.setName("Bob");
        String  expected = "Bob";
        String  actual = human.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        var human1 = new Human();
        human1.setName("Bob");
        human1.setAge(40);

        var human2 = new Human();
        human2.setName("Bob");
        human2.setAge(40);

        boolean expected = true;
        boolean actual = human1.equals(human2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        var human = new Human();
        long expected = 81708;
        long actual = human.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        var human = new Human();
        String  expected = "Human{age=16, name='Pit'}";
        String actual = human.toString();
        assertEquals(expected, actual);
    }
}