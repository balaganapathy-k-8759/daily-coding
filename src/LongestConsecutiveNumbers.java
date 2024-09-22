import java.util.HashSet;

public class LongestConsecutiveNumbers {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            numSet.add(nums[i]);
        }
        HashSet<Integer> visited = new HashSet<>();
        int longestSeq = 0;
        for (int i = 0; i<nums.length; i++){
            if(!visited.contains(nums[i])){
                if(!numSet.contains(nums[i]-1)){
                    visited.add(nums[i]);
                    int temp = 1;
                    while (numSet.contains(nums[i]+ temp)){
                        temp++;
                        visited.add(nums[i]+ temp);
                    }
                    if(temp > longestSeq){
                        longestSeq = temp;
                    }
                }
            }
        }
        return longestSeq;
    }
}
