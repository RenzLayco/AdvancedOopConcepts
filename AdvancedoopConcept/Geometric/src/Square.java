

public class Square extends GeometricFigure {
    Square(int height, int width, String type){
        super(height, width, type);
    }

    @Override    public double getArea() {
        return (super.getHeight() * super.getWidth());
    }

    @Override    public String toString() {
        return "The " + super.getType() + " with Height = " + super.getHeight() + " and with Width = " + super.getWidth() + " has an Area of " + this.getArea();
    }
}

