package pkg7_advance_dsa.queue;

/**
 * Queue is a data structure based on FIFO order principle
 * 30<-20<-10=>queue (last to first)
 * FIFO: First In, First Out
 */

public class Queue {
    Node last;  // Points to the last element (oldest)
    Node first;   // Points to the first element (newest)
    int size = 0;

    // Node definition
    static class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }
    }

    // Enqueue (push) data into the queue
    public void push(Object data) {
        Node newNode = new Node(data);
        if (first == null) {  // If the queue is empty
            last = first = newNode;
        } else {
            first.next = newNode;   //newNode<-first: ....<-30<-20<-10
            first = newNode;
        }
        size++;
    }

    // Dequeue (pop) data from the last of the queue
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        Object poppedData = last.data;
        last = last.next;             //...<-20<-10(last)=> ..<-20(last)

        if (last == null) {  // If the queue becomes empty after pop
            first = null;
        }

        size--;
        return poppedData;
    }

    //Get early added data
    public Object poll(){
        return first.data;
    }


    // Check if the queue is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the queue
    public int size() {
        return size;
    }

    // Display the queue from last to first
    public void display() {
        Node temp = last;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Driver code to test the queue
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        queue.display();

        //System.out.println("Polled: " + queue.poll()); //30 should be polled

        System.out.println("Popped: " + queue.pop()); // 10 should be popped
        System.out.println("Popped: " + queue.pop()); // 20 should be popped
        System.out.println("Popped: " + queue.pop()); // 30 should be popped
        System.out.println("Popped: " + queue.pop()); // Queue is empty


    }
}
