# Observer

You can try out the Observer example by running `gradlew -PmainClass=com.pluralsight.observer.ObserverDemo run`.

An observer specifies communication between objects. These are called Observables and [Observer](Observer.java)s. When 
and observable changes its state, it notifies the observer that makes something happen because of it. In our example
we have a [MessageStream](MessageStream.java) that has observable objects attached to it. When these objects are set
a message, they call the [Subject](Subject.java) which notifies its observers. This causes them to return a message to 
the console. 
We separate the Client classes from direct interaction with the client by this stream.

More information can be found [here](https://www.baeldung.com/java-observer-pattern).