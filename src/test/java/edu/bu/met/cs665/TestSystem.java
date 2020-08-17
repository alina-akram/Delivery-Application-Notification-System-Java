/**
 * Alina Akram
 * Course CS-665
 * Summer 2
 * Assignment #6
 * Aug 16, 2020
 */

package edu.bu.met.cs665;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSystem {
    @Test
    public void testAddRemoveDrivers() {
        //Tests adding/removing of drivers
        Shop flowerShop = new Shop("Florals"); // Flower Shop

        ArrayList<DriverInterface> drivers = null;
        for (int x = 0; x < 5; x++) { // x from 0 to 4
            Driver driver = new Driver("Adam" + x);
            flowerShop.registerDriver(driver);
            drivers = flowerShop.getDrivers(); //list
            assertEquals(driver, drivers.get(drivers.size() - 1)); // assert the driver i added is at the end of the list
            assertEquals("Adam" + x, ((Driver) drivers.get(drivers.size() - 1)).getName()); // assert the driver name i added is at the end of the list
            assertEquals(x + 1, drivers.size()); // assert that size matches
        }

        for (int x = 0; x < 5; x++) { // x from 0 to 4
            flowerShop.removeDriver(drivers.get(0));
            drivers = flowerShop.getDrivers();
            assertEquals(4 - x, drivers.size()); // assert that size matches
        }
    }
}





