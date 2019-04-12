# Singleton

You can try out the Singleton example by running `gradlew -PmainClass=com.pluralsight.singleton.DbSingletonDemo run`.

A Singleton design is very useful when you want to only create a single instance of an object throughout the lifecycle
of your application. This guarantees control of a resource, and we can _Lazily Load_ the object at the time of use, not
at time of creation.   
Examples of Java classes that implement this design pattern are Runtime, Logger, and Graphic Managers. 

The example in [DbSingleton](DbSingleton.java) shows how to create a Thread Safe Singleton with multiple Objects within
the Singleton.

More information can be found [here](https://www.baeldung.com/java-singleton).