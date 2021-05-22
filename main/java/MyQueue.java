/**
 * created a class MyQueue.
 */
public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    /**
     * enqueue method will call the append method of linkedlist.
     */
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    /**
     * this method will print the nodes.
     */
    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    /**
     * this method will return the first element of the queue.
     * @return
     */
    public INode peak() {
        return myLinkedList.head;
    }
}