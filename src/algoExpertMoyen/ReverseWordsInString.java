package algoExpertMoyen;

public class ReverseWordsInString {
    public static void main(String[] args) {
        //input  string =  = "AlgoExpert is the best!"
        //output "best! the is AlgoExpert"
        String string = "AlgoExpert is the best!";

        System.out.println(reverseWordsInString(string));;
    }

    public static String reverseWordsInString(String string) {
       // string = string.trim();
        if(string.isBlank()){
            return string;
        }

        String[] tab = string.split(" ");

        String temp = "";
        int j = tab.length-1;
        for (int i = 0; i < tab.length; i++) {
        if(i > j  || i==j){
            break;
        }
         temp = tab[i];
         tab[i]= tab[j];
         tab[j] = temp;
         j--;
        }
        return String.join(" ",tab);
    }
}
