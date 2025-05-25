package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> hashSet = new HashSet<>();
        populateSet(hashSet);
        return hashSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        populateSet(treeSet);
        return treeSet;

    }

    public static void populateSet(Set<String> set) {
        set.add("ELEMENT KPRBC");
        set.add("ELEMENT YPBTM");
        set.add("ELEMENT AADXU");
        set.add("ELEMENT RXCGJ");
        set.add("ELEMENT WYMVD");
        set.add("ELEMENT WFGEJ");
        set.add("ELEMENT TYGBS");
        set.add("ELEMENT MAPTK");
        set.add("ELEMENT GJXVE");
        set.add("ELEMENT BAFGL");
    }

    private static void printSet(Set<String> customSet) {
        for(String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        System.out.println("=== HashSet ===");
        Set<String> hashSet = createHashSet();
        printSet(hashSet);
        System.out.println("Añadiendo ELEMENT NEW-HS: " + addElementToSet(hashSet, "ELEMENT NEW-HS"));
        printSet(hashSet);

        System.out.println();

        System.out.println("=== TreeSet ===");
        Set<String> treeSet = createTreeSet();
        printSet(treeSet);
        System.out.println("Añadiendo ELEMENT NEW-TS: " + addElementToSet(treeSet, "ELEMENT NEW-TS"));
        printSet(treeSet);
    }

}
