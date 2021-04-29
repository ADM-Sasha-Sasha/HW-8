package HW8;

import java.util.Arrays;

public class MyArrayList <T> implements Methods <T>
{
    //private T[] values;
    private final static int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] array;
    //private int point1 = 5;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }
    public MyArrayList(int capacity)
    {
        clearArray(capacity);
    }

    @Override
    public void add(T value)
    {
        if (size == array.length-1)
        {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
//            resize(array.length*2);
//            array[point++] = value;
        }
        array[size++] = value;
    }

//    private void resize(int i)
//    {
//        Object[] newArray = new Object[i];
//        System.arraycopy(array, 0, newArray, 0, array.length);
//        array = newArray;
//    }

    @Override
    public void remove(int index)
    {
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
//        for (int i = index; i < point; i++)
//        {
//            array[i] = array[i + 1];
//            array[point] = null;
//            point--;
//
//            if (array.length > size && point < array.length / point1)
//            {
//                resize(array.length/2);
//            }
//        }
    }

    @Override
    public void clear()
    {
        clearArray(DEFAULT_CAPACITY);
//        this.size = 0;
//        this.array = new Object[DEFAULT_CAPACITY];
////        for (int i = 0; i<point; i++)
////            array[i] = null;
////        size = 0;
    }

    private void clearArray(int capacity) {
        this.size = 0;
        this.array = new Object[capacity];
    }

    @Override
    public int size()
    {
        return this.size;
    }

    @Override
    public T get(int index)
    {
        return (T) array[index];
    }

    @Override
    public String toString()
    {
        return Arrays.toString(array);
    }
}
