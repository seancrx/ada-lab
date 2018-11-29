import java.util.*;

public class Q2 {
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Enter number to push to queue. Enter 'end' to end the input process.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while(!input.equals("end")) {
            int inputInt = Integer.parseInt(input);
            queue.enqueue(inputInt);
            input = scanner.next();
        }
        scanner.close();
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        queue.printQueue();
    }
}