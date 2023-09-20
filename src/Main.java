public class Main {
    public static void main(String[] args) {
        NodeLinkedList linkedList = new NodeLinkedList();
        //Note: You have to instantiate nodeA first.

        linkedList.display();
        System.out.println("Size:" + linkedList.getSize());
        System.out.println("Empty:" + linkedList.isEmpty());

        /*
        modify nodeA and attach 9 additional nodes to it such that the output would be:
        5->4->3->2->1
         */

        for ( int i = 1 ; i <= 5 ; i++ ) {
            linkedList.addToFront(i);
        }

        linkedList.display();
        System.out.println("Head:" + linkedList.getHead().getValue());
        System.out.println("Size:" + linkedList.getSize());
        System.out.println("Empty:" + linkedList.isEmpty());
        System.out.println();

        System.out.println("Remove From Front");
        Node removedNode = linkedList.removeFromFront();
        linkedList.display();
        System.out.println("Removed Node:" + removedNode.getValue());
        System.out.println("Removed Node Next Value:" + removedNode.getNext());
        System.out.println("Head:" + linkedList.getHead().getValue());
        System.out.println("Size:" + linkedList.getSize());
        System.out.println("Empty:" + linkedList.isEmpty());
        System.out.println();

        System.out.println("Remove From Front");
        removedNode = linkedList.removeFromFront();
        linkedList.display();
        System.out.println("Removed Node:" + removedNode.getValue());
        System.out.println("Removed Node Next Value:" + removedNode.getNext());
        System.out.println("Head:" + linkedList.getHead().getValue());
        System.out.println("Size:" + linkedList.getSize());
        System.out.println("Empty:" + linkedList.isEmpty());

        System.out.println();

        System.out.println("Remove From Front");
        removedNode = linkedList.removeFromFront();
        System.out.println("Removed Node:" + removedNode.getValue());
        System.out.println("Removed Node Next Value:" + removedNode.getNext());
        System.out.println("Remove From Front");
        removedNode = linkedList.removeFromFront();
        System.out.println("Removed Node:" + removedNode.getValue());
        System.out.println("Removed Node Next Value:" + removedNode.getNext());
        System.out.println("Remove From Front");
        removedNode = linkedList.removeFromFront();
        System.out.println("Removed Node:" + removedNode.getValue());
        System.out.println("Removed Node Next Value:" + removedNode.getNext());

        System.out.println();

        System.out.println("Size:" + linkedList.getSize());
        System.out.println("Empty:" + linkedList.isEmpty());
        linkedList.display();

    }
}