import java.util.*;

public class TopKElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer,Integer> hmap1 = new HashMap<>();
        HashMap<Integer,List> hmap2 = new HashMap<>();

        for(int i =0; i<nums.length;i++){
            if(hmap1.containsKey(nums[i])){
                hmap1.put(nums[i],hmap1.get(nums[i])+1);
            }else {
                hmap1.put(nums[i],1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry : hmap1.entrySet()){
           if(hmap2.containsKey(entry.getValue())){
               hmap2.get(entry.getValue()).add(entry.getKey());
           }else{
               ArrayList<Integer> subList = new ArrayList<>();
               subList.add(entry.getKey());
               hmap2.put(entry.getValue(),subList);
           }

           list.add(entry.getValue());
       }
        Collections.sort(list, Collections.reverseOrder());
       for(int i = 0;i<k;){
           ArrayList<Integer> subList = (ArrayList<Integer>) hmap2.get(list.get(i));
           for(Integer itr:subList){
               ans[i] = itr;
               i++;
           }
       }
        return ans;

    }
}
