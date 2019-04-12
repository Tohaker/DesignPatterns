# Visitor

You can try out the Visitor example by running `gradlew -PmainClass=com.pluralsight.visitor.VisitorDemo run`.

The visitor pattern is designed to prevent minor modifications to an interface meaning you have to make the change 
everywhere down the chain of children objects. We implement a [Visitor](AtvPartVisitor.java) that specifies how each
visited object is interpreted. In this example, [Wheel](Wheel.java), [Fender](Fender.java) and [Oil](Oil.java) are all
[Part](AtvPart.java)s with an `accept(visitor)` method. The same code is implemented to call the `visit` method on each
of these visitors, which are defined in our concrete visitors; [AtvPartsDisplayVisitor](AtvPartsDisplayVisitor.java)
and [AtvPartsShippingVisitor](AtvPartsShippingVisitor.java). It is here we actual write our logic for what calculations
need to take place, and whenever changes occur we only have to define them in our visitor classes, not every single 
object that accepts a visitor. This reduces the required maintenance on our code.

More information can be found [here](https://www.baeldung.com/java-visitor-pattern)