
package volum;

public class Cylinder extends Circle
{
    private  double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public Cylinder(double height, double radius) {
        super.getRadius();
        this.height = height;
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder() {
    }
    
    void volume()
    {
    double volume=3.14*Circle.getRadius()*Circle.getRadius()*getHeight();
    System.out.println(volume);
    }
    
    
}
