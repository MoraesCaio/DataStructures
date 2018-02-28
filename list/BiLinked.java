package list;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class BiLinked
{
    private Node head;
    private Node tail; //modified
    private int size;

    public BiLinked()
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

    public int getElement(int index)
    {
        if (index >= size || index < 0)
        {
            return -1;
        }

        Node node = head;
        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }

        return node.getData();
    }

    public int getIndex(int value)
    {
        if (isEmpty())
        {
            return -1;
        }

        Node node = head;
        for (int i = 0; i < size; i++, node = node.next)
        {
            if (node.getData() == value)
            {
                return i;
            }
        }

        return -1;
    }

    public Boolean addElement(int index, int value)
    {
        if (index < 0 || index > size)
        {
            return false;
        }

        Node node = new Node();
        node.setData(value);

        if (index == 0) /*modified*/
        {
            if (isEmpty())
            {
                tail = node;
            }
            else
            {
                node.setNext(head);
                head.setPrevious(node); //modified
            }

            head = node;
        }
        else if (index == size)
        {
            tail.setNext(node); //modified
            tail = node; //modified
        }
        else
        {
            Node aux = head;
            for (int i = 0; i < index - 1; i++, aux = aux.next)
            {
            }
            node.setNext(aux.next);
            node.setPrevious(aux); //modified
            aux.setNext(node);
        }

        size++;
        return true;
    }

    public int removeElement(int index)
    {
        if (isEmpty() || index >= size)
        {
            return -1;
        }

        int value;
        if (index == 0)
        {
            value = head.getData();
            if (size == 1) //modified
            {
                tail = tail.previous; //null
            }
            head = head.next;
        }
        else
        {
            Node aux = head;
            for (int i = 0; i < index - 1; i++, aux = aux.next)
            {
            }
            value = aux.next.getData();
            aux.setNext(aux.next.next);

            if (aux.next != null) //modified
                aux.next.setPrevious(aux);
        }

        size--;
        return value;
    }

    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;
        for (int i = 0; i < size; i++, node = node.next)
        {
            stringBuilder.append(node.toString());
        }

        return stringBuilder.toString();
    }

    class Node
    {
        private Node previous; //modified
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

        public Node getPrevious() //modified
        {
            return previous;
        }

        public void setPrevious(Node previous) //modified
        {
            this.previous = previous;
        }

        public Node getNext()
        {
            return next;
        }

        void setNext(Node next)
        {
            this.next = next;
        }

        @Override
        public String toString()
        {
            return String.valueOf(data);
        }
    }
}
