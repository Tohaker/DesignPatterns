package com.pluralsight.command;

// Invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
