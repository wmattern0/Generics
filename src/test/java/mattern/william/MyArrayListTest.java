package mattern.william;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList<String> testList;

    @Before
    public void setUp(){
        testList = new MyArrayList<String>();
        testList.add("Ghostbusters");
    }

    @Test
    public void isEmptyTest(){
        assertFalse(testList.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void invalidSizeTest(){
        MyArrayList<String> testList2 = new MyArrayList<String>(-1);
    }

    @Test
    public void addTest1(){
        testList.add("Ghostbusters");
        assertFalse(testList.isEmpty());
    }

    @Test
    public void getTest1(){
        String actual = testList.get(0), expected = "Ghostbusters";
        assertEquals(expected, actual);
    }

    @Test
    public void setTest1(){
        testList.set(4, "Slim Shady");
        String actual = testList.get(4), expected = "Slim Shady";
        assertEquals(expected, actual);
    }

    @Test
    public void addTest2(){
        testList.add(4, "Slim Shady");
        String actual = testList.get(4), expected = "Slim Shady";
        assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        testList.clear();
        assertTrue(testList.isEmpty());
    }

    @Test
    public void containsTest(){
        assertTrue(testList.contains("Ghostbusters"));
    }

    @Test
    public void containsTestFalse(){
        assertFalse(testList.contains("HTTP"));
    }

    @Test
    public void toStringTest(){
        testList.add("Slim Shady");
        String actual = testList.toString(), expected = "Ghostbusters, Slim Shady";
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        testList.add("Slim Shady");
        testList.remove(0);
        String actual = testList.toString(), expected = "Slim Shady";
        assertEquals(expected, actual);
    }

    @Test
    public void removeMiddleTest(){
        testList.add("Slim Shady");
        testList.add("John Lennon");
        testList.remove(1);
        String actual = testList.toString(), expected = "Ghostbusters, John Lennon";
        assertEquals(expected, actual);
        assertEquals(2, testList.size());
    }
}
