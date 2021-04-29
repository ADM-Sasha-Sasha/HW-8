package HW8;

public interface QueueList <T>
{
    void add(T value);
    void remove(int index);
    void clear();
    int size();
    T peek();
    T poll();
}
