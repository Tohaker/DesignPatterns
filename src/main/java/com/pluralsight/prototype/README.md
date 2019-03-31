# Prototype

To try the example, run [PrototypeDemo](PrototypeDemo.java) `main` method.  
The prototype design pattern is one that implements an Object with the 
[Cloneable](https://docs.oracle.com/javase/7/docs/api/java/lang/Cloneable.html) interface. In this example, this is the
[Item](Item.java) object. By having a cloneable object, we never have to call the `new` operator, instead just cloning 
the existing parameters of the parent object. Doing so creates new objects in memory, but can either retain the same 
object references internally (_shallow copy_) or create new clones of them with the same data but different memory 
addresses (_deep copy_).