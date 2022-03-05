import java.util.Arrays;

public class CharString {
    public static void main(String[] args) {

        char a = 'a';
        /* char b = "b"; error. Char needs to be in a pair of single quotation marks */
        char b = 'b';

        System.out.println(a + b); // 195. Does not produce 'ab' instead adds up ascii code number.

        String c = "c";
        String d = "d";

        System.out.println(c + d); // "cd"
        // -------------------------------------------------------------------

        char a1 = 'a'; // a
        char a2 = 97; // a
        char a3 = '\u0061'; // a

        System.out.println(String.format("%s, %s, %s", a1, a2, a3));

        // --------------------------------------------------------------------
        String x1 = "apple";
        String x2 = new String("apple");
        String x3 = "apple";

        System.out.println(x1 == x3); // surprisingly true beccause x3 is only the cache of x1.
        System.out.println(x1 == x2); // false. '==' operator compares object(instance).
        System.out.println(x1.equals(x2)); // true

        boolean aInApple = x1.contains("a");

        char aAtApple = x1.charAt(2); // 3rd char at string x1

        int plAtApple = x1.indexOf("apl"); // start of string apl in apple. -1(doesn't exist)

        String replaceChar = x1.replace('p', 'e'); // apple -> aeele

        String replaceString = x1.replace("ppl", "gre"); // apple -> agree

        String[] splitString = x1.split("p"); // apple -> [a, , le]

        System.out.println(String.format("%s, %s, %s, %s, %s, %s",
                aInApple, aAtApple, plAtApple, replaceChar, replaceString, Arrays.toString(splitString)));

    }
}