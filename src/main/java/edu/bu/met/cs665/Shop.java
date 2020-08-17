/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #6
 * Aug 16, 2020
 */
package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop implements ShopInterface {
    //Shop class with required attributes/methods

    private String shopName;
    private int shopId;
    private String address;
    private ArrayList<DriverInterface> driverList;


    public Shop(String storeName ) {
        //constructor function for necessary shop attributes
        shopName = storeName;
        driverList = new ArrayList<DriverInterface>();

    }

   @Override
    public void registerDriver(DriverInterface d){
        //registers driver one at a time
        driverList.add(d);

    }

    @Override
    public ArrayList<DriverInterface> getDrivers(){
        //returns the list of registered drivers/Observers
        return driverList;
    }
    @Override
    public void removeDriver(DriverInterface d){
        //removes drivers/Observers
        driverList.remove(d);


    }
    @Override
    public void sendDeliveryRequest(int cNumber, String dAddress) {
        //sends the delivery request to all registered drivers/Observers/A6 Refactor:Added additional data/attributes for use

        for (DriverInterface d : driverList){
            DeliveryRequest dRequest = new DeliveryRequest(d,this, cNumber, dAddress);
            d.update(dRequest);

        }
    }

    public String getShopName() {
        //getter function for shop names
        return shopName;
    }

}
