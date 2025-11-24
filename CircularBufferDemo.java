class CircularBuffer {
    int[] arr;
    int front = 0, size = 0;

    CircularBuffer(int capacity) {
        arr = new int[capacity];
    }

    public void add(int x) {
        arr[(front + size) % arr.length] = x;
        if (size < arr.length) size++;
        else front = (front + 1) % arr.length; // overwrite oldest
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }
}

public class CircularBufferDemo {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1); cb.add(2); cb.add(3);
        cb.add(4); // overwrites 1
        cb.display(); // 2 3 4
    }
}