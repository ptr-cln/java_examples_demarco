package org.protor.sandbox.celiento;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.protor.sandbox.celiento.basic.A;
import org.protor.sandbox.celiento.basic.B;

public class TestBasic01 {

	public static void main(String[] args) {

		A a1 = new A();
		a1.setD(50d);
		a1.setI(300);
		a1.setS("Prova");

		A a2 = new A(2,3d, "      Prova        ");
		System.out.println(a2.getD());
		System.out.println(a2.getS().toUpperCase().trim().replace("P", "T"));

		String[] prova = {"de!","si","Pre"};
		B b1 = new B();
		b1.setB(true);
		b1.setSa(prova);
		System.out.println(b1.getSa()[2] + b1.getSa()[1] + b1.getSa()[0]);
	
//		String[] s1 = prova;
//		System.out.println(s1[0]);
//		
//		s1[0] = "cazzo" ;
//		System.out.println(s1[0]);
//		System.out.println(prova[0]);
//
//		System.out.println(b1.getSa()[2] + b1.getSa()[1] + b1.getSa()[0]);
//		
//		
//		String[] s1a = Arrays.copyOf(s1, 5);
//		System.out.println(s1a[0] + s1a[1] + s1a[2] + s1a[3] + s1a[4]);
//		
//		String[] s1b = ArrayUtils.addAll(s1, prova);
//		System.out.println(Arrays.toString(s1b));	
		
		
	}

}

