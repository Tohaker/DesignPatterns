# Interpreter

You can try out the Interpreter example by running `gradlew -PmainClass=com.pluralsight.interpreter.InterpreterDemo run`.

The interpreter is said to define the __grammar__ of a language. Much like the `Pattern` in `java.util.regex.Pattern`, 
it allows us to build our own custom regular expressions such as human language, or machine instructions. We do this by
building an abstract tree of syntax and running the interpretation. Each [Expression](Expression.java) may be made of
other expressions, allowing the tree to be built and recursed through. We should generally use this pattern the grammar
is relatively simple. 

In this example, we build logical expressions [And](AndExpression.java) and [Or](OrExpression.java) and combine them 
with [TerminalExpression](TerminalExpression.java)s to create a recursion tree to interpret as the main method finds 
whether the expression given matches that in the tree.

More examples can be found [here](https://www.baeldung.com/java-interpreter-pattern)