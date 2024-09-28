import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvalReverPolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> evalStack = new Stack<>();
        Set<String> operators = Set.of("+","*","-","/");
        for (String eachToken : tokens){
            if(operators.contains(eachToken)){
                Integer operand2 = evalStack.pop();
                Integer operand1 = evalStack.pop();
                Integer result;
                switch (eachToken){
                    case "+": evalStack.push(operand1 + operand2);
                    break;
                    case "-": evalStack.push(operand1 - operand2);
                    break;
                    case "*":  evalStack.push(operand1 * operand2);
                    break;
                    case "/":  evalStack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + eachToken);
                }
            }else {
                evalStack.push(Integer.parseInt(eachToken));
            }
        }
        return evalStack.peek();
    }
}
