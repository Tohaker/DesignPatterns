# Mediator

You can try out the Mediator example by running `gradlew -PmainClass=com.pluralsight.mediator.MediatorDemo run`.

The mediator loosely couples two objects together to reduce complexity and dependencies between tightly coupled objects
communicating directly with one another. In this example, the Command pattern is used to implement an execution of a 
command, given a mediator object. The mediator then selects the right method to run based on which Command called it.
Neither the [Command](Command.java) nor the [Mediator](Mediator.java) know about each other, but the mediator allows 
many commands to use the same object to call their methods.

More information can be found [here](https://www.baeldung.com/java-mediator-pattern)