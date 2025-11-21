package Matthew_Glinik.I_nodes.B_O1_getMiddle;

public class O1_getMiddle<E> {
    private static class Node1D_DoubleNode<E>
    {
        Node1D_DoubleNode<E> previous;
        E data;
        Node1D_DoubleNode<E> next;

        Node1D_DoubleNode(E data) {
            this(null, data, null);
        }

        Node1D_DoubleNode(Node1D_DoubleNode<E> previous, E data, Node1D_DoubleNode<E> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }

    Node1D_DoubleNode<E> headNode_Node1D_DoubleNode, tailNode_Node1D_DoubleNode;
    Node1D_DoubleNode<E> middleLeftNode_Node1D_DoubleNode, middleRightNode_Node1D_DoubleNode;


}
