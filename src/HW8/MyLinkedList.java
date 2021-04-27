package HW8;

import java.util.Iterator;

public class MyLinkedList <T> implements Methods <T>
{
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;
    //private T element;

    private class Node<E>
    {
        E item;
        public Node<E> previous;
        public Node<E> next;
        //public T element;
        //public T elements;

        public Node(E item)
        {
            this.item = item;
        }
    }

//        public void setPreviousElement(Node<T> firstNode) {
//
//        }
//    }
//
    public void MyLinkedList()
    {
//        this.firstNode = new Node(null, null, lastNode);
//        this.lastNode = new Node(null, firstNode, null);
//        lastNode.setPreviousElement(firstNode);
        this.size = 0;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            lastNode.next = newNode;
            newNode.previous = lastNode;
        }
        lastNode = newNode;
        size++;
    }
//        Node <T> prev = lastNode;
//        prev.elements = element;
//    }

    @Override
    public void remove(int index)
    {
        Node<T> node = getNodeByIndex(index);
        if (node.previous == null)
        {
            firstNode = node.next;
        } else
        {
            node.previous.next = node.next;
        }
        if (node.next == null)
        {
            lastNode = node.previous;
        } else
        {
            node.next.previous = node.previous;
        }
        size--;
    }

    @Override
    public void clear()
    {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public T get(int index)
    {
        return getNodeByIndex(index).item;
    }

    private Node<T> getNodeByIndex(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index " + index + ", Size " + size);
        }
        Node<T> res;
        if (size/2 > index)
        {
            res = firstNode;
            for (int i = 0; i < index; i++)

                res = res.next;
            } else
            {
                res = lastNode;
                for (int i = 0; i > index; i--);
                {
                    res = res.previous;
                }

            }
        return res;
    }
        //return null;
    public Iterator<T> iterator()
    {
        return new Iterator<T>()
        {
            private Node<T> node = firstNode;

            @Override
            public boolean hasNext()
            {
                return node != null;
            }

            @Override
            public T next()
            {
                T item = node.item;
                node = node.next;
                return item;
            }
        };
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext())
        {
            stringBuilder.append(iterator.next());
            if (iterator().hasNext()) stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
