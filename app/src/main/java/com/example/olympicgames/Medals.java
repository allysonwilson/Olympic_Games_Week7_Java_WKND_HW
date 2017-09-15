package com.example.olympicgames;

/**
 * Created by allysonwilson on 9/15/17.
 */

public enum Medals {

    GOLD,
    SILVER,
    BRONZE
};

public static void main(String[] args) {
        EnumMap<Medals, Integer> map =
        new EnumMap<Medals, Integer> (Medals.class);

        map.put(Medals.GOLD, 1);
        map.put(Medals.SILVER, 2);
        map.put(Medals.BRONZE, 3);

        System.out.println("Olympic medals: " + map);

        Collection<Integer> values = map.values();

        System.out.println("Collection:" + values);
        }
