package leetCode.medium;

import java.util.Stack;

class MinStack {
	Stack<Integer> stack;
	Stack<Integer> minStack;
	
    public MinStack() {
    	stack = new Stack<>();
    	minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
        if(minStack.isEmpty() || val <= minStack.peek()) {
        	minStack.push(val);
        }
    }
    
    public void pop() {
        int popped = stack.pop();
        
        if(popped == minStack.peek()) {
        	minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

public class Min_Stack_155 {

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
	}

}
