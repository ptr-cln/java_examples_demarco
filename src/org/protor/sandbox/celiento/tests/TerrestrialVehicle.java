package org.protor.sandbox.celiento.tests;

import java.io.File;

public abstract class TerrestrialVehicle extends AbstractVehicle {
	
	private EnumGroundContactType groundContactType = EnumGroundContactType.WHEELS;
	
	
//-----------------------------------------------------------------------------------------------
	
	public TerrestrialVehicle(EnumEngineType engineType) {
		super(engineType);
	}

	public TerrestrialVehicle(String name, EnumEngineType engineType) {
		super(name, engineType);
		
	}

	public TerrestrialVehicle(File configFIle) {
		super(configFIle);
		// TODO Auto-generated constructor stub
	}

	public TerrestrialVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		// TODO Auto-generated constructor stub
	}
	
	public TerrestrialVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		this.groundContactType = groundContactType;
	}

	
	//----------------------------------------------------------------------------------------------	

	public EnumGroundContactType getGroundContactType() {
		return groundContactType;
	}
	
	public void setGroundContactType(EnumGroundContactType groundContactType) {
		this.groundContactType = groundContactType;
	}
		
}
