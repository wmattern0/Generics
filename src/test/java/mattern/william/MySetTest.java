package mattern.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 2/22/17.
 */
public class MySetTest {
    MySet<String> mySet;

    @Before
    public void setUp(){
        mySet = new MySet<String>();
        mySet.add("Hello");
    }

    @Test
    public void isEmptyTestFalse()   {
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void sizeTest1()   {
        int expected = 1, actual = mySet.size();
        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2()   {
        mySet.add("World");
        int expected = 2, actual = mySet.size();
        assertEquals(expected, actual);

    }

    @Test
    public void addTestTrue()   {
        assertTrue(mySet.add("World"));
        int expected = 2, actual = mySet.size();
        assertEquals(expected, actual);
    }

    @Test
    public void addTestFalse()   {
        assertFalse(mySet.add("Hello"));
        int expected = 1, actual = mySet.size();
        assertEquals(expected, actual);
    }


    @Test
    public void containsTest()   {
        assertTrue(mySet.contains("Hello"));
    }

    @Test
    public void clearTest()   {
        mySet.clear();
        assertFalse(mySet.contains("Hello"));
        int expected = 0, actual = mySet.size();
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest1()   {
        mySet.add("Cool");
        mySet.add("World");
        assertTrue(mySet.remove("Hello"));
        String expected = "World, Cool", actual = mySet.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest2()   {
        mySet.add("Cool");
        mySet.add("World");
        assertTrue(mySet.remove("Cool"));
        String expected = "World, Hello", actual = mySet.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest3()   {
        mySet.add("Cool");
        mySet.add("World");
        assertTrue(mySet.remove("World"));
        String expected = "Cool, Hello", actual = mySet.toString();
        assertEquals(expected, actual);
    }
}