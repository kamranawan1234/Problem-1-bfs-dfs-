/**
 * @author Kamran Awan
 * The tester class.
 */
public class BinaryTreeTester <E>
{
    /**
     * This method creates 4 trees, prints them using bfs and dfs and finds the values using bfs and dfs traversals.
     */
    public static <E> void main(String[] args)
    {
        Traversals<E> traversals = new Traversals<>();

        System.out.println("Binary tree 1: ");
        BinaryTree<E> tree = new BinaryTree<>();
        tree.setRoot(new Node(1));
        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(3));
        tree.getRoot().getLeft().setLeft(new Node(4));
        tree.getRoot().getLeft().setRight(new Node(5));

        System.out.println("dfs: ");
        traversals.printDfs(tree);
        System.out.println();
        System.out.println("bfs: ");
        traversals.printBfs(tree);
        System.out.println();

        System.out.println("Found 5: " + traversals.findDfs(tree, (E) "5"));
        System.out.println("Found 8: " + traversals.findBfs(tree, (E) "8"));

        System.out.println("Binary tree 2: ");
        BinaryTree<E> tree2 = new BinaryTree<>();
        tree2.setRoot(new Node(3));
        tree2.getRoot().setLeft(new Node(5));
        tree2.getRoot().setRight(new Node(3));
        tree2.getRoot().getRight().setLeft(new Node(7));
        tree2.getRoot().getLeft().setLeft(new Node(2));
        tree2.getRoot().getLeft().setRight(new Node(1));

        System.out.println("dfs: ");
        traversals.printDfs(tree2);
        System.out.println();
        System.out.println("bfs: ");
        traversals.printBfs(tree2);
        System.out.println();

        System.out.println("Found 6: " + traversals.findDfs(tree2, (E) "6"));
        System.out.println("Found 3: " + traversals.findBfs(tree2, (E) "3"));

        System.out.println("Binary tree 3: ");
        BinaryTree<E> tree3 = new BinaryTree<>();
        tree3.setRoot(new Node(8));
        tree3.getRoot().setLeft(new Node(1));
        tree3.getRoot().setRight(new Node(3));
        tree3.getRoot().getLeft().setRight(new Node(7));
        tree3.getRoot().getLeft().getRight().setLeft(new Node(7));

        System.out.println("dfs: ");
        traversals.printDfs(tree3);
        System.out.println();
        System.out.println("bfs: ");
        traversals.printBfs(tree3);
        System.out.println();

        System.out.println("Found 7: " + traversals.findDfs(tree3, (E) "7"));
        System.out.println("Found 8: " + traversals.findBfs(tree3, (E) "8"));

        System.out.println("Binary tree 4: ");
        BinaryTree<E> tree4 = new BinaryTree<>();
        tree4.setRoot(new Node(2));

        System.out.println("dfs: ");
        traversals.printDfs(tree4);
        System.out.println();
        System.out.println("bfs: ");
        traversals.printBfs(tree4);
        System.out.println();

        System.out.println("Found 1: " + traversals.findDfs(tree4, (E) "1"));
        System.out.println("Found 3: " + traversals.findBfs(tree4, (E) "3"));
    }
}
