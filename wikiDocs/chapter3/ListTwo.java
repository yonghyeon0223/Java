import java.util.ArrayList;
import java.util.Arrays;

public class ListTwo {
    public static void main(String[] args){

        Integer[] testLs = {1, 2, 3, 4, 5, null, 6, 7, 8, 9, 10, null};
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(testLs));

        ls.remove(null);

        for (Integer elem: ls)
            System.out.println(elem);
        
    }
}
