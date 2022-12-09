package com.advent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Day31 {

    public  Integer getSumOfPrioritiesOfDuplicatedItems(List<String> lineList) {
        return lineList
                .stream()
                .map(line ->
                        new String[]{line.substring(0, line.length() / 2), line.substring(line.length() / 2)})
                .map(Day31::getPriority)
                .filter(integer -> integer > 0)
                .reduce(Integer::sum)
                .get();
    }

    private static Integer getPriority(String[] strings) {
        Character duplicatedItem = getDuplicatedItem(strings);
        return Character.isUpperCase(duplicatedItem) ? duplicatedItem - 38 : duplicatedItem - 96;
    }

    private static Character getDuplicatedItem(String[] strings) {
        for (char itemInFirstCompartment : strings[0].toCharArray()) {
            for (char itemInSecondCompartment : strings[1].toCharArray()) {
                if (itemInFirstCompartment == itemInSecondCompartment) {
                    return itemInFirstCompartment;
                }
            }
        }
        return 0;
    }
}
