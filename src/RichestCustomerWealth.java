public class RichestCustomerWealth {
    public static void main(String[] args) {

    /*Vous recevez une m x ngrille entière accountsoù accounts[i][j]correspond le montant d’argent que le client a en banque.
     Restituez la richesse que possède le client le plus riche.ith

    La richesse d’un client correspond à la somme d’argent qu’il possède sur tous ses comptes bancaires.
    Le client le plus riche est celui qui possède le maximum de richesse .*/
        //[[2,8,7],[7,1,3],[1,9,5]]
        int[][] accounts = {{2,8,7}, {7,1,3},{1,9,5}};
        int max = 0;
        int temp = 0;
        for (int i = 0; i < accounts.length; i++) {

            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if(temp > max){
                max = temp;
            }
            temp = 0;
        }

        System.out.println("Le client le plus riche possède : " + max);

    }


}
