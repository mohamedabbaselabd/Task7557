
package com.mycompany.MyOnlineShop;

import java.util.Scanner;

public class OopTask2 {

    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);   
    Book [] products=new Book[6];
    
    products[0]=new ChildrenOfBook("how to conquer",50.6);  
    products[1]=new Book("exchange life",70);
    products[2]=new ChildrenOfBook("the art of self conscious",50.8);
    products[3]=new ChildrenOfBook("abc",25.9);
    products[4]=new ChildrenOfBook("soul expenses",80.5);
    products[4]=new Cartoon("soul expenses",80);
    double sum=0;
    for (int i =0;i<5;i++)
    {
     sum += products[i].getPrice();       
    }
    System.out.println("sum is:"+sum);
    
    }
    }

