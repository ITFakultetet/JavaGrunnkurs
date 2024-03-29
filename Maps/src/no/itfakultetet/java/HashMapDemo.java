package no.itfakultetet.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(6, "Nummer 6");
		map1.put(1, "Nummer 1");
		map1.put(11, "Nummer 11");
		map1.put(3, "Nummer 3");
		map1.put(2, "Nummer 2");
		map1.put(12, "Nummer 12");

		// Hent verdien til nøkkel 2
		System.out.println("Verdien til nøkkel 2 er: " + map1.get(2));

		// Print ut toString() for map1
		System.out.println("\nDette er verdien til map.toString():\n" + map1);

		// Print ut et linjeskift
		System.out.println();

		// Gammel måte å bla gjennom en map på
		System.out.println("Gammel måte å bla gjennom en map på");

		for (int key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}

		// Ny, enklere måte å bla gjennom en map på med lambda-funksjon
		System.out.println("\nNy, enklere måte å bla gjennom en map på med stream api:");

		map1.entrySet().forEach(System.out::println);

		// Eller med formatering
		System.out.println("\nPrint ut map med formatering via lambda-funksjon:\n");

		map1.forEach((k, v) -> System.out.println("Nøkkel: " + k + " har verdien: " + v));

		System.out.println();
		// Filtrer ut verdier med stream() og filter()
		System.out.println("Bruk stream() og filter() til å printe ut nøkkel/verdi-par med verdi som inneholder \"6\" ");
		map1.entrySet().stream().filter(a -> a.getValue().contains("6")).forEach(System.out::println);

		System.out.println();


		// Sortere en Map etter nøkkel og printe ut:
		System.out.println("Sortere en Map etter nøkkel og printe ut");
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		// Sortere en Map etter verdi og printe ut:
		System.out.println("Sortere en Map etter verdi og printe ut");
		map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
