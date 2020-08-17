/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #6
 * Aug 16, 2020
 */
package edu.bu.met.cs665;


public class Main {
  public static void main(String[] args) {
    //main method to execute functions at run-time

    //Concrete Subjects
    Shop flowerShop = new Shop("Florals ");
    Shop giftShop = new Shop("Gift Shop ");
    Shop chocolateShop = new Shop("Chocolate Shop ");

    //Concrete observers
    Driver driver1 = new Driver("Adam - Private Driver");
    Driver driver2 = new Driver("Steven - Taxi Driver");
    Driver driver3 = new Driver("Ahmad - Delivery Van");
    Driver driver4 = new Driver("Salar - Delivery Van");
    Driver driver5 = new Driver("John - Taxi Driver");

    //register 5 drivers for the flowershop
    flowerShop.registerDriver(driver1);
    flowerShop.registerDriver(driver2);
    flowerShop.registerDriver(driver3);
    flowerShop.registerDriver(driver4);
    flowerShop.registerDriver(driver5);

    //register 2 drivers for the Gift Shop
    giftShop.registerDriver(driver1);
    giftShop.registerDriver(driver3);

    //register 1 driver for the Chocolate Shop
    chocolateShop.registerDriver(driver2);

    //delivery request from all three shops
    System.out.println("Flower Shop Delivery: ");
    flowerShop.sendDeliveryRequest( 23,  " 1234 main st");
    System.out.println("Gift Shop Delivery: ");
    giftShop.sendDeliveryRequest(24,  " 4321 chestnut st" );
    System.out.println("Chocolate Shop Delivery: ");
    chocolateShop.sendDeliveryRequest(25,  " 54321 market st");
  }
}

