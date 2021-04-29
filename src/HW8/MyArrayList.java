package HW8;

import java.util.Arrays;

public class MyArrayList <T> implements Methods <T>
{
    //private T[] values;
    private int size = 10;
    int point = 0;
    Object[] array = new Object[size];
    int point1 = 5;

    @Override
    public void add(Object value)
    {
        if (point == array.length-1)
        {
            resize(array.length);
            array[point++] = value;
        }
    }

    private void resize(int i)
    {
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public void remove(int index)
    {
        for (int i = index; i < point; i++)
        {
            array[i] = array[i + 1];
            array[point] = null;
            point--;

            if (array.length > size && point < array.length / point1)
            {
                resize(array.length/2);
            }
        }
    }

    @Override
    public void clear()
    {
        for (int i = 0; i<point; i++)
            array[i] = null;
        size = 0;
    }

    @Override
    public int size()
    {
        return point;
    }

    @Override
    public T get(int index)
    {
        return (T) array[index];
    }

    @Override
    public String toString() {
        return "MyArrayList" + Arrays.toString(array);
    }
}
