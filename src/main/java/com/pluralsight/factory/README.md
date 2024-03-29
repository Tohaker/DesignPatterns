# Factory

You can try out the Factory example by running `gradlew -PmainClass=com.pluralsight.factory.FactoryDemo run`.
  
This example defines many website page types (all empty for simplicity) and an abstract [Website](Website.java) object.
This Website class defines a `createWebsite` method that all subclasses must implement. This is key to making a factory
work, as the [WebsiteFactory](WebsiteFactory.java) `getWebsite` method takes in a enum website type and creates the
corresponding website based on that chosen through the interface. 

An example of a real world factory is the Java 
[Calendar](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) class.

More information can be found [here](https://www.baeldung.com/creational-design-patterns).