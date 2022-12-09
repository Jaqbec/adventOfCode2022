package com.advent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day32 {

    private static Integer getPriority(List<String> strings) {
        Character duplicatedItem = getDuplicatedItem(strings);
        return Character.isUpperCase(duplicatedItem) ? duplicatedItem - 38 : duplicatedItem - 96;
    }

    private static Character getDuplicatedItem(List<String> strings) {
        for (char itemInFirstCompartment : strings.get(0).toCharArray()) {
            if (strings.get(1).contains(String.valueOf(itemInFirstCompartment)) &&
                    strings.get(2).contains(String.valueOf(itemInFirstCompartment))) {
                return itemInFirstCompartment;
            }
        }
        return 0;
    }

    public Integer getSumOfPrioritiesOfDuplicatedItems(List<String> lineList) {
        return IntStream
                .range(0, lineList.size())
                .boxed()
                .collect(
                        Collectors.groupingBy(partition -> partition / 3, Collectors.mapping(lineList::get, Collectors.toList()))
                )
                .values()
                .stream()
                .map(Day32::getPriority)
                .reduce(Integer::sum)
                .get();
    }
}
