package myonlineshop;

import java.util.Scanner;


public class MyOnlineShop {

    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Books : ");
        int x  ;
        x = input.nextInt();
       Childernbook b = new Childernbook();
       Childernbook  products []  = new  Childernbook[x];
       b.FillArr(products);
       b.sumarr(products);
    }
}
    

