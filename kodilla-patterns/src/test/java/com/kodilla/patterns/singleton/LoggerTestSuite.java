package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {

    @Before
    public void beforeEveryTest() {
        Logger logger = Logger.getInstance();
        System.out.println("This is the beginning of tests.");
        logger.log("01234");
    }


    @AfterClass
    public static void afterTests () {
        System.out.println("All tests are finished.");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String testLog = Logger.getInstance().getLastLog();
        //Then
        assertEquals("01234", testLog);
    }
}
