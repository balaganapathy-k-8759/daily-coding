import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        /*using HashSet to access already existing element in constant time*/
        HashSet<Integer> numsSet = new HashSet<Integer>();
        for(int i = 0; i< nums.length; i++){
            if(numsSet.contains(nums[i])){
                return true;
            }else{
                numsSet.add(nums[i]);
            }
        }
        return false;
    }
}
