class MinStack {
    Stack<Integer> main ;
    Stack<Integer> minstack;
    public MinStack() {
        main = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        main.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }

    }

    public void pop() {
        int remove = main.pop();
        if (remove == minstack.peek()) {
            minstack.pop();
        }
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
