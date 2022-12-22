package com.advent;

import com.advent.common.AdventHelper;

public class Main {
    private static final AdventHelper adventHelper = new AdventHelper();
    private static final Day11 day11 = new Day11();
    private static final Day12 day12 = new Day12();
    private static final Day21 day21 = new Day21();
    private static final Day22 day22 = new Day22();
    private static final Day31 day31 = new Day31();
    private static final Day32 day32 = new Day32();
    private static final Day41 day41 = new Day41();
    private static final Day42 day42 = new Day42();
    private static final Day51 day51 = new Day51();
    private static final Day52 day52 = new Day52();
    private static final Day61 day61 = new Day61();
    private static final Day62 day62 = new Day62();
    private static final Day71 day71 = new Day71();

    public static void main(String[] args) {

        System.out.println("(Day 1 1) Max number of calories is: " +
                day11.getMaxNumberofCaloriesCarriedByElf(adventHelper.readFileLines("caloriesCarriedByElfs.txt")));
        System.out.println("(Day 1 2) Number of calories carried by top 3 elfs is: " +
                day12.getCaloriesCarriedByTopThreeElfs(adventHelper.readFileLines("caloriesCarriedByElfs.txt")));
        System.out.println("(Day 2 1) Result of direct strategy: " +
                day21.getRockPaperScizzorsStrategyResult(adventHelper.readFileLines("rockPaperScissorsStrategy.txt")));
        System.out.println("(Day 2 2) Result of modified strategy: " +
                day22.getRockPaperScizzorsStrategyResultForModifiedStrategy(adventHelper.readFileLines("rockPaperScissorsStrategy.txt")));
        System.out.println("(Day 3 1) Sum of priorities of duplicated items: " +
                day31.getSumOfPrioritiesOfDuplicatedItems(adventHelper.readFileLines("rucksackContents.txt")));
        System.out.println("(Day 3 2) Sum of priorities of duplicated items: " +
                day32.getSumOfPrioritiesOfDuplicatedItems(adventHelper.readFileLines("rucksackContents.txt")));
        System.out.println("(Day 4 1) Sum of priorities of duplicated items: " +
                day41.getAmountOfDuplicatedPairs(adventHelper.readFileLines("pairsOfElfs.txt")));
        System.out.println("(Day 4 2) Sum of priorities of duplicated items: " +
                day42.getAmountOfDuplicatedPairs(adventHelper.readFileLines("pairsOfElfs.txt")));
        System.out.println("(Day 5 1) Top containers After operation: " +
                day51.getTopContainers(adventHelper.readFileLines(10, "crateConfigurationAndMoves.txt")));
        System.out.println("(Day 5 2) Top containers After operation: " +
                day52.getTopContainers(adventHelper.readFileLines(10, "crateConfigurationAndMoves.txt")));
        System.out.println("(Day 6 1) Marker appears after this amount of characters: " +
                day61.getNumberOfCharactersToBeReadBeforeMarker(adventHelper.readFileLines("radioSignal.txt")));
        System.out.println("(Day 6 2) Marker appears after this amount of characters: " +
                day62.getNumberOfCharactersToBeReadBeforeMarker(adventHelper.readFileLines("radioSignal.txt")));
        System.out.println("(Day 7 1) Marker appears after this amount of characters: " +
                day71.getSumOfDirectoriesWithContentsLessThan100000(adventHelper.readFileLines("radioSignal.txt")));
    }
}