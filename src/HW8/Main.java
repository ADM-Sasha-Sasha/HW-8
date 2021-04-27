package HW8;

public class Main
{
    public static void main(String[] args)
    {
        //MyArrayList

        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        //strings.remove(1);
        //strings.clear();
        //strings.size();
        //strings.get(2);
        System.out.println(strings);

        //MyLinkedList

        MyLinkedList <Integer> list = new <Integer> MyLinkedList();
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        //MyStack
        MyStack<String> cars = new MyStack<>(10);
        cars.push("AUDI");
        cars.push("Mercedes");
        cars.push("BMW");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

        //MyQueue
/*
        MyQueue<String> vine = new MyQueue<>();
        vine.add("Merlo");
        vine.add("Mademoiselle comedie rose");
        vine.add("Shardone");
        vine.add("Pino Nuar");
        System.out.println(vine);
        System.out.println(vine.size());

        vine.remove(2);
        System.out.println(vine);
        vine.poll();
        System.out.println(vine);



        //MyHashMap
        MyHashMap <Integer, String> fruits = new MyHashMap<>();
        fruits.put(123, "Banana");
        fruits.put(23, "Grape");
        System.out.println("Val at 123 "+fruits.get(123));
        System.out.println("Val at 23 "+fruits.get(23));
        System.out.println("Val at 2 "+fruits.get(2));*/
    }
}
