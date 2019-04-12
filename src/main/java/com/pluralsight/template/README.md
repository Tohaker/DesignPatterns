# Template

You can try out the Template example by running `gradlew -PmainClass=com.pluralsight.template.TemplateDemo run`.

The template pattern is created with an algorithm structure that is defined in the base class, and called by its 
children. In this example, the [OrderTemplate](OrderTemplate.java) is our base template and [WebOrder](WebOrder.java)
and [StoreOrder](StoreOrder.java) are its children. By defining the template that is the `processOrder()` method, we 
give each different order a standard way of processing an order, but allowing each step to be customised.

More information can be found [here](https://www.baeldung.com/java-template-method-pattern).