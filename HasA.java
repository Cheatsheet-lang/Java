
class Name {
    String name;

    Name() {
        this.name = "";
    }

    Name(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + this.name);
    }
}

class Address {
    String address;

    Address() {
        this.address = "Mountain View, CA";
    }

    Address(String address) {
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printAddress() {
        System.out.println("Address: " + this.address);
    }
}

class Employee {
    String company;
    Name name;
    Address address;

    Employee(String name, String company) {
        this.name = new Name(name);
        this.address = new Address();
        this.company = company;
    }

    public void printCompany() {
        System.out.println("Name "+this.name.name+" works at "+this.company);
        System.out.println("Address: "+ this.address.address);
    }
}

public class HasA {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Google");
        emp.printCompany();

        if (emp.name instanceof Name) {
            System.out.println("'emp.name' is an instance of Name");
        }
    }
}