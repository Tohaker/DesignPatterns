package com.pluralsight.decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addMeat();
	}

	// We are decorating the SandwichDecorator with another method that adds extra functionality.
	private String addMeat() {
		return " + turkey";
	}
}
