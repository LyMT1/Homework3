public class Main {

    public static void main(String args[]) {

        System.out.println("Calculate S and P of a rectangle:");
        Rectangle rectangle = new Rectangle();
        rectangle.calculateRectangularArea();
        rectangle.calculateRectangularPerimeter();

        System.out.println("Calculate S and D of a circle:");
        Circle circle = new Circle();
        double s = circle.calculateCircleArea();
        System.out.println("Area = " + s);

        double c = circle.calculateCircleDiameter();
        System.out.println("Diameter = " + c);
    }
}
