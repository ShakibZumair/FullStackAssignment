package com.java.String;


public class Garbage {
	static String s;

	public Garbage(String s) {
		super();
		this.s = s;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Garbage Clean");
	}

	@Override
	public String toString() {
		return "Garbage [s=" + s + "]";
	}

	public static void main(String[] args) {
		Garbage g = new Garbage("Zumair");
		g = null;
//    System.out.println(g);
		System.gc();

	}
}