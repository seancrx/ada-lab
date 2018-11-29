import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Enter number to push to stack. Enter 'end' to end the input process.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while(!input.equals("end")) {
            int inputInt = Integer.parseInt(input);
            stack.push(inputInt);
            input = scanner.next();
        }
        scanner.close();
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.pop());
        stack.printStack();
    }
}