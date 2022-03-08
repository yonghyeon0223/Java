import java.util.HashMap;

public class maps {
    public static void main(String[] args){

        int[] numArray = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 0, 1, 0, 1, 0, 1, 1};

        HashMap<Integer, Integer> duplicateChecker = new HashMap<>();

        for (int elem: numArray){
            if (duplicateChecker.containsKey(elem)){
                duplicateChecker.put(elem, duplicateChecker.remove(elem) + 1);
            }
            else{
                duplicateChecker.put(elem, 1);
            }
        // System.out.println(duplicateChecker.toString());
        }

        int duplicateNum = 0;
        for (int key: duplicateChecker.keySet()){
            if (duplicateChecker.get(key) >= 2)
                duplicateNum += 1;
        }

        System.out.println(duplicateNum);
    }
}
