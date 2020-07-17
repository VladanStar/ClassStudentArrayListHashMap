package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studenti = new ArrayList<Student>();
        studenti.add(new Student("Vuk", "Vasic", 1630));
        studenti.add(new Student("Ana", "Rodic", 1565));
        Map<Integer, String> polozeniIspiti = new HashMap<Integer, String>();
        polozeniIspiti.put(1630, "CS111, CS112");
        polozeniIspiti.put(1565, "IT250");

        for (Student s : studenti) {
            System.out.println("Student: " + s);
            System.out.println("Polozeni ispiti:");
            for (Entry<Integer, String> ispit : polozeniIspiti.entrySet()) {
                if (ispit.getKey().equals(s.getIndeks())) {
                    System.out.println(ispit.getValue());
                }
            }
            System.out.println("________________________");
        }

    }
}
