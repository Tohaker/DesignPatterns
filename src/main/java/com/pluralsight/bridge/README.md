# Bridge

You can try out the Bridge example by running `gradlew -PmainClass=com.pluralsight.bridge.BridgeDemo run`.
The examples in [shape1](shape1) illustrate a poorly implemented pattern of assigning a colour to a shape.
[shape2](shape2) shows how this same example can be abstracted out using a Bridge.

A Bridge is best used when planned in advance. You may have a number of distinct parts to an application that just don't
need to know the other exists. This is mainly found where a project may evolve over time and you want to keep 
refactoring to a minimum. Bridging is useful here as it removes any close associations between Objects and simply allows
them to interface as minimally as possible. A change to one side of the bridge may only need a method declaration
change, or adapt how the bridge processes information. The other side should not be affected. 

A good example of a Bridge pattern is the [EmbeddedDriver](https://db.apache.org/derby/docs/10.3/devguide/cdevdvlp40170.html).