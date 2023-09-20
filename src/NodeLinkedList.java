public class NodeLinkedList {
    private Node head;
    private int size;

    /**
     * Modify the method such that the value will be added in front and will be the new head while incrementing the size.
     * @param value
     */
    public void addToFront (int value) {
        //code starts here
        Node oldHead = head;
        head = new Node(value);
        head.setNext(oldHead);
        size++;
        //code ends here
    }

    /**
     * Supply the method removeFromFront that retrieves and removes the front (head) of the linked list. The new head will be the 2nd on the list.
     * This method does not do anything if the linked list is empty. The method also reduces the size.
     */
    public Node removeFromFront() {
        //code starts here
        if (head!=null){
            Node removedNode = head;
            Node n2 = removedNode.getNext();
            removedNode.setNext(null);
            head = n2;
            size--;
            return removedNode;
        }else{
            return null;
        }

        //code ends here
    }

    /**
     * Supply the isEmpty method that will return true if the Linked List is empty or does not contain any nodes ; else returns false
     * @return
     */

    public boolean isEmpty () {
        //code starts here
        if (size != 0){
            return false;
        }
        return true;
        //code ends here
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public  void display() {
        Node node = head;
        System.out.print("HEAD->");
        if ( node != null ) {
            do {
                System.out.print(node.getValue());
                System.out.print("->");
                node = node.getNext();
            } while ( node != null);
        }
        System.out.println("NULL");

        System.out.println();
    }
}
