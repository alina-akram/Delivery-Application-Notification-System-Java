/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #6
 * Aug 16, 2020
 */
package edu.bu.met.cs665;

import java.util.ArrayList;

public interface ShopInterface {
    //Shop system that creates the delivery request/A6 refactor: added 3 necessary methods

    public void sendDeliveryRequest(int cNumber, String dAddress);
    public void registerDriver(DriverInterface d);
    public void removeDriver(DriverInterface d);
    public ArrayList<DriverInterface> getDrivers();

}
