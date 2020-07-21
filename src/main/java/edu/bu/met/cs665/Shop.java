//Assignment2.METCS665.AlinaAkram
package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop implements ShopInterface {
    private String shopName;
    private int shopId;
    private String address;
    private ArrayList<DeliveryRequest> driverList;


    public Shop(String storeName ) {
        //constructor function for necessary shop attributes
        shopName = storeName;
        driverList = new ArrayList<DeliveryRequest>();

    }

//   @override
    public void registerDriver(DeliveryRequest d){
        //registers driver one at a time
        driverList.add(d);

    }

    public ArrayList<DeliveryRequest> getDrivers(){
        //returns the list of registered drivers/Observers
        return driverList;
    }

    public void removeDriver(DeliveryRequest d){
        //removes drivers/Observers
        driverList.remove(d);


    }

    public void sendDeliveryRequest() {
        //sends the delivery request to all registered drivers/Observers

        for (DeliveryRequest d : driverList){
            d.deliveryRequest();

        }
    }
}
