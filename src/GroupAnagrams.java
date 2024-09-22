import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultGroup = new ArrayList<>();
        for(int i = 0; i< strs.length; i++){
            if(strs[i] != null) {
                List<String> indivGroup = new ArrayList<>();
                indivGroup.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null && (strs[i].length() == strs[j].length()) && isAnagram(strs[i], strs[j])) {
                        indivGroup.add(strs[j]);
                        strs[j] = null;
                    }
                }
                resultGroup.add(indivGroup);
            }
        }
        return resultGroup;
    }
    public Boolean isAnagram(String str1, String str2){
        int charCount[] = new int[26];
        for (int i=0; i<str1.length();i++){
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for (int i=0;i<26;i++){
            if(charCount[i]==0){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
