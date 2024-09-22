import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map store = new HashMap<Character,Integer>(s.length());
        for(char ch : s.toCharArray()){
            if(store.containsKey(ch)){
                store.put(ch,(int)store.get(ch)+1);
            }
        }
        for(char ch : t.toCharArray()){
            if(store.containsKey(ch)){
                int count = (int)store.get(ch)-1;
                if(count == 0){
                    store.remove(ch);
                }else{
                    store.put(ch,count);
                }
            }else{
                return false;
            }
        }
        if(store.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
