# Iterator

You can try out the Iterator example by running `gradlew -PmainClass=com.pluralsight.iterator.IteratorDemo run`.

The iterator pattern is so widely used that it has its own class, in `java.util.Iterator`. It allows us to loop through
a large structure, such as a List or array, and perform operations of every item in the iterator. By abstracting the 
implementation of how to loop through our object from the Client, we allow them to use a universal syntax for accessing
all the items in our object. The code in the iterator can be made much more efficient than a normal for loop, and in 
some cases an Iterator can just do more than an indexed for loop, where an object may not have a method to access an 
object at a particular index. 

Iterators allow us to use the `foreach` and `while(iterator.hasNext())` looping methods, which are often the fastest way
to loop.

More information can be found [here](https://www.geeksforgeeks.org/iterator-pattern/)