/**
 * @author Kamran Awan
 * This class is used for creating the binary tree by accessing the root node.
 */
public class BinaryTree<E>
{
    private Node<E> root;

    /**
     * Sets the root to null.
     */
    BinaryTree()
    {
        root = null;
    }

    /**
     * @return root
     */
    public Node<E> getRoot()
    {
        return root;
    }

    /**
     * Sets the root.
     * @param root the root in the binary tree
     */
    public void setRoot(Node<E> root)
    {
        this.root = root;
    }
}