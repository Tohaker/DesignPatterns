# Facade

You can try out the Facade example by running `gradlew -PmainClass=com.pluralsight.facade.FacadeJdbcDemo run`.
The [JdbcDemo](JdbcDemo.java) example can also be tried by running `gradlew -PmainClass=com.pluralsight.facade.JdbcDemo run`.

The facade pattern is often used to refactor complex or incorrect code. It wraps around another class, using composition
to create a new interface for a client to call a particular API. Whilst it should not be used in the design of a 
particular API, it can be used when modifying someone elses code.

This example takes the complex code found in [JdbcDemo](JdbcDemo.java) and wraps it in the [JdbcFacade](JdbcFacade.java).
By doing this we make the client code in [FacadeJdbcDemo](FacadeJdbcDemo.java) far simpler to use and understand,
abstracting away the things like Connections, SQL Statements, and parsing Strings.
