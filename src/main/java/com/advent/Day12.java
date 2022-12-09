package com.advent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day12 {

    private static List<Integer> getSortedElfsReults(List<String> readLines) {
        List<Integer> caloriesPerElfList = new ArrayList<>();
        int caloriesPerElf = 0;
        for (String line : readLines) {
            if (!line.isEmpty()) {
                caloriesPerElf += Integer.parseInt(line);
            } else {
                caloriesPerElfList.add(caloriesPerElf);
                caloriesPerElf = 0;
            }
        }
        caloriesPerElfList.sort(Comparator.reverseOrder());
        return caloriesPerElfList;
    }

    public Integer getCaloriesCarriedByTopThreeElfs(List<String> readLines) {
        return getSortedElfsReults(readLines)
                .stream()
                .limit(3)
                .reduce(Integer::sum)
                .get();
    }
}
