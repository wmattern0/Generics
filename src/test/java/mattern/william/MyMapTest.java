package mattern.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 2/22/17.
 */
public class MyMapTest {
    MyMap<String, Integer> myMap;

    @Before
    public void setUp(){
        myMap = new MyMap<String, Integer>();
        myMap.put("String", 1);
    }

    @Test
    public void isEmptyTest() {
        assertFalse(myMap.isEmpty());
    }

    @Test
    public void sizeTest() {
        int expected = 1, actual = myMap.size();
        assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        int expected = 1, actual = myMap.get("String");
        assertEquals(expected, actual);
    }

    @Test
    public void getTest2() {
        myMap.put("String", 2);
        int expected = 2, actual = myMap.get("String");
        assertEquals(expected, actual);
    }

    @Test
    public void getTest3() {
        myMap.put("String2", 2);
        int expected = 1, actual = myMap.get("String");
        assertEquals(expected, actual);
    }

    @Test
    public void clearTest() throws Exception{
        myMap.clear();
        assertTrue(myMap.isEmpty());
    }

    @Test
    public void removeTest() {
        myMap.put("String2", 2);
        myMap.remove("String");
        int expected = 1, actual = myMap.size();
        assertEquals(expected, actual);
    }
}