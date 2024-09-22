import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(target > nums[nums.length - 1]){
            return nums[nums.length -1]+nums[nums.length -2]+nums[nums.length -3];
        }else if(target < nums[0]){
            return nums[0] + nums[1] + nums[2];
        }else {
            int closestSum = nums[0] + nums[1] + nums[2];
            for (int i = 0; i<nums.length -2; i++){
                if(i!=0 && nums[i] == nums[i-1]) continue;

                int j = i+1;
                int k = nums.length-1;
                while (j<k){
                    int currentSum = nums[i] + nums[j] + nums[k];
                    if(currentSum == target){
                        return currentSum;
                    }else if(Math.abs(target - currentSum ) <  Math.abs(target - closestSum)){
                        closestSum = currentSum;
                    }
                    if(currentSum < target){
                        j++;
                    }else {
                        k--;
                    }
                }
            }
            return closestSum;
        }

    }
}
