public class MyStack {
    private final MyLinkdList myLinkedList;

    /**
     * In this default constructor it will intiallize the value of myLinkedList.
     */
    public MyStack(){
        this.myLinkedList = new MyLinkdList();
    }

    /**
     * call the add method of the LInkedList and add the node.
     * @param myNode
     */
    public  void push(INode myNode)
    {
        myLinkedList.add(myNode);
    }

    /**
     * this method will print the nodes by using printNodes method.
     */
    public  void printStack(){
        myLinkedList.printMyNodes();
    }

    /**
     * return the head node of the linkedlist.
     * @return
     */
    public INode peak(){
        return myLinkedList.head;
    }

    /**
     * this will delete the 1st element of the stack.
     */
    public void pop() {
        myLinkedList.pop();
    }

}