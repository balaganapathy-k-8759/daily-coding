import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> bracesStack = new Stack<>();
        HashSet<Character> openBraces = new HashSet<>();
        openBraces.add('(');
        openBraces.add('[');
        openBraces.add('{');

        HashMap<Character,Character> bracesMap = new HashMap<>();
        bracesMap.put(')','(');
        bracesMap.put(']','[');
        bracesMap.put('}','{');

        for (int i =0; i<s.length(); i++){
            if(openBraces.contains(s.charAt(i))){
                bracesStack.push(s.charAt(i));
            }else if(bracesMap.containsKey(s.charAt(i))){
                if(!bracesStack.isEmpty() && bracesStack.peek() == bracesMap.get(s.charAt(i))){
                    bracesStack.pop();
                }else {
                    return false;
                }
            }else {
                System.out.println("Not a valid parentheses");
            }
        }
        if(bracesStack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
