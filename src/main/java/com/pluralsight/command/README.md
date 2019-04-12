# Command

You can try out the Command example by running `gradlew -PmainClass=com.pluralsight.command.CommandDemo run`.

The command patter aims to encapsulate an object and the data required to perform an action. This will often include the
method to call, its arguments and the object to which the method belongs. In the case of this example, the 
[OnCommand](OnCommand.java) and [ToggleCommand](ToggleCommand.java) both take instances of a [Light](Light.java) and 
perform the `on()` or `toggle()` method respectively. 
This patten decouples the receiver (the Light) from the invoker (the [Switch](Switch.java)) to follow OOP practices, and
allows further development of receivers without much, or any, modification to the invoker.

More information can be found [here](https://www.baeldung.com/java-command-pattern).