public class LinkedList {

    public static void main(String []args) {
        LinkedList hi = new LinkedList();
        hi.addToHead("KP");
        hi.addToHead("KP");
        hi.addToHead("KP");
        hi.printList();


    }

    public simpleNode head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data) {
        simpleNode newHead = new simpleNode(data);
        simpleNode currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        simpleNode tail = this.head;
        if (tail == null) {
            this.head = new simpleNode(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new simpleNode(data));
        }
    }

    public String removeHead() {
        simpleNode removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String printList() {
        String output = "<head> ";
        simpleNode currentsimpleNode = this.head;
        while (currentsimpleNode != null) {
            output += currentsimpleNode.data + " ";
            currentsimpleNode = currentsimpleNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

}
