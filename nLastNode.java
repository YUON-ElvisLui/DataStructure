import java.util.ArrayList;
public class nLastNode {

    public static void main(String []args) {
        // Use this to test your code:
        LinkedList ll = createList();
        ll.printList();
        simpleNode n = nthLastNode(ll, 9);
        System.out.print(n.data);
    }

    public static simpleNode nthLastNode(LinkedList list, int n) {
        simpleNode node1 = list.head;
        simpleNode node2 = list.head;
        int counter = 0;
        while (counter < n){
            if (node1 == null){
                return null;
            }
            node1 = node1.getNextNode();
            counter++;
        }
        while (node1 != null){
            node1 = node1.getNextNode();
            node2 = node2.getNextNode();
        }
        return node2;
    }

    public static LinkedList createList() {
        LinkedList list = new LinkedList();
        for (int i = 50; i >= 1; i--) {
            list.addToTail(String.valueOf(i));
        }
        return list;
    }

}