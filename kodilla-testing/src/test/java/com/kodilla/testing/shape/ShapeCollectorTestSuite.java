package com.kodilla.testing.shape;

import java.util.ArrayList;

//import javafx.scene.shape.TriangleMesh;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle theCircle = new Circle();
        //When
        shapeCollector.addFigure(theCircle);
        //Then
        Assert.assertEquals(theCircle, shapeCollector.getFigure(0));

    }

    @Test
    public void testRemoveFigure() {
        //Given
        Circle theCircle = new Circle();
        //When
        shapeCollector.addFigure(theCircle);
        boolean result = shapeCollector.removeFigure(theCircle);
        //Then
        assertTrue(result);

    }

    @Test
    public void testGetFigure() {

        Circle theCircle = new Circle();
        shapeCollector.addFigure(theCircle);

        shapeCollector.getFigure(0);

        Assert.assertEquals(theCircle, shapeCollector.getFigure(0));

    }

    @Test
    public void testShowFigures() {

        ArrayList<Shape> showFigures = new ArrayList<Shape>();

        shapeCollector.showFigures();

        Assert.assertEquals( showFigures, shapeCollector.showFigures());


    }
}