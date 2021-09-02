package com.bl.generic;

public class Maximum<T extends Comparable<T>> {
	T a, b, c;
	public Maximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
		public static String testMaximum(String a, String b, String c) {
		String max = a;
		if(b.compareTo(max) > 0) {
			max = b; // b is maximum
		}
		if(c.compareTo(max) > 0) {
			max = c; // c is maximum
		}
		printMax(a, b, c, max);
		return max;// returns largest object
	}
	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n",a , b , c , max);
	}
	public static void main(String[] args) {
		String aStr = "parrot", bStr = "pink", cStr = "white";
	
		Maximum.testMaximum(aStr, bStr, cStr);
			}	
	}

