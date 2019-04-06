package com.pluralsight.decorator;

public class DecoratorSandwichDemo {

	public static void main(String[] args) {
		// Different to a creational pattern, we are simply adding new functionality to the Simple Sandwich rather than
		// creating something entirely new.
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}
}
