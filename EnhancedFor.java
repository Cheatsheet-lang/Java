
public class EnhancedFor {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        String str_arr[] = {"one", "two", "three", "four", "five"};

        for (int a : arr) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();

        for (String s : str_arr) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }
}