public class Stack {

    private Node head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {
        Node tempNode = head;
        head = head.next;
        return tempNode.data;
    }

    public void printStack() {
        if(!isEmpty()) {
            Node tempNode = head;
            System.out.println("Stack output: ");
            while(tempNode != null) {
                System.out.print(tempNode.data + "   ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }
}