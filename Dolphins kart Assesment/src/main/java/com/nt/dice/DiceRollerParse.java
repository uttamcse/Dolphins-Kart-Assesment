package com.nt.dice;


import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DiceRollerParse {
    private static final Random RANDOM = new Random();

    public static DiceRollerResult evaluateExpression(String expression) {
        int rollResult = 0;
        int minResult = 0;
        int maxResult = 0;

        Pattern pattern = Pattern.compile("([+-]?\\d*)d(\\d+)|([+-]?\\d+)");
        Matcher matcher = pattern.matcher(expression);

        while (matcher.find()) {
            if (matcher.group(1) != null && matcher.group(2) != null) {
                // Handling dice rolls e.g., "3d6" or "d8"
                int count = matcher.group(1).isEmpty() || matcher.group(1).equals("+") ? 1 : Integer.parseInt(matcher.group(1));
                if (matcher.group(1).equals("-")) count = -1;
                int sides = Integer.parseInt(matcher.group(2));
                int rollSum = rollDice(count, sides);

                rollResult += rollSum;
                minResult += Math.min(count, 0) * sides + Math.max(count, 0);
                maxResult += Math.max(count, 0) * sides + Math.min(count, 0);
            } else if (matcher.group(3) != null) {
                // Handling raw integers e.g., "+4" or "-1"
                int value = Integer.parseInt(matcher.group(3));
                rollResult += value;
                minResult += value;
                maxResult += value;
            }
        }

        return new DiceRollerResult(rollResult, minResult, maxResult);
    }

    private static int rollDice(int count, int sides) {
        int sum = 0;
        for (int i = 0; i < Math.abs(count); i++) {
            sum += count > 0 ? RANDOM.nextInt(sides) + 1 : -(RANDOM.nextInt(sides) + 1);
        }
        return sum;
    }
}
