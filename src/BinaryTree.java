import java.util.Objects;

public class BinaryTree {
    static Node root;
    BinaryTree(int key){
        root = new Node(key);
    }
    BinaryTree(){
        root = null;
    }
    public  static void printTree(Node root){
        if(root != null){
            printTree(root.left);
            System.out.print(root.key + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        //System.out.println(tree);
        System.out.println("Inorder Traversal: ");
        printTree(root);

    }
}
