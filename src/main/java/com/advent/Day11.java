package com.advent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day11 {

    public Integer getMaxNumberofCaloriesCarriedByElf(List<String> readLines) {
        return getResultsForTopThreeElfs(readLines)
                .stream()
                .max(Comparator.comparing(Integer::valueOf))
                .orElseThrow();
    }

    private static List<Integer> getResultsForTopThreeElfs(List<String> stringList) {
        List<Integer> caloriesPerElfList = new ArrayList<>();
        int caloriesPerElf = 0;
        for (String line : stringList) {
            if (!line.isEmpty()) {
                caloriesPerElf += Integer.parseInt(line);
            } else {
                caloriesPerElfList.add(caloriesPerElf);
                caloriesPerElf = 0;
            }
        }
        return caloriesPerElfList;
    }
}
