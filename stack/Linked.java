package stack;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class Linked
{
    private Node top;
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

    public int topElement()
    {
        return isEmpty()? -1 : top.getData();
    }

    public Boolean push(int value)
    {
        Node aux = new Node();
        aux.setData(value);
        aux.setNext(top);

        top = aux;

        size++;
        return true;
    }

    public int pop()
    {
        if (isEmpty()) return -1;

        int value = top.getData();
        top = top.next;

        size--;
        return value;
    }

    class Node
    {
        private int data;
        private Node next;

        public Node()
        {
        }

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }
}
