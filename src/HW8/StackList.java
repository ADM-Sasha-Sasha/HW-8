package HW8;

public interface StackList <T>
{
    void push(T value);
    void remove(int index) ;
    void clear() ;
    int  size() ;
    T peek();
    T pop() ;
}
