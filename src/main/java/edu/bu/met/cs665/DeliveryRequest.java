/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #6
 * Aug 16, 2020
 */
package edu.bu.met.cs665;

public class DeliveryRequest {
    //A6 refactor: separate delivery request class for abstracting data
    private final DriverInterface driver;
    private final Shop shopInst; //most inst vars are privtae
    private final int confirmationNumber;
    private final String deliveryAddress; //can't be reset /must be in the constructer



    public DeliveryRequest(DriverInterface driver, Shop sInst, int cNumber, String dAddress) {
        //constructer
        this.driver = driver;
        shopInst = sInst;
        confirmationNumber = cNumber;
        deliveryAddress = dAddress;
    }

    public void printRequest() {
        //Notifies the Observers/Drivers/A6 Refactor

        System.out.println(driver.getName()+ " has received your Delivery Request for " + shopInst.getShopName()
                + "Confirmation Number: " + confirmationNumber + ", ADDRESS: " + deliveryAddress);

    }
}