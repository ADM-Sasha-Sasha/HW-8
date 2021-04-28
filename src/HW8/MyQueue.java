package HW8;

import java.util.Arrays;

public class MyQueue <T> implements QueueList
{
    private int size = 0;
    private int capacity = 10;
    private Object[] queueArr;

    public MyQueue()
    {
        queueArr = new Object[capacity];
        size = 0;
    }
    @Override
    public void add(Object value)
    {
        if (value == null)
        {
            throw new NullPointerException();
        }
        if (size >= queueArr.length)
        {
            upQueue();
        }
        queueArr[size++] = value;
    }

    private void upQueue()
    {
        int newCapacity = queueArr.length + 1;
        queueArr = Arrays.copyOf(queueArr, newCapacity);
    }

    @Override
    public Object remove(int index)
    {
        for (int i = index; i < size; i++)
        {
            queueArr[i] = queueArr[i+1];
        }
        queueArr[size--] = null;
        return null;
    }

    @Override
    public void clear()
    {
        for (int i = 0; i < size; i++)
        {
            queueArr[i] = null;
        }
        size = 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public Object peek()
    {
        return (T) queueArr[0];
    }

    @Override
    public Object poll()
    {
        return remove(0);
    }

    @Override
    public String toString() {
        return "MyQueue" + Arrays.toString(queueArr);
    }
}
