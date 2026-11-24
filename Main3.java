class MyQueue {

    int[] arr;
    int front;
    int rear;
    int capacity;

    MyQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        arr[rear] = value;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front++;

        return value;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return front > rear;
    }
}

public class Main3 {
    public static void main(String[] args) {

        MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
    }
}
