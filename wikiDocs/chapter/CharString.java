public class CharString{
    public static void main(String[] args){

    char a = 'a';
    /*char b = "b"; error. Char needs to be in a pair of single quotation marks */
    char b = 'b';

    System.out.println(a+b); // 195. Does not produce 'ab' instead adds up ascii code number.

    String c = "c";
    String d = "d";

    System.out.println(c+d); // "cd"
// -------------------------------------------------------------------

    char a1 = 'a'; // a
    char a2 = 97; // a
    char a3 = '\u0061'; // a

    System.out.println(String.format("%s, %s, %s", a1, a2, a3));

//--------------------------------------------------------------------

    }
}