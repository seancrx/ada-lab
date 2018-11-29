public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insert(data, root.left);
        } else if (data > root.data) {
            root.right = insert(data, root.right);
        }
    }

    public Node insert(int data, Node node) {
        if (node == null) {
            Node newNode = new Node(data);
            return newNode;
        } else if (data < node.data) {
            node.left = insert(data, node.left);
        } else if (data > node.data) {
            node.right = insert(data, node.right);
        }
        return node;
    }

    public Node findNode(int data) {
        if (root == null) {
            return null;
        } else if (data == root.data) {
            return root;
        } else if (data < root.data) {
            return findNode(data, root.left);
        } else {
            return findNode(data, root.right);
        }
    }

    public Node findNode(int data, Node node) {
        if (node == null) {
            return null;
        } else if (data == node.data) {
            return node;
        } else if (data < node.data) {
            return findNode(data, node.left);
        } else {
            return findNode(data, node.right);
        }
    }

    public void printPreorder() {
        System.out.print("Preorder Traversal:   ");
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data+ "  ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void printInorder() {
        System.out.print("Preorder Traversal:   ");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data+ "  ");
            inorder(node.right);
        }
    }

    public void printReverse() {
        System.out.print("Preorder Traversal:   ");
        reserve(root);
        System.out.println();
    }

    private void reserve(Node node) {
        if (node != null) {
            reserve(node.right);
            System.out.print(node.data+ "  ");
            reserve(node.left);
        }
    }

    public void printPostorder() {
        System.out.print("Preorder Traversal:   ");
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data+ "  ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(12);
        tree.insert(2);
        tree.insert(11);
        tree.insert(8);
        tree.insert(6);
        tree.printInorder();
        tree.printPreorder();
        tree.printPostorder();
        tree.printReverse();
    }
}