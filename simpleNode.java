public class simpleNode {

    public String data;
    private simpleNode next;

    public simpleNode(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(simpleNode node) {
        this.next = node;
    }

    public simpleNode getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {
        simpleNode strawberry = new simpleNode("Berry Tasty");
        simpleNode banana = new simpleNode("Banana-rama");
        simpleNode coconut = new simpleNode("Nuts for Coconut");
        strawberry.setNextNode(banana);
        banana.setNextNode(coconut);
        simpleNode currentNode = strawberry;
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.getNextNode();
        }
    }

}