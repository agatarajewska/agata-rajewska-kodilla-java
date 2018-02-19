package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figureShape = new ArrayList<Shape>();

    void addFigure(Shape shape) {
        figureShape.add(shape);

    }

//    void addFigure2(Square square) {
    //       figureShape.add(square);
//    }

    // void addFigure3 (Triangle triangle) {
    //      figureShape.add(triangle);
    //  }

    public boolean removeFigure(Circle circle) {
        return figureShape.remove(circle);

    }

    public Shape getFigure(int n) {
        return figureShape.get(n);


    }

    public ArrayList<Shape> showFigures() {
        return figureShape;
    }
}
