package no.itfakultetet;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Tast inn et ord");
        Scanner input = new Scanner(System.in);
        String ord = input.next();
        int start=0;
        int end = ord.length()-1;

        for (int i = 0; i < ord.length(); i++) {
            if (ord.charAt(start) != ord.charAt(end)) {
                System.out.println(ord+" er ikke et palindrom");
                System.exit(0);
            }

         start++;
         end--;
        }

        System.out.println(ord+" er et palindrom");

    }

}
