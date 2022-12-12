package com.advent;

import java.util.List;

public class Day61 {
    public Integer getNumberOfCharactersToBeReadBeforeMarker(List<String> readLines) {
        return readLines
                .stream()
                .map(this::checkMarker)
                .reduce(Integer::sum)
                .get();
    }

    protected Integer checkMarker(String s) {
        for (int i = 0; i < s.length() - 4; i++) {
            long count = s
                    .substring(i, i + 4)
                    .chars()
                    .distinct()
                    .count();

            if (count == 4) {
                return i + Long.valueOf(count).intValue();
            }
        }
        return s.length();
    }
}
