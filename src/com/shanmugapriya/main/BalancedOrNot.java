package com.shanmugapriya.main;

import java.util.Stack;

/**
 * Created by shanmugapriya on 21/3/18.
 */
    public class BalancedOrNot {

    public static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] results = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            results[i] = balancedOrNotLogic(expressions[i], maxReplacements[i]);
        }
        return results;
    }

    private static int balancedOrNotLogic(String expression, int maxReplacements) {
        Stack<Character> expressionStack = new Stack<>();
        char exp[] = expression.toCharArray();
        for (char ch : exp) {
            if (ch == '<') {
                expressionStack.push('<');
            } else {
                if (expressionStack.size() > 0 && expressionStack.peek() == '<') {
                    expressionStack.pop();
                } else {
                    maxReplacements--;
                }
            }
        }
        if (expressionStack.size() == 0 && maxReplacements >= 0)
            return 1;
        else
            return 0;
    }
}