public class Queue {

    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        rear.next = null;
    }

    public int dequeue() {
        Node tempNode = front;
        if(!isEmpty()) {
            front = front.next;
            if(front == null) {
                rear = null;
            }
        }
        return tempNode.data;
    }

    public void printQueue() {
        if(!isEmpty()) {
            Node tempNode = front;
            System.out.println("Queue output: ");
            while(tempNode != null) {
                System.out.print(tempNode.data + "   ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }
}