class MyStack {

    int[] arr;
    int top;
    int capacity;

    MyStack(int size) {
        capacity=size;
        arr =new int[capacity];
        top=-1;
        
    }

    void push(int value) {
        if(top==capacity-1){
            System.out.println("overflow");
        }
        else{
            top++;
            arr[top]=value;
        }
    }

    int pop() {
       if(top==-1){
        System.out.println("underflow");
        return -1;
       }
       else{
        int topvalue=arr[top];
        top--;
        return topvalue;
       }
    }

    int peek() {
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        if(top==-1){
            return true;
        }
        return false;
    }

    int size() {
        return top+1;
    }
}
public class Main{
public static void main(String[] args) {

    MyStack s = new MyStack(5);

    // Test 1: Push elements
    s.push(10);
    s.push(20);
    s.push(30);

    System.out.println("Size: " + s.size());
    System.out.println("Top: " + s.peek());

    // Test 2: Pop an element
    System.out.println("Popped: " + s.pop());

    // Test 3: Check peek after pop
    System.out.println("Top: " + s.peek());

    // Test 4: Check size
    System.out.println("Size: " + s.size());

    // Test 5: Check isEmpty
    System.out.println("Is Empty: " + s.isEmpty());

    // Test 6: Remove remaining elements
    s.pop();
    s.pop();

    System.out.println("Is Empty: " + s.isEmpty());
    System.out.println("Size: " + s.size());

    // Test 7: Underflow
    s.pop();

    // Test 8: Overflow
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
}
}