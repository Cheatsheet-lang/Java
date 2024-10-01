
public class AccessControl {
    private String name = "AnuragAnalog";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        AccessControl obj = new AccessControl();

        System.out.println("Name: " + obj.getName());
        obj.setName("Anurag Peddi");
        System.out.println("Name: " + obj.getName());
    }
}