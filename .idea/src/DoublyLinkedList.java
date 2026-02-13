import java.lang.annotation.ElementType;

public class DoublyLinkedList<E> implements List{
    Node<E> header = null;
    public DoublyLinkedList(){

    }

    public DoublyLinkedList(E elment){
        header = new Node<E>(elment);
    }

    @Override
    public void add(Object element) {
        if(header == null){
            header = new Node<E>((E) element);
            return;
        }
        Node<E> next = header;
        while (next.getNextNode() != null){
            next = next.getNextNode();
        }
        next.setNextNode(new Node<E>((E) element));
    }

    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        if (header == null){
            header = new Node<E>((E) element);
            return;
        }
        Node<E> next = header;
        while(i != 0 && next.getNextNode() != null){
            next = next.getNextNode();
        }
        Node<E> after = new Node<E>((E)element);
        after.setNextNode(next.getNextNode());
        next.setNextNode(after);
    }

    @Override
    public Object remove() {
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
        Node<E> next = header;
        while (i > 0 && next.getNextNode() != null){// Needs to throw indexoutofbounds
            next = next.getNextNode();
            i--;
        }
        Object val = next.getValue();
        if (next.getNextNode() != null)
            next.getNextNode().setPrevNode(next.getPrevNode());
        if (next.getPrevNode() != null)
            next.getPrevNode().setNextNode(next.getNextNode());
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
        }
        next.setValue((E)element);
    }

    @Override
    public int size() {
        Node<E> next = header;
        int i = 0;
        while (next.getNextNode() != null){
            next = next.getNextNode();
            i++;
        }
        return i+1;
    }

    @Override
    public boolean isEmpty() {
        if (header.getValue() == null)
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