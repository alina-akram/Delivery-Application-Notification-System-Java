package edu.bu.met.cs665;
//import java.util.list;

//import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    Shop flowerShop = new Shop("Florals"); // Flower Shop
    Driver driver1 = new Driver("Driver1"); //drivers
    Driver driver2 = new Driver("Driver2");
    Driver driver3 = new Driver("Driver3");
    Driver driver4 = new Driver("Driver4");
    Driver driver5 = new Driver("Driver5");

    //register 5 drivers for the flowershop

    flowerShop.registerDriver(driver1);
    flowerShop.registerDriver(driver2);
    flowerShop.registerDriver(driver3);
    flowerShop.registerDriver(driver4);
    flowerShop.registerDriver(driver5);

    //delivery request
    flowerShop.sendDeliveryRequest();

  }


}

