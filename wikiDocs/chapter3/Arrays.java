public class Arrays {
    public static void main(String[] args){
        
        int[] odds = {1, 3, 5, 7, 9};
        // 배열의 길이는 고정되어 있습니다.
        int[] newArray = new int[10];

        String[] daysOfWeek = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i=0; i<daysOfWeek.length; i++){
            System.out.println(daysOfWeek[i]);
        }
    
    }
}
