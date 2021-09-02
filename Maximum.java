package com.bl.generic;

public class Maximum<T extends Comparable<T>> {
	T a, b, c;
	public Maximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T maximum() {
		return Maximum.maximum(a, b, c);
	}
	//determines the largest of 3 comparable objects
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a; //assuming a is maximum
		if(b.compareTo(max) > 0) {
			max = b; // b is maximum
		}
		if(c.compareTo(max) > 0) { //compares the c value with max 
			max = c; // c is maximum
		}
		printMax(a, b, c, max);
		return max;// returns largest object
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
		Integer aInt = 4, bInt = 5, cInt = 6;
		Float aFl = 7.7f, bFl = 8.8f, cFl = 9.9f;
		String aStr = "parrot", bStr = "pink", cStr = "white";
	
		//Maximum.testMaximum(aStr, bStr, cStr);
		new Maximum<Integer>(aInt, bInt, cInt).maximum();
		new Maximum<Float>(aFl, bFl, cFl).maximum();
		new Maximum<String>(aStr, bStr, cStr).maximum();
		
		}
	}

