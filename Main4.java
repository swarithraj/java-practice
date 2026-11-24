
class CircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];

        front = (front + 1) % capacity;
        size--;

        return value;
    }

    int peek() {

        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}

public class Main4 {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());

        q.enqueue(40);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
