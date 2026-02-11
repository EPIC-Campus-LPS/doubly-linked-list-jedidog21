public class Test{
    public static void main(String[] args) {
        Node<Integer> first = new Node<Integer>(3);
        Node<Integer> second = new Node<Integer>(2,first);
        Node<Integer> third = new Node<Integer>(1);
        second.setNextNode(third);
        System.out.println(second.getPrevNode().getValue());
        System.out.println(first.getNextNode().getValue());
        System.out.println(first.getNextNode().getNextNode().getValue());
        System.out.println(third.getPrevNode().getValue());
    }
}
