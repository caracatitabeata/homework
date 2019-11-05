package teme_nefăcute.CodingAssignment_week08;

import java.util.Objects;

public class Circle extends Shape{

    Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Double computePerimeter(){
        return 2*Math.PI*radius;
    }

    public Double computeArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius.equals(circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
