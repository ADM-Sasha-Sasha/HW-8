package HW8;

public class Main
{
    public static void main(String[] args)
    {
        //MyArrayList
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        System.out.println(strings);
        strings.add("2");
        System.out.println(strings);
        strings.remove(1);
        System.out.println(strings);
        strings.clear();
        System.out.println(strings);
        strings.size();
        System.out.println(10);
        strings.get(2);
        System.out.println(strings);

        //MyLinkedList
        MyLinkedList <Integer> list = new <Integer> MyLinkedList();
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        //MyStack
        MyStack<String> cars = new MyStack<>();
        cars.push("AUDI");
        cars.push("Mercedes");
        cars.push("BMW");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.peek();
        System.out.println(cars);
        cars.pop();
        System.out.println(cars);

        //MyQueue
        MyQueue<String> phones = new MyQueue<>();
        phones.add("IPhone");
        phones.add("Samsung");
        phones.add("Xiaomi");
        phones.add("HTC");
        System.out.println(phones);
        System.out.println(phones.size());
        phones.remove(3);
        System.out.println(phones);
        phones.poll();
        System.out.println(phones);

        //MyHashMap
        MyHash <Integer, String> car = new MyHash<>();
        car.put(111, "Audi");
        car.put(25, "BMW");
        System.out.println("Num of car 111 "+car.get(111));
        System.out.println("Num of car 25 "+car.get(25));

    }
}
