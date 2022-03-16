import java.io.*;
import java.util.Arrays;

public class consoleIO {
    public static void main(String[] args) throws IOException{
        InputStream stream = System.in;
        InputStreamReader reader = new InputStreamReader(stream);

        char[] a = new char[3];
        reader.read(a);

        System.out.println(Arrays.toString(a));
    }
}
