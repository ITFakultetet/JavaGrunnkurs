package no.itfakultetet.java;

public class Test {
	
    public void run(int i) throws IllegalArgumentException {
        // Test at argumentet er lik 0, hvis ikke gi feilmelding
        if (i == 0) {
            System.out.println("Testen var vellykket!");
        } else {
            throw new IllegalArgumentException("Testen feilet fordi parameteret var tallet " + i + " og ikke tallet 0");
        }
    }
    public void run(String i) throws IllegalArgumentException {
        // Test at argumentet er lik 0, hvis ikke gi feilmelding
        if (i == "0") {
            System.out.println("Testen var vellykket!");
        } else {
            throw new IllegalArgumentException("Testen feilet fordi parameteret var teksten \"" + i + "\" og ikke tallet 0");
        }
    }
}
