
// Understanding "Character Class" in Java

public class CharacterClass {
    public static void main(String[] args) {
        Character a = new Character('A');
        Character b = new Character('B');
        Character c = new Character('5');
        Character d = new Character('$');

        System.out.println("Is 'a' a letter? " + Character.isLetter(a));
        System.out.println("Is 'a' a digit? " + Character.isDigit(a));
        System.out.println("Is 'a' a whitespace? " + Character.isWhitespace(a));
        System.out.println("Is 'a' uppercase? " + Character.isUpperCase(a));
        System.out.println("Is 'a' lowercase? " + Character.isLowerCase(a));
        System.out.println("Is 'a' a letter or digit? " + Character.isLetterOrDigit(a));
        System.out.println("Is 'c' a letter or digit? " + Character.isLetterOrDigit(c));
        System.out.println("Is 'd' a letter or digit? " + Character.isLetterOrDigit(d));
        System.out.println("Is 'b' a letter or digit? " + Character.isLetterOrDigit(b));
    }
}