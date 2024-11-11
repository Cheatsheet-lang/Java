
interface Human {}

class Person implements Human {
    String name;

    Person(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    String company;

    Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    void printCompany() {
        System.out.println("Company: " + company);
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        Person p = new Person("Anurag");
        Employee e = new Employee("Anurag Peddi", "Microsoft");
        e.printName();
        e.printCompany();

        if (e instanceof Employee) {
            System.out.println("e is an instance of Employee");
        }

        if (p instanceof Person) {
            System.out.println("p is an instance of Person");
        }

        if (p instanceof Human) {
            System.out.println("p is an instance of Human");
        }
    }
}