package com.advent;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class Day51 {
    private static List<List<String>> getParameters(List<String> fileLines) {
        return fileLines
                .stream()
                .map(s -> Stream.of(s.split(" "))
                        .filter(Day51::isNumeric)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String getTopContainersAfterOperation(List<String> containersList) {
        return containersList
                .stream()
                .map(s -> s.substring(s.length() - 1))
                .reduce((s, s2) -> s + s2)
                .get();
    }

    private static void moveContainers(List<String> strings, List<String> containersList) {
        int howManyContainersToMove = parseInt(strings.get(0));
        int indexOfFromContainer = parseInt(strings.get(1)) - 1;
        int indexOfToContainers = parseInt(strings.get(2)) - 1;

        String from = containersList.get(indexOfFromContainer);
        String to = containersList.get(indexOfToContainers);

        String newFrom = from.substring(0, from.length() - howManyContainersToMove);
        StringBuilder stringBuilder = new StringBuilder(from.substring(from.length() - howManyContainersToMove));
        String newTo = to + stringBuilder.reverse();

        containersList.set(indexOfFromContainer, newFrom);
        containersList.set(indexOfToContainers, newTo);
    }

    public String getTopContainers(List<String> fileLines) {
        LinkedList<String> containersList = new LinkedList<>();
        containersList.add("DLVTMHF");
        containersList.add("HQGJCTNP");
        containersList.add("RSDMPH");
        containersList.add("LBVF");
        containersList.add("NHGLQ");
        containersList.add("WBDGRMP");
        containersList.add("GMNRCHLQ");
        containersList.add("CLW");
        containersList.add("RDLQJZMT");

        List<List<String>> movementParameters = getParameters(fileLines);

        movementParameters.forEach(strings -> moveContainers(strings, containersList));

        return getTopContainersAfterOperation(containersList);
    }
}
