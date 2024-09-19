import java.util.*;

// Super Keyword in Java

class Human {
    String name = "No Name";
    boolean isMortal = true;
    String species = "Human";

    Human() {
        System.out.println("Human Constructor");
    }

    void breathe() {
        System.out.println("Human is breathing");
    }
}

class Person extends Human {
    String name;

    Person(String name) {
        super();
        this.name = name;
        System.out.println("Person Constructor");
    }

    void breathe() {
        super.breathe();
        System.out.println("Person is breathing");
    }

    void changeSpecies() {
        super.species = "Cyborg";
    }

    void printName() {
        System.out.println("Name: " + name);
    }
}

public class Super {
    public static void main(String[] args) {
        Person p = new Person("Anurag");
        p.breathe();
        System.out.println("Is Human Species: " + p.species);
        p.changeSpecies();
        System.out.println("Species: " + p.species);
        p.printName();
    }
}