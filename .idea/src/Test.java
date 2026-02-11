public class Test{
    public static void main(String[] args) {
        Node<String> first = new Node<String>("Hi");
        Node<String> second = new Node<String>("Bye",first);
        first.setNextNode(second);
        System.out.println(second.getPrevNode().getValue());
    }
}
