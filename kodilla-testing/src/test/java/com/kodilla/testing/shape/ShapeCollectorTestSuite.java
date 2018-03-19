package com.kodilla.testing.shape;

import java.util.ArrayList;

//import javafx.scene.shape.TriangleMesh;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector = new ShapeCollector();


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
        shapeCollector.addFigure(theCircle);
        //When

        boolean result = shapeCollector.removeFigure(theCircle);
        //Then
        assertTrue(result);

    }

    @Test
    public void testGetFigure() {
        //given
        Circle theCircle = new Circle();
        shapeCollector.addFigure(theCircle);
        //when
        //shapeCollector.getFigure(0);

        Shape result = shapeCollector.getFigure(0);

        //then
        Assert.assertEquals(theCircle, result); //shapeCollector.getFigure(0));

    }

    @Test
    public void testShowFigures() {

        //given

        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        ArrayList<Shape> expected = new ArrayList<>();

        expected.add(triangle);
        expected.add(circle);
        expected.add(square);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //WHEN

        ArrayList<Shape> result = shapeCollector.showFigures();

        //THEn

        Assert.assertEquals(expected.size(), result.size());
        Assert.assertEquals(expected, result);


    }
}