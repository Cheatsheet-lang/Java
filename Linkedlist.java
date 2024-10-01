import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        // LinkedList<String> list2 = {"This", "is", "a", "linked", "list"};

        list.add("Hello");
        list.add("World");
        list.add("Java");

        System.out.println("Printing the linked list: " + list);
        System.out.println("Size of the linked list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        list.set(2, "Python");
        list.addFirst("C++"); // Adds element at the beginning of the list
        list.addLast("C#"); // Adds element at the end of the list
        list.removeFirst(); // Removes the first occurrence of the element
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        list.add("Anuj");  
        list.removeLast(); // Removes the last occurrence of the element
        list.add("Gaurav");  
        list.add("Harsh");  
        list.remove(1); // Removes the element at index 1
        list.add("Virat");  
        list.add("Gaurav");  
        list.add("Harsh");  
        list.add("Amit"); 
        // list.addAll(list2);
        System.out.println("Printing the linked list: " + list);
    }
}