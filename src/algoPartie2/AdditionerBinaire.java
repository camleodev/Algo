package algoPartie2;

public class AdditionerBinaire {
    public static void main(String[] args) {
        /*Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010",
           b = "1011"
    Output: "10101"*/
        String  a = "1010", b = "1011";
        //Solution SIMPLE
        System.out.println(addBinary(a,b));
        //FIN Solution SIMPLE

       // Solution compliqué
        System.out.println(ajouterBinaire(a,b));
        //Fin solution compliqué


        System.out.println((int)a.charAt(0));// 1 --> 49
        System.out.println((int)'0');// 0 --> 48

    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }

    public static String ajouterBinaire(String a, String b){
        String c = "";
        while(a.length() - b.length() != 0){
            if(a.length()>b.length()){
                b= "0"+ b;
            }
            if(b.length()>a.length()){
                a = "0" +a;
            }
        }

        int retenue = 0;
        for (int i = a.length()-1; i >= 0; i--) {
            int somme = Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i))) + retenue;
            retenue = 0;
            if (somme == 0){
                c =  "0" + c;
            } else if (somme == 1) {
                c = "1" +c;

            }else if(somme ==2){
                c =  "0" + c;
                retenue ++;
            }else if(somme ==3){
                c = "1" +c;
                retenue ++;
            }

        }
        if(retenue != 0)
            c = retenue + c;

        return c;
    }

}
