import java.util.Stack;

public class MinStack {
    Stack<Integer> regStack;
    Stack<Integer> minStack;
    public MinStack() {
        regStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        regStack.push(val);
        if(minStack.isEmpty() || regStack.peek() < minStack.peek()){
            minStack.push(val);
        }

    }

    public void pop() {
      if(regStack.pop() == minStack.peek()){
          minStack.pop();
      }
    }

    public int top() {
        return regStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
