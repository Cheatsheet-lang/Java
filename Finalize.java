
public class Finalize {
    public static void main(String[] args) {
        Finalize f1 = new Finalize();
        Finalize f2 = new Finalize();
        f1 = null;
        f2 = null;
        System.gc();
    }

    protected void finalize() {
        System.out.println("Garbage collection is performed by JVM");
    }
}