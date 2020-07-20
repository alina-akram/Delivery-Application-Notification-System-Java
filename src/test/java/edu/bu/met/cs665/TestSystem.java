package edu.bu.met.cs665;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSystem {
    @Test
    public void testAddRemoveDrivers () {
        Shop flowerShop = new Shop("Florals"); // Flower Shop

        ArrayList<DeliveryRequest> drivers = null;
        for (int x = 0; x < 5; x++) { // x from 0 to 4
            Driver driver = new Driver("Adam"+x);
            flowerShop.registerDriver(driver);
            drivers = flowerShop.getDrivers(); //list
            assertEquals(driver, drivers.get(drivers.size()-1)); // assert the driver i added is at the end of the list
            assertEquals("Adam"+x, ((Driver) drivers.get(drivers.size()-1)).getName()); // assert the driver name i added is at the end of the list
            assertEquals(x + 1, drivers.size()); // assert size matches
        }

        for (int x = 0; x < 5; x++) { // x from 0 to 4
            flowerShop.removeDriver(drivers.get(0));
            drivers = flowerShop.getDrivers();
            assertEquals(4 - x, drivers.size()); // assert size matches
        }

    }

//    @Test
//    public void testAddRemoveDrivers () {
//        //
//        Shop flowerShop = new Shop("Florals"); // Flower Shop
//        Driver driver1 = new Driver("Adam - Private Driver");
//        flowerShop.registerDriver(driver1);
//        ArrayList<DeliveryRequest> drivers =  flowerShop.getDrivers(); //list
//
//        assertEquals(drivers.get(0), driver1);
//        assertEquals(drivers.size(), 1);
//        flowerShop.removeDriver(driver1);
//        ArrayList<DeliveryRequest> removeDrivers =  flowerShop.getDrivers();
//        assertEquals(removeDrivers.size(), 0);
//
//
}





