package com.csi.enums;

public class ENumConcept {
	public enum Months {
		Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sept, oct, Nov, Dec
	}

	public static void main(String[] args) {
		for (Months m : Months.values()) {
			System.out.println("Summer");
			if (m.toString().equals("Mar")) {
				System.out.println("Winter");
			}
			else
				System.out.println("Raining");

		}

	}
}