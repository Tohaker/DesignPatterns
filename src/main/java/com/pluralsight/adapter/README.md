# Adapter

You can try out the Adapter example by running `gradlew -PmainClass=com.pluralsight.adapter.AdapterDemo run`.

An Adapter comes in useful when interfacing with legacy or inaccessible code. It provides a class that takes the
structure of one class and exposes equivalent methods for getting data, or carrying out other methods. In the example
in this folder, 3 different Employee classes exist, with only one implementing the Employee interface. We use both
[EmployeeAdapterLdap](EmployeeAdapterLdap.java) and [EmployeeAdapterCSV](EmployeeAdapterCSV.java) to convert their 
respective classes to ones that can be interfaced in the same way as the [EmployeeDB](EmployeeDB.java).

A real life example of an Adapter is the [Array.asList](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#asList(T...)
function.