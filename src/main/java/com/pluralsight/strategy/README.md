# Strategy

You can try out the Strategy example by running `gradlew -PmainClass=com.pluralsight.strategy.StrategyDemo run`.

The strategy pattern allows us to change the behaviour of an algorithm at runtime. An example in the wild is 
`java.util.Comparator` class, which allows us to define our own method of sorting a list. In this project, we create a 
base [Strategy](ValidationStrategy.java) for validating a [CreditCard](CreditCard.java). This base validation includes a
Luhn algorithm for realism. We can then define two new strategies, [AmexStrategy](AmexStrategy.java) and 
[VisaStrategy](VisaStrategy.java). In our main class, we provide these strategies as arguments to each new card we 
create, and the `isValid()` method is called to determine which algorithm is used to check the validity of a card 
number.

More information can be found [here](https://www.baeldung.com/java-strategy-pattern).