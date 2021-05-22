import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * created a test class MyQueueTest.
 */
public class MyQueueTest {
    /**
     * this test case will check the enqueue,printqueue and peak method.
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
}