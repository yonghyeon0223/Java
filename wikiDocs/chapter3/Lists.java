import java.util.ArrayList;
import java.util.Arrays;


public class Lists {
    public static void main(String[] args){
       // 리스트는 배열과 다르게 동적으로 변하고 크기가 정해져 있지 않다. 필요에 따라 +/- 가능.
        
        ArrayList<Integer> pitches = new ArrayList<>();
    
        pitches.add(156);
        pitches.add(149);
        pitches.add(153); // pitches = {156, 149, 153}


        for (int i=0; i<pitches.size(); i++){
            System.out.println(pitches.get(i));
        } // 156 149 153

        if (pitches.contains(153)){
            System.out.println("Contains!");
        }

        boolean successfullyRemoved = pitches.remove(Integer.valueOf(149)); // remove(객체) --> true/false 반환
        int intRemoved = pitches.remove(0); // remove(인덱스) --> 156 반환

        System.out.printf("%s, %s\n", successfullyRemoved, intRemoved); // true, 156

        
        String[] exArray = {"Hello", "World", "I'm", "Earth."};
        ArrayList<String> exArrayInList = new ArrayList<>(Arrays.asList(exArray)); // Hello: World: I'm: Earth.
        
        String exArrayToStr = String.join(": ", exArrayInList);
        System.out.println(exArrayToStr);


    }
}
