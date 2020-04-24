package no.itfakultetet.java;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException, ParseException {


        Map<String, Integer> dyr = Map.of("Dagros", 10, "Litago", 4);
        System.out.println(dyr.getClass());

        dyr.forEach((k, v) -> System.out.println(k + " er " + v + " år gammel"));


        Map<String, Integer> dyr2 = new HashMap<>();

        System.out.println(dyr2.getClass());

        dyr2.putAll(dyr);
        dyr2.put("Pan", 3);

        dyr2.forEach((k, v) -> System.out.println(k + " er " + v + " år gammel"));


        Ansatt helge = new Ansatt("Helge Pettersen", 28, "M");
        Ansatt olga = new Ansatt("Olga Olsen", 37, "K");
        Ansatt hans = new Ansatt("Hans Pettersen", 34, "M");

        System.out.println(helge.getNavn());
        System.out.println(olga);

        Map<Integer, Ansatt> ansatte = Map.of(1, helge, 2, olga, 3, hans);

        Map<Integer, Ansatt> ansatte_original = new LinkedHashMap<>();
        ansatte_original.put(2, olga);
        ansatte_original.put(1, helge);
        ansatte_original.put(3, hans);

        Map<Integer, Ansatt> ansatte_sortert = new TreeMap<>();
        ansatte_sortert.putAll(ansatte);

        System.out.println("Sortert etter nøkkel");
        ansatte.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((k) -> System.out.println("ID: " + k.getKey() + " Navn: " + k.getValue().getNavn()));

        System.out.println("Sortert etter navn");
        ansatte.entrySet().stream().sorted(Map.Entry.comparingByValue((a, b) -> a.getNavn().compareTo(b.getNavn()))).forEach((k) -> System.out.println("ID: " + k.getKey() + " Navn: " + k.getValue().getNavn()));

        System.out.println("Sortert etter alder");
        ansatte.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Ansatt::getAlder))).forEach((k) -> System.out.println("ID: " + k.getKey() + " Navn: " + k.getValue().getNavn() + " Alder: " + k.getValue().getAlder()));


        // ansatte_original.forEach((k,v)-> System.out.println("ID: "+k+" Navn: "+v.getNavn() ));
        System.out.println("Sortert etter nøkkel med TreeMap");
        ansatte_sortert.forEach((k, v) -> System.out.println("ID: " + k + " Navn: " + v.getNavn()));

        FileWriter utfilCSV = new FileWriter("ansatte.csv");
        FileWriter utfilJSON = new FileWriter("ansatte.json");


        JSONArray ansattListeJSON = new JSONArray();
        for (Map.Entry e : ansatte_sortert.entrySet()) {
            JSONObject ansatt_json = new JSONObject();

            Ansatt a = (Ansatt) e.getValue();
            utfilCSV.append("\"" + a.getNavn() + "\"," + a.getAlder() + ",\"" + a.getKjønn() + "\"\n");
            ansatt_json.put("Navn", a.getNavn());
            ansatt_json.put("Alder", a.getAlder());
            ansatt_json.put("Kjønn", a.getKjønn());

            ansattListeJSON.add(ansatt_json);
            // System.out.println(ansatt_json);
        }

        utfilCSV.flush();
        utfilCSV.close();

        utfilJSON.append(ansattListeJSON.toJSONString());
        utfilJSON.flush();
        utfilJSON.close();

        String jsonText = Files.readString(Paths.get("ansatte.json"));
        System.out.println(jsonText);


        JSONArray arrayet = (JSONArray) new JSONParser().parse(jsonText);

        System.out.println(arrayet.get(1));
    }


}
