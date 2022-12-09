package com.advent;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Day52 extends Day51 {

    @Override
    protected void moveContainers(List<String> strings, List<String> containersList) {
        int howManyContainersToMove = parseInt(strings.get(0));
        int indexOfFromContainer = parseInt(strings.get(1)) - 1;
        int indexOfToContainers = parseInt(strings.get(2)) - 1;

        String from = containersList.get(indexOfFromContainer);
        String to = containersList.get(indexOfToContainers);

        String newFrom = from.substring(0, from.length() - howManyContainersToMove);
        String newTo = to + from.substring(from.length() - howManyContainersToMove);

        containersList.set(indexOfFromContainer, newFrom);
        containersList.set(indexOfToContainers, newTo);
    }
}
