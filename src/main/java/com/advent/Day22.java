package com.advent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day22 {
    //          Opponent    Loss    Pt      Pt      Draw    Pt      Pt      Won     Pt      Pt
    //                              for     for             for     for             for     for
    //                              loss    figure          draw    figure          won     figure
    // Rock     A           X       0       3       Y       3       1       Z       6       2
    // Paper    B           X       0       1       Y       3       2       Z       6       3
    // Scissors C           X       0       2       Y       3       3       Z       6       1
    private static Integer applyPoints(String line) {
        String[] s = line.split(" ");

        Map<String, Integer> valuesForRock = new HashMap<>();
        valuesForRock.put("X", 3);
        valuesForRock.put("Y", 4);
        valuesForRock.put("Z", 8);

        Map<String, Integer> valuesForPaper = new HashMap<>();
        valuesForPaper.put("X", 1);
        valuesForPaper.put("Y", 5);
        valuesForPaper.put("Z", 9);

        Map<String, Integer> valuesForScissors = new HashMap<>();
        valuesForScissors.put("X", 2);
        valuesForScissors.put("Y", 6);
        valuesForScissors.put("Z", 7);

        Map<String, Map<String, Integer>> collect = new HashMap<>();
        collect.put("A", valuesForRock);
        collect.put("B", valuesForPaper);
        collect.put("C", valuesForScissors);

        return collect
                .get(s[0])
                .entrySet()
                .stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getKey().equals(s[1]))
                .map(Map.Entry::getValue)
                .findFirst()
                .get();
    }

    public Integer getRockPaperScizzorsStrategyResultForModifiedStrategy(List<String> readLines) {
        return readLines
                .stream()
                .map(Day22::applyPoints)
                .reduce(Integer::sum)
                .get();
    }
}
