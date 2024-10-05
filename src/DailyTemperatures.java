import java.util.ArrayList;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> days = new Stack<>();
        int ans[] = new int[temperatures.length];
        for (int day = 0; day < temperatures.length; day++){
            //if current day is less warmer than the previous days, push it inside stack else pop all the days that are colder
            while (!days.isEmpty() && temperatures[days.peek()] < temperatures[day]){
                ans[days.peek()] = day - days.pop();
            }
            days.push(day);
        }
        return ans;
    }
}
