public class findMiddle {

    public static void main(String []args) {
        // Use this to test your code:
        LinkedList ll = createList(7);
        ll.printList();
        simpleNode n = findMiddle(ll);
        System.out.print(n.data);
    }

    public static simpleNode findMiddle(LinkedList linkedList) {
        simpleNode node1 = linkedList.head;
        simpleNode node2 = linkedList.head;
        while (node1 != null){
            node1 = node1.getNextNode();
            if (node1 != null){
                node1 = node1.getNextNode();
            }else{
                break;
            }
            node2 = node2.getNextNode();
        }

        return node2;
    }

    public static LinkedList createList(int length) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= length; i++) {
            list.addToTail(String.valueOf(i));
        }
        return list;
    }

}