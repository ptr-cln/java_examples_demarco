package org.protor.sandbox.celiento;

import java.io.File;

import org.w3c.dom.Node;

public abstract class AbstractVehicle {

	private String name = "";
	private EnumEngineType engineType = EnumEngineType.NONE;
	private double range = 0.0;  // KM
	private double endurance = 0.0; // HOURS
	private int numMaxPassengers = 0;
	private double maxPayload = 0.0; // KG
	
	protected File configFile;
	protected Node node;
	

	//--------------------------------------------------------------------------------------------
	public AbstractVehicle( EnumEngineType engineType) {
		this.engineType = engineType;
	}


	public AbstractVehicle(String name, EnumEngineType engineType) {
		this.name = name;
		this.engineType = engineType;
	}


	/**
	 * 
	 * @param name	Name of Vehicle	
	 * @param engineType	Type of Engine	
	 * @param range		Range in KM
	 * @param endurance		Endurance in hours
	 * @param numMaxPassengers		Number of max passengers
	 * @param maxPayload	Payload in KG
	 */
	
	public AbstractVehicle(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		this.name = name;
		this.engineType = engineType;
		this.range = range;
		this.endurance = endurance;
		this.numMaxPassengers = numMaxPassengers;
		this.maxPayload = maxPayload;
//		this.configFile = configFile;
	}


	//--------------------------------------------------------------------------------------------

	public AbstractVehicle(File configFile) {
		this.configFile = configFile;
		this.loadFromNode(this.node);
	}

	protected abstract boolean loadFromFile(File configFile); //In subclasses

	protected abstract boolean loadFromNode(Node node);
	public AbstractVehicle(Node node) {
		this.node = node;
		this.loadFromFile(configFile);
	}
	
	public EnumEngineType getEngineType() {
		return engineType;
	}
	public void setEngineType(EnumEngineType engineType) {
		this.engineType = engineType;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}   
