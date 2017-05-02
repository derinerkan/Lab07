import java.util.Scanner;
/**
 * Postfix Calculator for Lab07
 * @author Derin Erkan
 * @version 2017-05-02
 */
public class PostfixCalculator
{
    static SimpleStack stack;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stack = new SimpleStack();

        while (true) {
            String raw = scan.next();
            for (char c : raw.toCharArray()) {
                if(Character.isDigit(c))
                {
                    stack.push(Character.toString(c));
                }
                else calculate(c);
            }
            System.out.println(stack.pop());
        }
    }

    /**
     * Do the actual calculation
     * @param c the operator
     */
    public static void calculate(char c)
    {
        boolean error = false;
        int operand1 = 0;
        int operand2 = 0;

        if(!stack.isEmpty()) operand1 = Integer.parseInt(stack.pop());
        else error = true;

        if(!stack.isEmpty()) operand2 = Integer.parseInt(stack.pop());
        else error = true;

        if(!error)
        {
            if(c == '+') stack.push(Integer.toString(operand1 + operand2));
            else if(c == '-') stack.push(Integer.toString(operand1 - operand2));
            else if(c == '*') stack.push(Integer.toString(operand1 * operand2));
            else if(c == '/') stack.push(Integer.toString(operand1 / operand2));
        }
        else System.err.println("Too little operands!");
    }
}
