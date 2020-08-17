/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #6
 * Aug 16, 2020
 */
package edu.bu.met.cs665;

public class Driver implements DriverInterface {
    //Implements the DeliveryRequest interface/added some attributes
     private String name;
     private int driverID;
     private String vehicleName;
     private DeliveryRequest currentRequest;

     public Driver(String n){
         //constructor function to utilize Driver attribute
         name = n;
     }
    @Override
    public void update(DeliveryRequest d) {
        //prints out the delivery request/renamed for A6
        currentRequest = d;

        d.printRequest();
    }

    public String getName(){
         //Gets the name of the Driver/Observer
         return name;

    }
}
