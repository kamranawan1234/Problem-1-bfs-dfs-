import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Kamran Awan
 * This class uses the bfs and dfs traversals to print and find the values in the binary tree.
 */
public class Traversals<E>
{
    /**
     * This uses stacks to print all the values in the binary tree using a dfs traversal.
     * @param binaryTree The binary tree
     */
    public void printDfs(BinaryTree<E> binaryTree)
    {
        Stack<Node<E>> stack = new Stack<>();
        Node<E> current = binaryTree.getRoot();
        stack.push(current);
        while (!stack.isEmpty())
        {
            current = stack.pop();
            System.out.print(current.getKey() + " ");

            if (current.getRight() != null)
            {
                stack.push(current.getRight());
            }
            if (current.getLeft() != null)
            {
                stack.push(current.getLeft());
            }
        }
    }

    /**
     * This uses queues to print all the values in the binary tree using a bfs traversal.
     * @param binaryTree The binary tree
     */
    public void printBfs(BinaryTree<E> binaryTree)
    {
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(binaryTree.getRoot());
        while (!queue.isEmpty())
        {
            Node<E> current = queue.poll();
            System.out.print(current.getKey() + " ");

            if (current.getLeft() != null)
            {
                queue.add(current.getLeft());
            }

            if (current.getRight() != null)
            {
                queue.add(current.getRight());
            }
        }
    }

    /**
     * This uses a dfs traversal and a stack to find the value specified in the binary map.
     * @param binaryTree the binary tree
     * @param searchTarget the search target
     * @return true if found the value, false otherwise
     */
    public boolean findDfs(BinaryTree<E> binaryTree, E searchTarget)
    {
        Stack<Node<E>> stack = new Stack<>();
        Node<E> current = binaryTree.getRoot();
        stack.push(current);
        while (!stack.isEmpty())
        {

            current = stack.pop();
            if (current.getKey().toString().equals(searchTarget))
            {
                return true;
            }

            if (current.getRight() != null)
            {
                stack.push(current.getRight());
            }
            if (current.getLeft() != null)
            {
                stack.push(current.getLeft());
            }
        }
        return false;
    }

    /**
     * This uses a bfs traversal and a queue to find the value specified in the binary map.
     * @param binaryTree the binary tree
     * @param searchTarget the search target
     * @return true if found the value, false otherwise
     */
    public boolean findBfs(BinaryTree<E> binaryTree, E searchTarget)
    {
        Queue<Node<E>> queue = new LinkedList<>();
        queue.add(binaryTree.getRoot());
        while (!queue.isEmpty())
        {
            Node<E> current = queue.poll();
            if (current.getKey().toString().equals(searchTarget))
            {
                return true;
            }

            if (current.getLeft() != null)
            {
                queue.add(current.getLeft());
            }

            if (current.getRight() != null)
            {
                queue.add(current.getRight());
            }
        }
        return false;
    }
}