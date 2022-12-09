package com.advent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day21 {
    //          Opponent    Player  Pt      Pt      Draw    Pt      Pt      Won     Pt      Pt
    //                              for     for             for     for             for     for
    //                              result  figure          result  figure          result  figure
    // Rock     A           X       3       1       Y       6       2       Z       0       3
    // Paper    B           X       0       1       Y       3       2       Z       6       3
    // Scissors C           X       6       1       Y       0       2       Z       3       3

    private static Integer applyPoints(String line) {
        String[] s = line.split(" ");

        Map<String, Integer> valuesForRock = new HashMap<>();
        valuesForRock.put("X", 4);
        valuesForRock.put("Y", 8);
        valuesForRock.put("Z", 3);

        Map<String, Integer> valuesForPaper = new HashMap<>();
        valuesForPaper.put("X", 1);
        valuesForPaper.put("Y", 5);
        valuesForPaper.put("Z", 9);

        Map<String, Integer> valuesForScissors = new HashMap<>();
        valuesForScissors.put("X", 7);
        valuesForScissors.put("Y", 2);
        valuesForScissors.put("Z", 6);

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


    public Integer getRockPaperScizzorsStrategyResult(List<String> readLines) {
        return readLines
                .stream()
                .map(Day21::applyPoints)
                .reduce(Integer::sum)
                .get();
    }
}
