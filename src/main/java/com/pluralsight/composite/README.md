# Composite

You can try out the Composite example by running `gradlew -PmainClass=com.pluralsight.composite.CompositeMenuDemo run`.

The composite design pattern is one that enables a tree-like structure to be formed. Each composite object acts a 'leaf'
on this tree, and adding one to a parent leaf creates a 'branch'. Many branches form a tree, and so on. The cascading 
structure of the `toString()` method in [Menu](Menu.java) makes it easy to create a catch-all object that has the power
to accept a hierarchy. 