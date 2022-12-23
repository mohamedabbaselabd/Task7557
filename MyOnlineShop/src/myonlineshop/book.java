
package myonlineshop;


public class book  extends Prroduct
{
    
    private String nameofbook;

    public String getNameofbook() {
        return nameofbook;
    }

    public void setNameofbook(String nameofbook) {
        this.nameofbook = nameofbook;
    }

    public book(String nameofbook, double price) {
        super(price);
        this.nameofbook = nameofbook;
    }
    public book(double price)
    {
    super(price);
    }
    public book()
    {
    
    }
   
}
