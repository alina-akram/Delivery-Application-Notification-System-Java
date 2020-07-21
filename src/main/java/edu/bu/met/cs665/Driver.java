//Assignment2.METCS665.AlinaAkram
package edu.bu.met.cs665;

public class Driver implements DeliveryRequest {
    //Implements the DeliveryRequest interface
     private String name;
     private int driverID;
     private String vehicleName;

     public Driver(String n){
         //constructor function to utilize Driver attribute
         name = n;
     }
    @Override
    public void deliveryRequest() {
        //Notifies the Observers/Drivers
        System.out.println(name + " has received your Delivery Request");

    }

    public String getName(){
         //Gets the name of the Driver/Observer
         return name;

    }


}
