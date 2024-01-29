import java.util.*;

class MyQueue {

    Stack<Integer> in = new Stack();
    Stack<Integer> ou = new Stack();

    public MyQueue() {
        return;
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        int val = peek();
        ou.pop();
        return val;
    }

    public int peek() {
        if (ou.empty()) {
            while (in.empty() == false) {
                ou.push(in.peek());
                in.pop();
            }
        }
        return ou.peek();
    }

    public boolean empty() {
        return in.empty() && ou.empty();
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