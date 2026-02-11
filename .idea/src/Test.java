public class Test{
    public static void main(String[] args) {
        Node<String> first = new Node<String>("Hi");
        Node<String> second = new Node<String>("Bye",first);
        Node<String> third = new Node<String>("Hello");
        second.setNextNode(third);
        System.out.println(second.getPrevNode().getValue());
        System.out.println(first.getNextNode().getValue());
        System.out.println(first.getNextNode().getNextNode().getValue());
        System.out.println(third.getPrevNode().getValue());
    }
}
