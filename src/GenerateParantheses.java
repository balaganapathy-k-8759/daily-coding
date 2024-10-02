import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    private ArrayList<String> allCombinations;
    private int totalN;
    private void recursiveGenerator(int openN, int closeN, String eachCombo){
        //base condition: if all N's are equal, we dont have any paranthesi to append hence valid combo is formed
        if(totalN == openN && totalN == closeN){
            allCombinations.add(eachCombo);
        }
        if(openN < totalN){
            recursiveGenerator(openN+1,closeN,eachCombo+'(');
        }
        if(closeN < openN){
            recursiveGenerator(openN,closeN+1,eachCombo+')');
        }
    }

    public List<String> generateParenthesis(int n) {
        allCombinations = new ArrayList<>();
        totalN = n;
        recursiveGenerator(0,0, "");
        return allCombinations;
    }
}
