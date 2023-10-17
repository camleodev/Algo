package recursive;

public class reverseString {
    public static void main(String[] args) {

        System.out.println(reverseString("hello"));
    }

    private static String reverseString(String input){
        if(input.equals("")){
            return "";
        }
    return reverseString(input.substring(1)) + input.charAt(0);
    }
}
