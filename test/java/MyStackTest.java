import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * created a test class MyStackTest.
 */
public class MyStackTest {
    /**
     * check the stack has created or not
     */
    @Test
    public void given3NumberWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
}
