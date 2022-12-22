package com.advent;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.List;

public class Day71 {
    public Long getSumOfDirectoriesWithContentsLessThan100000(List<String> readFileLines) {
        Document root = getNodeStructure(readFileLines);
        return getSumFromNodeStructure(root);
    }

    private Document getNodeStructure(List<String> readFileLines) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            Document document = docFactory.newDocumentBuilder().newDocument();
            readFileLines.forEach(readFileLine -> appendElement(readFileLine, document));
            return document;
        } catch (ParserConfigurationException e) {
            return null;
        }
    }

    private void appendElement(String readFileLine, Document document) {
        String[] command = readFileLine.split(" ");
        if (command[0].equals("$")) {
            if (command[1].equals("cd")) {
                if (command[2].equals("/")) {
                    Element rootElement = document.createElement("rootElement");
                    rootElement.setAttribute("path", "/");
                    document.appendChild(rootElement);
                }
            }
        }

    }

    private Long getSumFromNodeStructure(Node root) {
        return 1l;
    }
}
