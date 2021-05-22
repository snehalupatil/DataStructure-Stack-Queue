public class MyQueue{

    private final MyLinkdList myLinkedList;
    public MyQueue(){
        this.myLinkedList = new MyLinkdList();
    }

    public void enqueue(INode myNode){
        myLinkedList.append(myNode);
    }

    /**
     * this method will print the nodes.
     */
    public void printQueue(){
        myLinkedList.printMyNodes();
    }

    /**
     * this method will return the 1st element of the queue.
     * @return
     */
    public INode peak() {
        return myLinkedList.head;
    }

    /**
     * dequeue method will delete the first node by calling pop method
     */
    public void dequeue() {
        myLinkedList.pop();
    }

}