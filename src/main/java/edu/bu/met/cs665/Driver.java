package edu.bu.met.cs665;

public class Driver implements DeliveryRequest {  //implement req
     private String name;
     private int driverID;
     private String vehicleName;

     public Driver(String n){
         //constructor
         name = n;
     }
    @Override
    public void deliveryRequest() {
        //req method/ Shop put out request and driver receives it
        System.out.println(name + " has received your Delivery Request");

    }



}
