package com.java.Oops;

public class Box {

	int width;
	int height;
	int depth;

	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	int getVolume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(4, 5, 6);
		System.out.print("The volume of Box is = " + box.getVolume());
	}
}
