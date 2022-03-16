import java.util.Scanner;


public class juminNumber {
    public static String HORIZLINE = "----------------------------------------------------------------";
    public static String juminNum;
    public static String dateOfBirth = "19Y년 M월 D일";
    public static String result = "\n";
    public static int lengthOfJuminNum = 14;
    public static String numString = "0123456789";
    public static String inputPromptMsg = HORIZLINE + "\n주민등록번호를 입력해 주세요.\n (YYMMDD-XXXXXXX): ";
    public static String wrnogInputMsg = " -->> 주민등록번호가 옳바른 형식으로 작성되지 않았습니다.";
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("");

        while (true){
            System.out.print(inputPromptMsg);
            juminNum = sc.nextLine();

            if(juminNum.length() != lengthOfJuminNum || juminNum.charAt(6) != '-'){
                System.out.println(wrnogInputMsg);
                continue;
            }
            boolean correctInput = true;
            for (int i = 0; i<lengthOfJuminNum; i++){
                if (i == 6)
                    continue;
                if (!numString.contains(juminNum.substring(i, i+1))){
                    System.out.println(wrnogInputMsg + juminNum.substring(i, i+1));
                    correctInput = false;
                    break;
                }
            }
            if (correctInput == false)
                continue;

            if ( Integer.parseInt(juminNum.substring(2, 4)) > 12){
                System.out.println(wrnogInputMsg);
                continue;
            }
            if ( Integer.parseInt(juminNum.substring(4, 6)) > 31){
                System.out.println(wrnogInputMsg);
                continue;
            }

            break;
        }
        
        dateOfBirth = dateOfBirth.replace("Y", juminNum.substring(0, 2));
        dateOfBirth = dateOfBirth.replace("M", juminNum.substring(2, 4));
        dateOfBirth = dateOfBirth.replace("D", juminNum.substring(4, 6));
        
        String gender = juminNum.substring(7, 8);

        if ("34".contains(gender))
            dateOfBirth = "20" + dateOfBirth.substring(2, dateOfBirth.length());
        if ("13".contains(gender))
            gender = "남자";
        if ("24".contains(gender))
            gender = "여자";
        
        

        result += "생년월일: " + dateOfBirth + "\n";
        result += " 성 별  : " + gender + "\n";
        result += HORIZLINE + "\n";


        System.out.printf(result);
    }
}
