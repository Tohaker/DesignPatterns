# Flyweight

You can try out the Flyweight example by running `gradlew -PmainClass=com.pluralsight.flyweight.FlyweightInventoryDemo run`.

The flyweight pattern is used to reduce the memory consumption of a process. It is based on the factory pattern 
(demostrated in [Catalog](Catalog.java)) that recycles objects - that is, it checks whether an [Item](Item.java) has
already been instantiated, and ignores that being added if so. In this example, you can see that out of the many Items
'created', only 3 are actually stored as they are unique. Flyweight objects are immutable, and any operation on their 
state must be performed by the factory.

More information can be found [here](https://www.baeldung.com/java-flyweight)