package teme_nefăcute.CodingAssignment_week08;

import java.util.Objects;

public class Square extends Shape{

    Integer side;

    public Square(Integer side) {
        this.side = side;
    }

    public Integer computePerimeter() {
        return this.side * 4;
    }

    public Integer computeArea(){
        return side*side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return side.equals(square.side);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
