package com.java.exception.assignment7;

public class ExceptionChaining {

	public static void main(String[] args) {

		try {
			// Create Exception
			NumberFormatException ex = new NumberFormatException("Exception");

			// Setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));

			// Throw exception with cause
			throw ex;
		}

		catch (NumberFormatException ex) {
			// display exception
			System.out.println(ex);

			// Getting the actual cause of the exception
			System.out.println(ex.getCause());
		}

	}

}