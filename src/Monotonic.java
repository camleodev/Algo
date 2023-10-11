public class Monotonic {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3};
        int [] nums2 = {6,5,4,4};
        int [] nums3 = {1,3,2};
        boolean a = isMonotonic(nums);
        boolean b = isMonotonic(nums2);
        boolean c = isMonotonic(nums3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static boolean isMonotonic(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        boolean croissant = false;
        boolean decroissant = false;

        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] <= nums[i+1]){
                croissant = true;
            }else{
                croissant = false;
                break;
            }
        }

        if(croissant){
            return true;
        }else{
            for(int i = 0; i < nums.length -1; i++){
                if(nums[i] >= nums[i+1]){
                    decroissant = true;
                }else{
                    decroissant = false;
                    break;
                }
            }

            if(decroissant){
                return true;
            }else{
              return  false;
            }
        }


    }

}
