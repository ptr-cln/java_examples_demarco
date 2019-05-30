package org.protor.sandbox.celiento.basic;

public abstract class AbstractA {

	protected int i;
	protected boolean b;

	//--------------------------------------	
	public AbstractA () {
		System.out.println("AbstractA >> costructor");
		initialize();
	}


	public AbstractA(int i, boolean b) {	
	this.i = i;
	this.b = b;
	}
	//--------------------------------------	

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
	/**
	 * @return the b
	 */
	public boolean isB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(boolean b) {
		this.b = b;
	}

	private void initialize() {

		System.out.println("AbstractB >>> inizialize");

		this.i = 0;
		this.b = false;
	}


	@Override
	public String toString() {
		return "AbstractA [i=" + i + ", b=" + b + "]";
	}


}
