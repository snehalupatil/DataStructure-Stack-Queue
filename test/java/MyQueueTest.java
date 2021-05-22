import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * created a test class MyQueueTest.
 */
public class MyQueueTest {
    /**
     * this test will check the enqueue,printqueue and peak method.
     */
    @Test
    public void given3NumberWhenAddedToQueueShouldHaveFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assertions.assertEquals(myFirstNode,peak);
    }

    /**
     * this test will check the dequeue method.
     */
    @Test
    public void given3NumberWhenDeletedToQueueShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
}