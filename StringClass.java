import java.util.*;

// Knowing more about the String class

public class StringClass {
    public static void main(String[] args) {
        int a = 10;
        float f = 10.5f;
        String str = "hello";
        char arrch[] = {'h', 'e', 'l', 'l', 'o'};
        byte arr[] = {65, 66, 67, 68, 69, 70};

        String str2 = new String(arr);
        String str3 = new String(arr, 2, 3);
        String str4 = new String(arrch);

        // String Formatting
        String fs = String.format("The value of the float variable is " +
            "%f, while the value of the integer variable is %d, and the string" +
            " is %s", f, a, str);

        // Some basic Operations on Strings
        System.out.println("Length of String: " + str.length());
        System.out.println("Character at position 2: " + str.charAt(2));
        System.out.println("Concatenation with str2: " + str.concat(str2));
        System.out.println("Checking if str is equal to str4: " + str.equals(str4));
        System.out.println("Checking if str is equal to str2 ignoring case: " + str.equalsIgnoreCase(str2));
        System.out.println("Checking if str starts with he: " + str.startsWith("he"));
        System.out.println("Checking if str ends with lo: " + str.endsWith("lo"));
        System.out.println("Index of e: " + str.indexOf('e'));
        System.out.println("Last index of l: " + str.lastIndexOf('l'));
        System.out.println("Replacing l with p: " + str.replace('l', 'p'));
        System.out.println("Substring of str: " + str.substring(2));
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Value of fs: " + fs);
    }
}