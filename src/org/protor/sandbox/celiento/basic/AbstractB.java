package org.protor.sandbox.celiento.basic;

import java.util.Arrays;

public abstract class AbstractB extends AbstractA {

	protected double d;
	protected int[] a;


	public AbstractB(double d, int[] a) {
		super();
		this.d = d;
		this.a = a;
	}


	public AbstractB() {
		super();
		System.out.println("AbstractB >> costructor,with no fields");
		initialize();
	}


	public AbstractB(int i, boolean b,double d, int[] a) {
		super(i, b);
		this.d = d;
		this.a = a;

	}

	private void initialize() {

		System.out.println("AbstractB >>> inizialize");

		this.a = null;
		this.d = 0d;
	}


	/**
	 * @return the d
	 */
	public double getD() {
		return d;
	}


	/**
	 * @param d the d to set
	 */
	public void setD(double d) {
		this.d = d;
	}


	/**
	 * @return the a
	 */
	public int[] getA() {
		return a;
	}


	/**
	 * @param a the a to set
	 */
	public void setA(int[] a) {
		this.a = a;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + "\n");
		sb.append("AbstractB [d=" + d + ", a=" + Arrays.toString(a) + "]");
		return sb.toString();
	}




}
