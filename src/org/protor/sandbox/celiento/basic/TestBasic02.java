package org.protor.sandbox.celiento.basic;

import java.util.ArrayList;
import java.util.List;

public class TestBasic02 {

	public static void main(String[] args) {
		
		C c1 = new C();
		
		System.out.println("--------------------------------");
		
		List<Double> l0 = new ArrayList<Double>();
		l0.add(3d);
		
		C c2 = new C(10,true,-0.7,new int[]{3,2},0.9,l0);
		
		System.out.println(c1+"\n");
		System.out.println(c2);
	}

}
