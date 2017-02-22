package mattern.william;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList<String> testList;

    @Before
    public void setUp(){
        testList = new MyArrayList<String>();
    }

    @Test
    public void isEmptyTest(){
        assertTrue(testList.isEmpty());
    }


    @Test
    public void addTest1(){
        testList.add("Ghostbusters");
        assertFalse(testList.isEmpty());
    }

    @Test
    public void addTest2(){
        testList.add("Ghostbusters");

        assertFalse(testList.isEmpty());
    }
}
