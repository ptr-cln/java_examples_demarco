package org.protor.sandbox.celiento.tests;

public abstract class MarineVehicle extends AbstractVehicle {

	public MarineVehicle(EnumEngineType engineType) {
		super(engineType);

	}

	public MarineVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);
	}

	
}
