public class MyStack {
    private final MyLinkdList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkdList();
    }


    public  void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public  void printStack(){
        myLinkedList.printMyNodes();
    }

    public INode peak(){

        return myLinkedList.head;
    }

}