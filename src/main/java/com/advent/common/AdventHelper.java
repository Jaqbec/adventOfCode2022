package com.advent.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class AdventHelper {

    public List<String> readFileLines(String fileName) {
        BufferedReader stringBuffer;
        try {
            URL filePath =
                    getClass()
                            .getClassLoader()
                            .getResource(fileName);
            stringBuffer = new BufferedReader(new FileReader(filePath.getFile()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return stringBuffer
                .lines()
                .collect(Collectors.toList());
    }
}
