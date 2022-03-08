public class guguDan{
    public static void main(String[] args){

        int a = 9;
        int b = 9;

        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++)
                System.out.print(i + " x " + j + " = " + i*j + "\t");
            System.out.println("");
        }

    }
}