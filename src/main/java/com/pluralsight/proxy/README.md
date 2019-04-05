# Proxy

You can try out the Proxy example by running `gradlew -PmainClass=com.pluralsight.proxy.TwitterDemo run`.

A proxy patter acts as an intermediate interface between an object and a class that wishes to access it. Much like a 
security proxy, we can decide when to allow access to certain methods and when to throw Runtime Exceptions. In this
example, we use the proxy to allow getting a users Twitter Timeline, but not allowing them to post anything. It also
wraps the object such that we can control one-time method calls such as initialisation, restricting them to be on 
creation and then never again. 

This example requires a Twitter Dev account to run as it actually goes to get online resources. Go to 
[Twitter's Dev Page](https://developer.twitter.com/en/apps) to register an app and fill in the right variables in 
[TwitterServiceImpl](TwitterServiceImpl.java).

More information on the proxy pattern can be found [here](https://www.baeldung.com/java-structural-design-patterns)