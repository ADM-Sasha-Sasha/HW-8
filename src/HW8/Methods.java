package HW8;

public interface Methods <T> {

    void add(Object value); // добавляет элемент в конец

    void remove(int index); // удаляет элемент под индексом

    void clear(); // очищает коллекцию

    int size(); // возвращает размер коллекции

    T get(int index); // возвращает элемент под индексом

}