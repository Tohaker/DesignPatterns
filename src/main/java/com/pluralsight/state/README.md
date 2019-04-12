# State

You can try out the State example by running `gradlew -PmainClass=com.pluralsight.state.StateDemo run`.

To track states, we could well use a whole list of `if/else` statements, but this can get complex very quickly. The 
state pattern combats this by allowing an object to change its behaviour without changing its class. We achieve this by
storing each [State](State.java) as its own object, with each state having its own actions. In most cases these actions 
are proceeded by the state returning the next known state back to the state holder, in this case [Fan](Fan.java). 
In this example, we can add as many new states to the Fan as we want, and as long as they each send back their next 
state, the client doesn't have to worry about considering what the next state is - they will just get it.

More information can be found [here](https://www.baeldung.com/java-state-design-pattern)