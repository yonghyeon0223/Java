
public class Number{
    public static void main(String[] args){
        String KEYWORDS = "Data type, Type conversion";

        int a = (int)Math.pow(2, 31); // 2147483647
        a = (int)Math.pow(2, 31) + 1; // -2147483648
        long b = 3000000000L; // Must add L after num bigger than int
        byte c = (byte)127; // 127
        c = (byte)128; // -128
        short d = (short)32767; // 32767
        d = (short)32768; // -32768


        float f = (float)-2535.123464363463463598; // -2535.1235
        double g = 12398519e-225; // 1.2398519E-218

        int i = 020; // 16 (octal)
        int j = 0x20; // 32 (hexadecimal)

        String result1 = String.format("A: %s\nB: %s\nC: %s\nD: %s\n", a, b, c, d);
        String result2 = String.format("F: %s\nG: %s\n", f, g);
        String result3 = String.format("I: %s\nJ: %s", i, j);
        System.out.println(result1 + result2 + result3);

        // i++, i--. ++i, --i : increment operator
    }
}