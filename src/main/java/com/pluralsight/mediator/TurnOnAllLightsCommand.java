package com.pluralsight.mediator;

// Concrete Command
public class TurnOnAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOnAllLights();
	}
}