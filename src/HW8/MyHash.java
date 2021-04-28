package HW8;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyHash<I extends Number, S> implements HashList
{
    public int size = 0;

    public static class Node 
    {
        private Object key;
        private Object value;
        private int hash;
        private Node next;


        public Node(Object value, Object key) 
        {
            this.value = value;
            this.key = key;
            next = null;
            if (key != null) 
            {
                hash = key.hashCode();
            }
        }

        public Object getKey() 
        {
            return key;
        }

        public Object getValue() 
        {
            return value;
        }

        public int getHash() 
        {
            return hash;
        }

        public void setKey(Object key) 
        {
            this.key = key;
        }

        public void setValue(Object value) 
        {
            this.value = value;
        }

        public void setHash(int hash) 
        {
            this.hash = hash;
        }

        public Node clearNext() 
        {
            return next = null;
        }

        public Node getNext() {
            return null;
        }

        public void setNext(Node node) {
            this.next = next;
        }
    }
    private static int capacity = 16;
    Node [] newNode;
    public MyHash() 
    {
        newNode = new Node[capacity];
        for (int i = 0; i < capacity; i++)
        {
            Node node = new Node(null, null);
            newNode[i] = node;
        }
    }
    
    private boolean containsKey(Object key)
    {
        Node current = newNode[countIndex(key)];
        if (current.getKey().equals(key))
        {
            return true;
        }
        while (current.getNext() != null)
        {
            if (current.getKey().equals(key))
            {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    @Override
    public void put(Object key, Object value) 
    {
        Node node = new Node(value, key);
        int index = countIndex(key);
        Node current = newNode[index];
        if (newNode[index].getKey() == null)
        {
            newNode[index] = node;
        } else if (containsKey(key))
        {
            throw new NoSuchElementException(" now it used");
        } else {
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    private int countIndex(Object key)
    {
        int index =key.hashCode() & (newNode.length - 1);
        return index;
    }

    @Override
    public Object remove(Object key, Object value) 
    {
        Node current = newNode[countIndex(key)];
        Object temp = null;
        if (current.getValue() == value && current.getKey() == key)
        {
            temp = current.getValue();
            newNode[countIndex(key)] = current.getNext();
        }
        while (current.getNext() != null)
        {
            if (current.getNext().getValue() == value)
            {
                temp = current.getNext().getValue();
                if (current.getNext().getNext() == null)
                {
                    current = current.clearNext();
                } else {
                    current.setNext(current.getNext().getNext());
                }
            } else {
                current = current.getNext();
            }
        }
        return temp;
    }

    @Override
    public void clear() 
    {
        for (int i = 0; i < newNode.length; ++i)
        {
            newNode[i] = null;
        }
    }

    @Override
    public int size() 
    {
        int counter = 0;
        for (int i = 0; i < newNode.length; i++)
        {
            Node current = newNode[i];
            if (current.getValue() != null)
            {
                counter++;
            }
            while (current.getNext() != null)
            {
                counter++;
                current = current.getNext();
            }
        }
        return counter;
    }

    @Override
    public Object get(Object key) 
    {
        Node current = newNode[countIndex(key)];
        if (current.getKey() == key)
        {
            return current.getValue();
        }
        while (current.getNext() != null)
        {
            if (current.getKey() == key)
            {
                return current.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyHash" + Arrays.toString(newNode);
    }
}
