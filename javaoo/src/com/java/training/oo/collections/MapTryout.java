package com.java.training.oo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTryout {

    public static void main(final String[] args) {
        List<String> sListLoc = new ArrayList<>();
        sListLoc.add("istanbul");
        sListLoc.add("adana");
        sListLoc.add("ankara");
        for (String stringLoc : sListLoc) {
            System.out.println(stringLoc);
        }
        System.out.println("------------------");
        for (int iLoc = 0; iLoc < sListLoc.size(); iLoc++) {
            System.out.println(sListLoc.get(iLoc));
        }

        System.out.println("------------------");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("34",
                      "Istanbul");
        stringMap.put("01",
                      "Adana");
        stringMap.put("06",
                      "Ankara");
        stringMap.put("55",
                      "Test");

        System.out.println(stringMap.get("06"));

        System.out.println("------------------");
        Set<String> keySetLoc = stringMap.keySet();
        for (String keyLoc : keySetLoc) {
            System.out.println(keyLoc + " - " + stringMap.get(keyLoc));
        }
        System.out.println("------------------");
        Collection<String> valuesLoc = stringMap.values();
        for (String valueLoc : valuesLoc) {
            System.out.println("Value : " + valueLoc);
        }
        System.out.println("------------------");
        Set<Entry<String, String>> entrySetLoc = stringMap.entrySet();
        for (Entry<String, String> entryLoc : entrySetLoc) {
            System.out.println(entryLoc.getKey() + " - " + entryLoc.getValue());
        }

    }
}
