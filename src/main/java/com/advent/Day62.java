package com.advent;

public class Day62 extends Day61 {
    @Override
    protected Integer checkMarker(String s) {
        for (int i = 0; i < s.length() - 14; i++) {
            long count = s
                    .substring(i, i + 14)
                    .chars()
                    .distinct()
                    .count();

            if (count == 14) {
                return i + Long.valueOf(count).intValue();
            }
        }
        return s.length();
    }
}
