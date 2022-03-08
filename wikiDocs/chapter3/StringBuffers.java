public class StringBuffers{
    public static void main(String[] args){
        
        StringBuffer sb = new StringBuffer();
        
        sb.append("Sonny is per");
        sb.append("haps the GOAT");
        sb.append(" of all time!!!");

        String result = sb.toString();
        System.out.println(result); // Sonny is perhaps the GOAT of all time!!!

        //------------------------------------------

        String str = "";
        str += "Sonny is per";
        str += "haps the GOAT";
        str += " of all time!!!";
        System.out.println(str); // Sonny is perhaps the GOAT of all time!!!

        //------------------------------------------
        sb.insert(0, "Actually.. ");
        System.out.println(sb); // Actually.. Sonny is perhaps the GOAT of all time!!!
        
        System.out.println(sb.substring(0, 20)); // Actually.. Sonny is 

    }
}