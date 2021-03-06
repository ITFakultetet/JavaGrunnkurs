package no.itfakultetet;

public class PrimitiveDataTyper {

	public static void main(String[] args) {

		// De 8 primitive datatypene begynner med liten bokstav 
		
		short minShort = 23;   
		int minInt = 123;
		long minLong = 87634678;
		
		double minDouble = 2.34;
		float minFloat = 3.4f;   // Legg merke til at vi må skrive f etter tallet, hvis ikke tolkes det som en double.
		
		boolean minBoolean = true;
		
		char minChar = 'T';  // Merk: enkle anførselstegn, hvis ikke tolkes det som en tekststreng
		byte minByte = 127;
		
		System.out.println("short: "+minShort);
		System.out.println("int: "+minInt);
		System.out.println("long: "+minLong);
		System.out.println("double: "+minDouble);
		System.out.println("float: "+minFloat);
		System.out.println("boolean: "+minBoolean);
		System.out.println("char: "+minChar);
		System.out.println(minByte);
		
		boolean sant = 5 < 10;
		boolean ikkeSant = 5 > 10;
		
		System.out.println(sant + " " + ikkeSant);
		
	}

}
