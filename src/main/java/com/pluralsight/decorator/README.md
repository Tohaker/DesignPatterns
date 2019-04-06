# Decorator

You can try out the Decorator example by running `gradlew -PmainClass=com.pluralsight.decorator.DecoratorSandwichDemo run`.

A decorator pattern can be used to attach additional functionality to an object. Unlike a builder, which is a creational
pattern, a decorator enhances the interface of the original object, instead of overriding it. The aim is to reduce 
subclassing in each decorating element by preferring composition over inheritance. 

In this example directory, we have a [Sandwich](Sandwich.java) interface. A concrete example of this is a 
[SimpleSandwich](SimpleSandwich.java), with just some bread. We use a [SandwichDecorator](SandwichDecorator.java) 
abstract class to supply many other decorators, such as Meat or Dressing. These objects CANNOT be instantiated without a
Sandwich TO decorate, as this forms the composition of the sandwich. Additionally, these decorators don't have to be 
added in any particular order, they're just there to complement the base class.

More information can be found [here](https://www.baeldung.com/java-decorator-pattern)