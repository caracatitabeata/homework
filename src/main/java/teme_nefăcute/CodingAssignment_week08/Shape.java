package teme_nefăcute.CodingAssignment_week08;

import java.util.List;

public abstract class Shape {

    static List<Shape> list;

    abstract Number computePerimeter();
    abstract Number computeArea();

    static void addShape(Shape s) {
        if (list.contains(s)) {
            System.out.println("Not right, those shapes are equal");
        }
        list.add(s);
    } 
}
