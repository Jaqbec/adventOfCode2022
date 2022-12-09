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

    }
}