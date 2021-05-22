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

}