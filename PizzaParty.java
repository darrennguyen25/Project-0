
/***************************************************************  
*  file: PizzaParty.java  
*  author: D. Nguyen 
*  class: CS 1400 – Intro Programming and Problem Solving  
*  
*  assignment: program 2
*  date last modified: February 22 2022
*  
*  purpose: This program calculates the cost of hosting pizza parties on Friday, Saturday, 
*           and Sunday by taking inputs in the form of ints and doubles and calculating them.
*  
****************************************************************/ 
import java.util.Scanner;
public class PizzaParty{
  /*
  * The main method takes inputs from the terminal and does several calculations
  * to figure out the cost of the pizza deliveries on the three days. 
  */
  public static void main(String args[]){
    Scanner scnr = new Scanner(System.in);
    int people, numPizza;
    double avgSlice, pricePerPizza, tax, delivery, total;
    double weekendTotal = 0;
    String[] weekend = {"Friday", "Saturday", "Sunday"};
    final int SLICE_PER_PIZZA = 8;
    final double SALES_TAX_RATE = 0.07;
    final double DELIVERY_RATE = 0.2;
    for(int i=0;i<weekend.length;i++){
        people = scnr.nextInt();
        avgSlice = scnr.nextDouble();
        pricePerPizza = scnr.nextDouble();
        System.out.println(weekend[i] + " Night Party");
        numPizza = (int) Math.ceil((people*avgSlice)/SLICE_PER_PIZZA);
        total = numPizza * pricePerPizza;
        System.out.printf("%d Pizzas: $%.2f\n",numPizza, total);
        tax = total * SALES_TAX_RATE;
        System.out.printf("Tax: $%.2f\n",tax);
        total += tax;
        delivery = total * DELIVERY_RATE;
        System.out.printf("Delivery: $%.2f\n",delivery);
        total += delivery;
        System.out.printf("Total: $%.2f\n",total);
        weekendTotal += total;
        System.out.println();
    }
    System.out.printf("Weekend Total: $%.2f",weekendTotal);
  }
}