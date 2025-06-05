import java.util.ArrayList;
class ArrayListQueue {
    private ArrayList<Integer> queue = new ArrayList<>();
    public boolean offer(int data) {
        queue.add(data);
        System.out.println("Offered: " + data);
        return true;
    }
    public void enqueue(int data) {
        queue.add(data);
        System.out.println("Enqueued: " + data);
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removed = queue.remove(0);
        System.out.println("Dequeued: " + removed);
        return removed;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue.get(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void display() {
        System.out.println("Current Queue: " + queue);
    }
    public static void main(String[] args) {
        ArrayListQueue q = new ArrayListQueue();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.display();
        System.out.println("Peek: " + q.peek());
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();  
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
