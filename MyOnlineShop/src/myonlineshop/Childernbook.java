
package myonlineshop;


import java.util.Scanner;


public class Childernbook extends book
{
    Scanner input = new Scanner(System.in);


    public Childernbook(String nameofbook, double price) {
        super(nameofbook, price);
    }

    public Childernbook(double price) {
        super(price);
    }

    
    public Childernbook() {
    }
     public void FillArr( Childernbook  b1 [] )
    {
        
        String nameofbook;
        double price;
        for (int i=0;i<b1.length;i++)
       {
                   System.out.print("Enter The Name Of Book no  ->  " + (i+1) + " -> ");
                   nameofbook=input.next();
                   
                   System.out.print("Enter The price Of Book no ->  " + (i+1) + " -> ");
                   price=input.nextDouble();
                   
                   b1[i]=new Childernbook();
                   b1[i].setNameofbook(nameofbook);
                   b1[i].setPrice(price);
           System.out.println("The Price OF Book no -> "+ (i+1) + " -> " +b1[i].getPrice());
       }
        
    }
             public void sumarr(Childernbook  b1 [])
                     
             {
             double sum=0;
             for (int i =0;i<b1.length;i++)
             {
             sum += b1[i].getPrice();
             }
             System.out.println(" sum = "+sum);

             }
                 
             }

     
    
  

