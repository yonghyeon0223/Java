import java.util.HashSet;
import java.util.Arrays;

public class sets {
    public static void main(String[] args){
        HashSet<Integer> exSet1 = new HashSet<>(Arrays.asList(1, 1, 2, 2, 3, 3)); //1, 2, 3
        HashSet<Integer> exSet2 = new HashSet<>(Arrays.asList(3, 3, 4, 4, 5, 5)); //3, 4, 5
        // 중복이 허용되지 않고 순서가 없다.

        HashSet<Integer> intersection = new HashSet<>(exSet1);
        intersection.retainAll(exSet2); // 교집합 수행
        System.out.println(intersection.toString()); // 3
    
        exSet1.addAll(exSet2); // 합집합 수행
        System.out.println(exSet1.toString()); // 1, 2, 3, 4, 5

        exSet2.removeAll(exSet1);
        System.out.println(exSet2.toString()); // [] nothing
    }
}
