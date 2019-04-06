# Chain of Responsibility

You can try out the Chain example by running `gradlew -PmainClass=com.pluralsight.chain.ChainOfResponsibilityDemo run`.

The chain is best used when you have a series of objects the implement the same interface, but have varying abilities 
based on the kinds of requests they get. In this example, the [Director](Director.java) can only approve some 
[Requests](Request.java). When it receives one it cannot process, it passes it to its successor, which is the [VP](VP.java).
Each link in the chain knows about itself and the next link, and nothing else. This makes it very easy to add new links
without having to inform the client. They will just get the correct response handled by the object that needed to make
it. 

See [here](https://www.baeldung.com/chain-of-responsibility-pattern) for more information.
