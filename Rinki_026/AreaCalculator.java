public class AreaCalculator {
    public void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of the square with side " + side + " is: " + area);
    }

    public void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        calculator.calculateArea(5);
        calculator.calculateArea(4, 6);
    }
}
