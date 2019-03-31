# Builders

This directory contains three ways of creating the same LunchOrder;
* Using the JavaBeans format (getters/setters) in [LunchOrderBean](LunchOrderBean.java).
* Using the Telescopic Constructor format in [LunchOrderTele](LunchOrderTele.java).
* Using the Builder static inner class in [LunchOrder](LunchOrder.java).

## JavaBeans
You can try this example by running the [LunchOrderBeanDemo](LunchOrderBeanDemo.java) `main` method.  
This way of creating an Object allows us full control over the order, but this comes with the overhead of writing a 
getter and setter for each property. Additionally, we can make the object mutable, which in many cases is undesirable.

## Telescopic Constructor
You can try this example by running the [LunchOrderTeleDemo](LunchOrderTeleDemo.java) `main` method.  
This way of creating an object now makes it [immutable](https://www.baeldung.com/java-immutable-object) but with the 
overhead of having to create every constructor possible for your object. 

## Builder Pattern
You can try this example by running the [BuilderLunchOrderDemo](BuilderLunchOrderDemo.java) `main` method.  
We now have an immutable LunchOrder that is constructed dynamically with as many or as few parameters as we wish to
give it. We have the option to add mandatory parameters to each object, or just build it up over the course of the
application.  