/*
 * This algorithm designed for calculate arithmetic expresions.
 * Usage: While the program is running enter arithmetic expresion with these rules:
 * 1 - Enclose each arithmetic expression within parentheses.
 * 2 - Use whitespace between all operations and values include paranthesis.
 */

import java.util.Scanner;
import java.util.Stack;

public class dijkstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        String input = scanner.nextLine();
        // \\s+ -> one or more whitespace
        String[] tokens = input.split("\\s+");

        for (String token : tokens) {
            if (token.equals("("))
                ;
            else if (token.equals("+"))
                ops.push(token);
            else if (token.equals("-"))
                ops.push(token);
            else if (token.equals("*"))
                ops.push(token);
            else if (token.equals("/"))
                ops.push(token);
            else if (token.equals("sqrt"))
                ops.push(token);
            else if (token.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();

                if (op.equals("+"))
                    v = vals.pop() + v;
                else if (op.equals("-"))
                    v = vals.pop() - v;
                else if (op.equals("*"))
                    v = vals.pop() * v;
                else if (op.equals("/"))
                    v = vals.pop() / v;
                else if (op.equals("sqrt"))
                    v = Math.sqrt(v);
                vals.push(v);
            } else
                vals.push(Double.parseDouble(token));
        }
        scanner.close();
        System.out.println(vals.pop());
    }

}