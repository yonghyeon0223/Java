public class StringBuffers{
    public static void main(String[] args){
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("Sonny is per");
        sb.append("haps the GOAT");
        sb.append(" of all time!!!");

        String result = sb.toString();
        System.out.println(result);

        //------------------------------------------

        String str = "";
        str += "Sonny is per";
        str += "haps the GOAT";
        str += " of all time!!!";
        System.out.println(str);

    }
}