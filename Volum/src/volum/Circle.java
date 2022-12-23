
package volum;

public class Circle 
{
    private static double radius;
    private static String color;

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        Circle.color = color;
    }
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }
    
   
        void getArea()
    {
        
        double area = 3.14*getRadius()*getRadius();
        System.out.println(area);
    }

   
    
}
