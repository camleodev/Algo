public class PalindromeENtier {

    public static void main(String[] args) {
        int x = 121;

        boolean isPalindrome = true;
        String[] tab = String.valueOf(x).split("");


        int j = tab.length - 1;

        for (int i = 0; i < (tab.length - 1); i++) {
            if (Integer.parseInt(tab[i]) != Integer.parseInt(tab[j])) {
                isPalindrome = false;
                break;
            }
            j--;
        }
        System.out.println(isPalindrome);


    }
}
