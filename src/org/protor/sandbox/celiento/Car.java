package org.protor.sandbox.celiento;

import java.io.File;

import org.w3c.dom.Node;

public class Car extends TerrestrialVehicle {

	public Car(EnumEngineType engineType) {
		super(engineType);
		// TODO Auto-generated constructor stub
	}

	public Car(File configFIle) {
		super(configFIle);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload, groundContactType);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		// TODO Auto-generated constructor stub
	}

	public Car(String name, EnumEngineType engineType) {
		super(name, engineType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	
	
	@Override
	protected boolean loadFromFile(File configFile) {
		// TODO Auto-generated method stub
		
		//TODO : implement the logic here
		return false;
	}
	
	

}
