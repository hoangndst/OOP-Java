package com.example.week10;

import java.util.List;

public class Week11 {

    /**
     * Sort the given list of different types of data.
     * @param <T> the type of data to sort
     * @param list the list of data to sort
     * @return the sorted list
     */

    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        T swap;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    swap = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, swap);
                }
            }
        }
        return list;
    }
}
