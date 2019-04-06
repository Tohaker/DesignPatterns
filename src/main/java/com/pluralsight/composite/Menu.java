package com.pluralsight.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	// This shows the power of Composite designs. We design the toString method to be aware of the Menu's children,
	// and we end up with a simple yet elegant way of printing all submenus of a menu.
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(); //builder pattern
		
		builder.append(print(this));
		
		Iterator<MenuComponent> itr = menuComponents.iterator();
		while(itr.hasNext()) {
			MenuComponent menuComponent = itr.next();
			builder.append(menuComponent.toString()); // By calling the same method on the next object, we cascade
													  // down the hierarchy.
		}
		
		return builder.toString();
	}
}
