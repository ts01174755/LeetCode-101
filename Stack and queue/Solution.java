class MyQueue {

    private Stack<Integer> PushStack = new Stack<Integer>();
	private Stack<Integer> PopStack = new Stack<Integer>();
	
    public MyQueue() {
    	
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	PushStack.push(x);
    	
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(PopStack.empty())
    		while(PushStack.empty() == false) 
    			PopStack.push(PushStack.pop());
    	
    	return PopStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	int ans = pop();
    	PopStack.push(ans);
        return ans;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return PopStack.isEmpty() && PushStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
