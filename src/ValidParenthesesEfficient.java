public class ValidParenthesesEfficient {
    public boolean isValid(String s) {
        char bracesArr[] = new char[s.length()];
        int top = -1;
        for(char ch: s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                bracesArr[++top] = ch;
            }else if(top > -1 && ((ch == '}' && bracesArr[top] == '{') || (ch == ')' && bracesArr[top] == '(') || (ch == ']' && bracesArr[top] == '[') )){
                top--;
            }else {
                return false;
            }
        }
        if(top == -1) return true;
        else return false;

    }
}
