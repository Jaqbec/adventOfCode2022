package com.advent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Day42 {

    private static Long getPriority(List<String[]> strings) {
        return strings
                .stream()
                .filter(Day42::processPairOfElfes)
                .count();
    }

    private static boolean processPairOfElfes(String[] pairsOfElfs) {
        List<Integer> range1 = getRange(pairsOfElfs[0]);
        List<Integer> range2 = getRange(pairsOfElfs[1]);
        return isOverlapping(range1, range2);
    }

    private static List<Integer> getRange(String pairsOfElfs) {
        return Arrays
                .stream(pairsOfElfs.split("-"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    private static boolean isOverlapping(List<Integer> range1, List<Integer> range2) {
        return max(range1.get(0), range2.get(0)) <= min(range1.get(1), range2.get(1));
    }

    public Long getAmountOfDuplicatedPairs(List<String> lineList) {
        return new ArrayList<>(LongStream
                .range(0, lineList.size())
                .boxed()
                .collect(
                        Collectors.groupingBy(partition -> partition, Collectors.mapping(aLong -> lineList.get(aLong.intValue()).split(","), Collectors.toList()))
                )
                .values())
                .stream()
                .map(Day42::getPriority)
                .reduce(Long::sum)
                .get();
    }
}
