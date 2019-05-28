package org.protor.sandbox.celiento;

import java.io.File;

public abstract class AerialVehicle extends AbstractVehicle {

	public AerialVehicle(EnumEngineType engineType) {
		super(engineType);
	}

	public AerialVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);

	}

	public AerialVehicle(File configFIle) {
		super(configFIle);

	}

	public AerialVehicle(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);

	}
	
	



}
