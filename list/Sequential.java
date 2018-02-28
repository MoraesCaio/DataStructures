package list;

/**
 * Created by caiomoraes on 23/02/18.
 */
public class Sequential
{
    private int[] data;
    private int currentSize;
    private int maxSize;

    public Sequential()
    {
        maxSize = 100;
        data = new int[maxSize];
    }

    public Boolean isEmpty()
    {
        return currentSize == 0;
    }

    public Boolean isFull()
    {
        return currentSize == maxSize;
    }

    public int getCurrentSize()
    {
        return currentSize;
    }

    public int getElement(int index)
    {
        if (index < 0 || index >= currentSize)
        {
            return -1;
        }
        return data[index];
    }

    public int getIndex(int value)
    {
        for (int i = 0; i < currentSize; i++)
        {
            if (value == data[i])
            {
                return i;
            }
        }
        return -1;
    }

    public Boolean addElement(int index, int newValue)
    {
        if (isFull() || index > getCurrentSize() || index < 0)
        {
            return false;
        }

        for (int i = getCurrentSize(); i > index; i--)
        {
            data[i] = data[i - 1];
        }

        currentSize++;
        data[index] = newValue;

        return true;
    }

    public int removeElement(int index)
    {
        if (index < 0 || index >= getCurrentSize())
        {
            return -1;
        }

        int value = data[index];
        for (int i = index; i < getCurrentSize() - 1; i++)
        {
            data[i] = data[i + 1];
        }

        currentSize--;
        return value;
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < getCurrentSize(); i++)
        {
            stringBuilder.append(data[i]);
        }

        return stringBuilder.toString();
    }
}