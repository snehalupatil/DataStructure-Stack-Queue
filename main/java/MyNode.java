public class MyNode<K> implements INode<K> {
    private K key;
    private MyNode<K> next;

    /*
     * @param key
     */
    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    /*
     * override the interface get and set method.
     * @return
     */
    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode<K> getNext() {
        return next;
    }

    /*
     * here it will set the next key value.
     * @param next
     */
    @Override
    public void setNext(INode next) {
        this.next = next;
    }
}