public class DoublyLinkedList<E> implements List{
    Node<String> header = new Node<String>("Hi");
    Node<String> next = header;

    @Override
    public void add(Object element) {
        if (next.getNextNode() == null){
            next.setNextNode(element);
        }
        //next.setValue(next.getNextNode().getValue());
        this.add(next.getNextNode());
    }

    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        if (i == 0){
            next.setNextNode(element);
            if (next.getPrevNode() != null){
                next.getPrevNode().setNextNode(element);
            }
        }
        if (next.getNextNode() != null)
            //next.setValue(next.getNextNode().getValue());
        this.add(i-1, next);
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Node get(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}