package stack;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class Sequential
{
    private int data[];
    private int top;
    private int maxSize;

    public Sequential()
    {
        maxSize = 100;
        data = new int[maxSize];
        top = -1;
    }

    public Boolean isEmpty()
    {
        return top == -1;
    }

    public Boolean isFull()
    {
        return top == maxSize - 1;
    }

    public int getSize()
    {
        return top + 1;
    }

    public int topElement()
    {
        return isEmpty()? -1 : data[top];
    }

    public Boolean push(int value)
    {
        if (isFull()) return false;

        data[top + 1] = value;
        top++;
        return true;
    }

    public int pop()
    {
        if (isEmpty()) return -1;

        int value = data[top];
        top--;
        return value;
    }
}
