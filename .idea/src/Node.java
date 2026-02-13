public class Node<E>{
    E element = null;
    private Node<E> nextNode = null;
    private Node<E> prevNode = null;
    private boolean changed = false;

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> prev) {
        this.element = element;
        prevNode = prev;
    }
    public void setChanged(boolean c){
        changed = c;
    }
    public void setValue(E element){
        this.element = element;
    }

    public void setNextNode(Node<E> next) {
        nextNode = next;
    }

    public void setPrevNode(Node<E> prev) {
        prevNode = prev;
    }

    public E getValue(){
        return element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public Node<E> getPrevNode() {
        return prevNode;
    }

    public boolean equals(Object node) {
        if (node.getClass() == this.getClass())
            return this.element.equals(((Node<?>) node).getValue());
        return this.element.equals(node);
    }

    public String toString() {
        return this.getValue()+"";
    }


}