#Delivery Application - Notification System

#Program Details

This program implements the code representing a consortium of shops that have an agreement with local independent van and taxi drivers to deliver products from the stores to the customer’s destinations. This project implements a notification system to send notifications about delivery requests to drivers. The delivery request should be broadcasted to all drivers. 


How is the flexibility, of your implementation, e.g., how you add or remove in future new
types?

This program implements the Observer Design Pattern. Due to the one-to-many requirements of this project, it allows for the subject to update all occurring changes/events across all required platforms automatically. It is quite flexible. The subject and observers do not need to have constant interactions. Observers (Drivers) can be added and removed at will when the program is running. It reduces dependencies between all players and the broadcast notification interface works as an independent entity. 


How is the simplicity and understandability of your implementation?

The Shop class (Subject) has several methods where it can register and remove drivers. The subject interface - ShopInterface creates and sends OUT the delivery request notification

The DeliveryRequest.java is an interface (Observable) that notifies the drivers. It contains the deliveryRequest() method that carries that out. Both interfaces work independently.

The Driver class provides necessary registration information and the deliveryRequest() method which then assigns the driver to particular deliveries. 

Due to the simple implementation of this project, the Main.java demonstrates 3 shops; Flower Shop, Gift Shop and Chocolate Shops and 5 drivers. It registers each of these drivers under their respective stores and sends delivery requests (Shop.java). On a as-needed basis, the deliveryRequest() method in the Driver class assigns and confirms receipt of the new delivery request confirmation. 


How you avoided duplicated code?

Due to the nature of the Observer Pattern, the program avoids constant pulls and pushes, leaving the subjects and observers free from constant interaction. This also helped us avoid unnecessary duplicate code. 

Github Repository Link: https://github.com/alina-akram/met-cs665-assignment-2-alina-akram

# Project Template

This is a Java Maven Project Template


# How to compile the project

The project is built in Java Maven Template and it utilizes Apache Maven to compile and run it. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


