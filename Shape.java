
package shape;


public interface Shape {
     int getarea ();
     float getperimeter ();
}
public class triangle implements Shape {
    public int side ;
    public float perimeter;
    
    public triangle (int side, float perimeter ){
        this.side = side;
        this.perimeter = perimeter;
    }
@Override
    public int getarea () {
        return area;
    }
@Override
        public float getPerimeter() {
            return perimeter;
        }
    }
public class circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public int getarea() {
            return area;
        }

        @Override
        public float getperimeter() {
            return perimeter;
        }
    }
class Main {
    public static void main(String[] args) {
        Shape shape = new Shape;
        shape = new Triangle;
        shape = new Circle;
        

        for (Shape shape : shape) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter()); }

            System.out.println();
        }
    }


     

        
    
    

