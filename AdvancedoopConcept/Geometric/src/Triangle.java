


public class Triangle extends GeometricFigure {
    Triangle(int height, int width, String type){
        super(height, width, type);
    }

    @Override
    public double getArea() {
        return (super.getHeight() * super.getWidth())/2;
    }

    @Override    public String toString() {
        return "The " + super.getType() + " Triangle with Height = " + super.getHeight() + " and with Width = " + super.getWidth() + " has an Area of " + this.getArea();
    }
}
