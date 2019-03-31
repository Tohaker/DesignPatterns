# Abstract Factory

To try this example, run the [AbstractFactoryDemo](AbstractFactoryDemo.java) `main` method.  
The Abstract Factory, as the name implies, abstracts multiple factories to the client. We use it to access the correct
factory for the implementation we need. In this example, a different credit card factory is returned depending on a
users credit score. They then have the option in the returned factory to choose a tier of credit card. Until the user
prints out the type of card they got, they won't know what the factories have chosen for them. This is preferably used
when you don't need your client to know what they're exactly accessing, only that you will choose correctly which object
they can create given certain information.