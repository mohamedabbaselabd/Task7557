package myonlineshop;

public abstract class Prroduct 
{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Prroduct(double price) {
        this.price = price;
    }
    public Prroduct(){}
     
    
    
}
