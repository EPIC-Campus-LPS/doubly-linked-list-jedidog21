public class DoublyLinkedList<E> implements List{
    private Node<E> header = null;
    private int s = 0;
    public DoublyLinkedList(){
        header = null;
    }

    public DoublyLinkedList(E elment){
        header = new Node<E>(elment);
        s++;
    }

    @Override
    public void add(Object element) {
        s++;
        if(header == null){
            header = new Node<E>((E) element);
            return;
        }
        Node<E> next = header;
        while (next.getNextNode() != null){
            next = next.getNextNode();
        }
        next.setNextNode(new Node<E>((E) element, next));
    }

    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        if (i > s)
            throw new IndexOutOfBoundsException();
        s++;
        Node<E> after = null;
        if (header == null){
            header = new Node<E>((E) element);
            return;
        }
        Node<E> next = header;
        if (i == 0) {
            after = new Node<E>((E) element);
            next.setPrevNode(after);
            after.setNextNode(next);
            header = next.getPrevNode();
            return;
        }
        while(i != 0 && next.getNextNode() != null){
            next = next.getNextNode();
            i--;
        }
        after = new Node<E>((E)element, next.getPrevNode());
        after.getPrevNode().setNextNode(after);
        after.setNextNode(next);
        next.setPrevNode(after);
    }

    @Override
    public Object remove() {
        s--;
        Node<E> next = header;
        while (next.getNextNode() != null) {
            next = next.getNextNode();
        }
        Object val = next.getValue();
        next.setPrevNode(null);
        return (val);

    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException {
        if (i > s)
            throw new IndexOutOfBoundsException();
        s--;
        Node<E> next = header;
        int count = i;
        while (count > 0){
            next = next.getNextNode();
            count--;
        }
        Object val;
        if (next.getNextNode() == null) {
            val = next.getValue();
            next.getPrevNode().setNextNode(null);
            return val;
        }
        if (next.getPrevNode() == null){
            val = header.getValue();
            header.setValue(null);
            header = header.getNextNode();
            return val;
        }
        val = next.getValue();
        next.getPrevNode().setNextNode(next.getNextNode());
        next.getNextNode().setPrevNode(next.getPrevNode());
        return val;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        Node<E> next = header;
        while (i > 0 && next.getNextNode() != null){
            next = next.getNextNode();
        }
        return ((E)next.getValue());
    }

    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        Node<E> next = header;
        while (i > 0 && next.getNextNode() != null){
            next = next.getNextNode();
            i--;
        }
        next.setValue((E)element);
    }

    @Override
    public int size() {
        return s;
    }

    @Override
    public boolean isEmpty() {
        if (s == 0)
            return true;
        return false;
    }
    public String toString(){
        Node<E> next = header;
        int count = 0;
        String s = "[";
        while (next.getNextNode() != null){
            s += next.getValue() + ", ";
            count++;
            next = next.getNextNode();
        }
        s += next.getValue() + "]";
        return (s);
    }
}