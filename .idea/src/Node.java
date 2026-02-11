public class Node<E>{
    E element;
    Node<E> nextNode = null;
    Node<E> prevNode = null;
    public boolean changed = false;

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> node) {
        this.element = element;
        prevNode = node;
    }

    public void setNextNode(Node<E> nextnode) {
        this.nextNode = nextnode;
        if (!changed) {
            changed = true;
            System.out.println("works?");
            nextnode.setPrevNode(this.nextNode);
        }
        changed = false;
    }

    public void setPrevNode(Node<E> prevnode) {
        this.prevNode = prevnode;
        if (!changed) {
            System.out.println("works 2?");
            changed = true;
            prevnode.setNextNode(this.prevNode);
        }
        changed = false;
    }

    public E getNode() {
        return element;
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