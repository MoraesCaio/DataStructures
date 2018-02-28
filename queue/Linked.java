package queue;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class Linked
{
    private Node head; //modified
    private Node tail; //modified
    private int size;

    public Linked()
    {
    }

    public Boolean isEmpty()
    {
        return size == 0;
    }

    public int getSize()
    {
        return size;
    }

    public int first()
    {
        if (isEmpty()) return -1;

        return head.getData();
    }

    public Boolean insert(int value)
    {
        Node node = new Node();
        node.setData(value);
        node.setNext(null);

        if (isEmpty())
        {
            head = node;
        }
        else
        {
            tail.setNext(node);
        }

        tail = node;
        size++;
        return true;
    }

    public int remove()
    {
        if (isEmpty()) return -1;

        int value = first();
        if (size == 1)
        {
            tail = null;
        }
        head = head.getNext();

        size--;
        return value;
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null)
        {
            stringBuilder.append(node.getData());
            stringBuilder.append(" ");
            node = node.getNext();
        }
        return stringBuilder.toString();
    }

    class Node
    {
        private int data;
        private Node next;

        Node()
        {
        }

        int getData()
        {
            return data;
        }

        void setData(int data)
        {
            this.data = data;
        }

        Node getNext()
        {
            return next;
        }

        void setNext(Node next)
        {
            this.next = next;
        }
    }
}
