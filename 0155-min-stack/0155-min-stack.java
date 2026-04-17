class MinStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();


    public MinStack() {
        
    }
    
    public void push(int val) {
        stack1.push(val);
        if(stack2.isEmpty()|| val<=stack2.peek()){
        stack2.push(val);

        }
        
    }
    
    public void pop() {
        if(!stack1.isEmpty()){
            int popped = stack1.pop();
if(!stack2.isEmpty() && popped == stack2.peek()){
    stack2.pop();
}
        }
    }
    
    public int top() {
        if(!stack1.isEmpty()){
            return stack1.peek();
        }
        return -1;

        
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */