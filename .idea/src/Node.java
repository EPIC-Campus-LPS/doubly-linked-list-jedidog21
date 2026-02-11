public class Node<E>{
    E element;
    private Node<E> nextNode = null;
    private Node<E> prevNode = null;
    private boolean changed = false;

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> node) {
        this.element = element;
        prevNode = node;
        prevNode.setNextNode(this);
    }
    public void setChanged(boolean c){
        changed = c;
    }
    public void setNextNode(Node<E> nextnode) {
        this.nextNode = nextnode;
        if (!changed) {
            nextnode.setChanged(true);
            nextnode.setPrevNode(this);
        }
        changed = false;
    }

    public void setPrevNode(Node<E> prevnode) {
        this.prevNode = prevnode;
        if (!changed) {
            System.out.println("works 2?");
            prevnode.setChanged(true);
            prevnode.setNextNode(this);
        }
        changed = false;
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
        return (String) element;
    }


}