package recursive;

public class BinarySearch {
    public static void main(String[] args) {
        int[] A = {-1,0,1,2,3,4,7,9,10,20};
        System.out.println("Le nombre cherché est à la position : "+binarySearch(A,0,A.length,10));

        int[]B = {-1,0,3,5,9,12};
        System.out.println(B.length);
        System.out.println("Le nombre cherché est à la position : "+appelRecursif(B,10,0,B.length));
    }
    private static int binarySearch(int[]A, int left, int right, int x){
        if(left> right){
            return -1;
        }
        int mid =(left+right)/2;

        if(x ==A[mid]){
            return mid;
        }

        if(x <A[mid]){
            return binarySearch(A,left,mid-1,x);
        }
        return binarySearch(A,mid+1, right,x);
    }

    private static int appelRecursif(int[]nums,int target,int left, int right ){
        if(left> right){
            return -1;
        }
        int milieu = (left+right) /2;
        if(milieu >= nums.length) return -1;
        if(target == nums[milieu]){
            return milieu;
        }

        if(target< nums[milieu] ){
            appelRecursif(nums,target,left, milieu -1);
        }
        return  appelRecursif(nums,target,milieu +1, right);
    }
}
