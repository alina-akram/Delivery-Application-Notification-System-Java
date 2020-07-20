package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop {
    //Shop is the Observable
    private String shopName;
    private int shopId;
    private String address;
    private ArrayList<DeliveryRequest> driverList; //Observers



    public Shop(String storeName ) { //constructor
        shopName = storeName; //assign inst var
        driverList = new ArrayList<DeliveryRequest>();

    }

//    @override
    public void registerDriver(DeliveryRequest d){
        driverList.add(d); //adding to driver list
//        System.out.println(d);

    }

    public ArrayList<DeliveryRequest> getDrivers(){
        return driverList;
    }

    public void removeDriver(DeliveryRequest d){
        driverList.remove(d); //adding to driver list
//

    }

    public void sendDeliveryRequest() {

        for (DeliveryRequest d : driverList){ //loops all requests in driver list
            d.deliveryRequest();

        }
    }
}
