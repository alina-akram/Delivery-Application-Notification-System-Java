package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop {
    private String shopName;
    private int shopId;
    private String address;
    private ArrayList<DeliveryRequest> driverList;



    public Shop(String storeName ) { //constructor
        shopName = storeName; //assign inst var
        driverList = new ArrayList<DeliveryRequest>();

    }

    public void registerDriver(DeliveryRequest d){
        driverList.add(d); //adding to driver list
        System.out.println(d);

    }

    public void sendDeliveryRequest() {

        for (DeliveryRequest d : driverList){ //loops all requests in driver list
            d.deliveryRequest();

        }

    }




}
