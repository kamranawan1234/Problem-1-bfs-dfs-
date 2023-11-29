/**
 * @author Kamran Awan
 * This class is used for the nodes which make up the binary tree.
 */
public class Node <E>
{
    private final E key;
    private Node<E> left, right;

    /**
     * Constructs the node and sets the key, left, and right variables.
     * @param key
     */
    public Node(E key)
    {
        this.key = key;
        left = right = null;
    }

    /**
     * @return key
     */
    public E getKey()
    {
        return key;
    }

    /**
     * @return left node
     */
    public Node<E> getLeft()
    {
        return left;
    }

    /**
     * @return right node
     */
    public Node<E> getRight()
    {
        return right;
    }

    /**
     * Sets the left node
     * @param left the left node
     */
    public void setLeft(Node<E> left)
    {
        this.left = left;
    }

    /**
     * Sets the right node
     * @param right the right node
     */
    public void setRight(Node<E> right)
    {
        this.right = right;
    }
}
