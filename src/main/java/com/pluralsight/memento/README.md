# Memento

You can try out the Memento example by running `gradlew -PmainClass=com.pluralsight.memento.MementoDemo run`.

The memento is used for capturing independent states of objects and providing the functionality to save and revert to 
and from those states. Like the `java.io.Serializable` interface we are able to _convert_ an object to a memento and 
back again, keeping track of how our object has changed. 
In this example, we take an [Employee](Employee.java) and make changes to it. We then instantiate a 
[Caretaker](Caretaker.java) to handle saves and reverts and print out how the object changes to the console.

More information can be found [here](https://www.geeksforgeeks.org/memento-design-pattern/)
