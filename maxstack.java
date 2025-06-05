import java.util.Stack;
public class MaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if (maxStack.isEmpty() || val >= maxStack.peek()) {
            maxStack.push(val);
        }
    }
    public void pop() {
        int popped = stack.pop();
        if (popped == maxStack.peek()) {
            maxStack.pop();
        }
    }
    public int top() {
        return stack.peek();
    }
    public int getMax() {
        return maxStack.peek();
    }
    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(-2);
        maxStack.push(0);
        maxStack.push(-3);
        System.out.println("Max: " + maxStack.getMax()); 
        maxStack.pop();
        System.out.println("Top: " + maxStack.top());    
        System.out.println("Max:"  + maxStack.getMax()); 
    }
}
