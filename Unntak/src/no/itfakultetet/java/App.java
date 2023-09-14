package no.itfakultetet.java;
public class App {
    public static void main(String[] args) {

        Test test1 = new Test();

        try {
            test1.run(0);
        } catch (IllegalArgumentException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            test1.run(1);
        } catch (IllegalArgumentException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            test1.run("to");
        } catch (IllegalArgumentException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

