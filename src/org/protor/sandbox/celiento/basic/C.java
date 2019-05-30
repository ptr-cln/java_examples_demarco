package org.protor.sandbox.celiento.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C extends AbstractB {
	
	double f;
	List<Double> l;
	
	public C() {
		super();
		System.out.println("C >>> Costructor");
		initialize();
	}
	

	private void initialize() {

		System.out.println("C >>> inizialize");

		this.f = 0d;
		this.l = new ArrayList<Double>();
	}


	public C(double d, int[] a) {
		super(d, a);
		// TODO Auto-generated constructor stub
	}


	public C(int i, boolean b, double d, int[] a,double f,List<Double> l) {
		super(i, b, d, a);
		this.f = f;
		this.l = l;
		
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString() + "\n");
		sb.append("C [f=" + f + ", l=" + Arrays.toString((l.toArray())) +  "]");
		return sb.toString();
	}
	
	
	

	
}
