package algoExpert.facile;

public class RunLengthEncoding {
    public static void main(String[] args) {

        //INPUT  string = "AAAAAAAAAAAAABBCCCCDD"
        //OUTPUT "9A4A2B4C2D"
        String string = "AAAAAAAAAAAAABBCCCCDD";
        System.out.println(runLengthEncoding(string));
    }

    public static String runLengthEncoding(String string) {
        char c = string.charAt(0);
        String s = "";
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i) == c){
                count++;
            }else{
                if(count>9){
                    while(count >9){
                        s+=  String.valueOf(9) + c;
                        count -=9;
                    }
                }
                s+=  String.valueOf(count) + c;
                count = 1;
                c = string.charAt(i);
            }
        }
        if(count>9){
            while(count >9){
                s+=  String.valueOf(9) + c;
                count -=9;
            }
        }
        s+=  String.valueOf(count) + c;
        return s;
    }

}
