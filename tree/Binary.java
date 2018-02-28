package tree;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class Binary
{
    private Node node;

    public Binary()
    {
    }

    public Boolean isEmpty()
    {
        return node == null;
    }

    public Node getElement(Node node, int value)
    {
        Node nodeFound;

        if (node == null)
            return null;

        if (node.getData() == value)
        {
            return node;
        }

        nodeFound = getElement(node.left, value);
        if (nodeFound == null)
            nodeFound = getElement(node.right, value);

        return nodeFound;
    }

    public Boolean addElementRoot(int value)
    {
        if (this.node != null)
            return false;

        Node aux = new Node();
        aux.setData(value);

        this.node = aux;
        return true;
    }

    public Boolean addElementLeft(Node currentNode, int rootValue, int leftValue)
    {
        Node leaf = getElement(currentNode, leftValue);
        if (leaf != null)
            return false;

        Node root = getElement(currentNode, rootValue);
        if (root != null)
            return false;
        if (root.left != null)
            return false;

        leaf = new Node();
        leaf.setData(leftValue);
        root.left = leaf;

        return true;
    }

    public Boolean addElementRight(Node currentNode, int rootValue, int rightValue)
    {
        Node leaf = getElement(currentNode, rightValue);
        if (leaf != null)
            return false;

        Node root = getElement(currentNode, rootValue);
        if (root != null)
            return false;
        if (root.right != null)
            return false;

        leaf = new Node();
        leaf.setData(rightValue);
        root.right = leaf;

        return true;
    }

    public void preOrder()
    {
        if (node == null)
            System.out.println("Empty tree.");
        else
            preOrder(node);
    }

    public void inOrder()
    {
        if (node == null)
            System.out.println("Empty tree.");
        else
            inOrder(node);
    }

    public void posOrder()
    {
        if (node == null)
            System.out.println("Empty tree.");
        else
            posOrder(node);
    }

    private void preOrder(Node node)
    {
        if (node == null)
            return;

        System.out.println(node.getData() + " ");
        if (node.left != null)
            preOrder(node.left);

        if (node.right != null)
            preOrder(node.right);
    }

    private void inOrder(Node node)
    {
        if (node == null)
            return;

        if (node.left != null)
        {
            preOrder(node.left);
        }

        System.out.println(node.getData() + " ");

        if (node.right != null)
            preOrder(node.right);
    }

    private void posOrder(Node node)
    {
        if (node == null)
            return;

        if (node.left != null)
        {
            preOrder(node.left);
        }

        if (node.right != null)
        {
            preOrder(node.right);
        }

        System.out.println(node.getData() + " ");
    }

    class Node
    {
        private int data;
        private Node left;
        private Node right;

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public Node getLeft()
        {
            return left;
        }

        public void setLeft(Node left)
        {
            this.left = left;
        }

        public Node getRight()
        {
            return right;
        }

        public void setRight(Node right)
        {
            this.right = right;
        }
    }
}
