package no.itfakultetet.java;

import org.apache.commons.math3.util.Precision;

import java.text.DecimalFormat;
import java.util.Random;

public class Tall {

	public static void main(String[] args) {

		// Noen tall å jobbe med:

		double tall1 = 34.2356;
		int tall2 = 6;
		float tall3 = 3.67f;

		
		// Elementære regneopreasjoner
		
		System.out.println("("+tall1+" + "+tall2+")*"+ tall3 +" = "+ (tall1+tall2)*tall3);
		
		
		// Avrunding av tall

		System.out.println("Tall1 = " + tall1);
		System.out.println("Tall1 avrundet til heltall = " + Math.round(tall1));
		System.out.println("Tall1 avrundet til to desimaler = " + Math.round(tall1 * 100) / 100.0);
		System.out.println("Tall1 avrundet til tre desimaler med Precision.round() fra apache.commons.math = " + Precision.round(tall1,3));
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println("Tall1 avrundet til to desimaler med DecimalFormat : " + df.format(tall1));

		// Avrunding med egen-laget metode roud() -- se enderst på siden

		System.out.println("round(2.658213349, 4) = "+ round(2.658213349,4));
		System.out.println("round(17.1783428, 2) = "+ round(17.1783428,2));


		System.out.println();

		// Potenser og røtter
		
		System.out.println("6 i 3 potens: "+ Math.pow(tall2, 3));
		System.out.println("Kvadratroten av 90: "+ Math.sqrt(90));


		// max og min
		System.out.println("Høyeste tall av "+tall1+" og "+tall2+": "+ Math.max(tall1, tall2));
		System.out.println("Minste tall av "+tall3+" og "+tall2+": "+ Math.min(tall3, tall2));


		// Tilfeldige tall

		// Bruk av Math.random()
		// til å lage tilfeldige desimaltall mellom 0 og 1;

		
		System.out.println("\n5 tilfeldige tall mellom 0 og 1 med Math.random() : ");

		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}

		// Bruk av java.util.Random
		// 10 tilfeldige terningkast
		System.out.println("\n10 tilfeldige terningkast med java.util.Random().nextInt()");
		for (int i = 0; i < 10; i++) {
			System.out.print(new Random().nextInt(6) + 1 + " ");
		}

	} // end main


	// Lag en funksjon for avrunding
	public static double round(double n,int dec)  { 
		return Math.round(n*Math.pow(10,dec))/(double)Math.pow(10,dec); 
	}

}