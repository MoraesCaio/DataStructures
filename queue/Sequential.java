package queue;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class Sequential
{
    private final static int MAX_SIZE = 100;
    private int data[];
    private int head;
    private int tail;
    private int size;

    public Sequential()
    {
        data = new int[MAX_SIZE];
        size = 0;
        head = 0;
        tail = -1;
    }

    public Boolean isEmpty()
    {
        return size == 0;
    }

    public Boolean isFull()
    {
        return size == MAX_SIZE;
    }

    public int getSize()
    {
        return size;
    }

    public int first()
    {
        return isEmpty()? -1 : data[head];
    }

    public Boolean insert(int value)
    {
        if (isFull()) return false;

        tail = (tail + 1) % MAX_SIZE;
        data[tail] = value;

        size++;
        return true;
    }

    public int remove()
    {
        if (isEmpty()) return -1;

        int value = head;
        head = (head + 1) % MAX_SIZE;

        size--;
        return value;
    }
}
