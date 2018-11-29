import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        // Ask for user input and enqueue them
        System.out.println("Enter number to push to queue. Enter 'end' to end the input process.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while(!input.equals("end")) {
            int inputInt = Integer.parseInt(input);
            queue.enqueue(inputInt);
            input = scanner.next();
        }
        scanner.close();

        queue.printQueue();

        // Move from queue to stack
        while(!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        stack.printStack();
    }
}