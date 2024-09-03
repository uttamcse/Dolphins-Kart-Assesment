package com.nt.dice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class DiceRoller {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java DiceRoller <inputFile> [<outputFile>]");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args.length > 1 ? args[1] : null;

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));
            List<DiceRollerResult> results = lines.stream()
                    .map(DiceRollerParse::evaluateExpression)
                    .toList();

            if (outputFile != null) {
                try (FileWriter fileWriter = new FileWriter(outputFile)) {
                    for (DiceRollerResult result : results) {
                        fileWriter.write(OBJECT_MAPPER.writeValueAsString(result) + System.lineSeparator());
                    }
                }
            } else {
                for (DiceRollerResult result : results) {
                    System.out.println(OBJECT_MAPPER.writeValueAsString(result));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
