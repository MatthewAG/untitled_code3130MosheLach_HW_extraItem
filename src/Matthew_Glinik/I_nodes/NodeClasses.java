package Matthew_Glinik.I_nodes;

public class NodeClasses<E> {
    // Node Classes , including material of 3130 and preview of future class \n
    // and other multi_dimensional Nodes . \n

    // CISC 3130: Introduction to Data Structures
    private static class Node1D_SingleNode<E>
    {
        E data;
        Node1D_SingleNode<E> next;

        Node1D_SingleNode(E data, Node1D_SingleNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node1D_SingleNode<E> headNode_Node1D_SingleNode, tailNode_Node1D_SingleNode;

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

    private Node1D_DoubleNode<E> headNode_Node1D_DoubleNode, tailNode_Node1D_DoubleNode;
    private Node1D_DoubleNode<E> middleLeftNode_Node1D_DoubleNode, middleRightNode_Node1D_DoubleNode;

    // CISC 3220: Analysis of Algorithms
    private static class Node2D_TripleNode<E>
    {
        /*Node2D_TripleNode<E> topLeft;       Node2D_TripleNode<E> topMiddle;     Node2D_TripleNode<E> topRight;*/
        Node2D_TripleNode<E> middleLeft;    E data;                             Node2D_TripleNode<E> middleRight;
        /*Node2D_TripleNode<E> bottomLeft;*/    Node2D_TripleNode<E> bottomMiddle;  /*Node2D_TripleNode<E> bottomRight;*/

        Node2D_TripleNode(E data) {
            this(null, data, null,
                            null);
        }

        Node2D_TripleNode(Node2D_TripleNode<E> middleLeft, E data, Node2D_TripleNode<E> middleRight,
                                        Node2D_TripleNode<E> bottomMiddle) {
            /*this.topLeft = topLeft;         this.topMiddle = topMiddle;         this.topRight = topRight;*/
            this.middleLeft = middleLeft;   this.data = data;                   this.middleRight = middleRight;
            /*this.bottomLeft = bottomLeft;*/   this.bottomMiddle = bottomMiddle;   /*this.bottomRight = bottomRight;*/
        }
    }

    private static class Node2D_4Node<E>
    {
        /*Node2D_4Node<E> topLeft;*/       Node2D_4Node<E> topMiddle;       /*Node2D_4Node<E> topRight;*/
        Node2D_4Node<E> middleLeft;    E data;                          Node2D_4Node<E> middleRight;
        /*Node2D_4Node<E> bottomLeft;*/    Node2D_4Node<E> bottomMiddle;    /*Node2D_4Node<E> bottomRight;*/

        Node2D_4Node(E data) {
            this(         null,
                    null, data, null,
                        null);
        }

        Node2D_4Node(              Node2D_4Node<E> topMiddle,
                     Node2D_4Node<E> middleLeft, E data, Node2D_4Node<E> middleRight,
                                   Node2D_4Node<E> bottomMiddle) {
            /*this.topLeft = topLeft;*/         this.topMiddle = topMiddle;         /*this.topRight = topRight;*/
            this.middleLeft = middleLeft;   this.data = data;                   this.middleRight = middleRight;
            /*this.bottomLeft = bottomLeft;*/   this.bottomMiddle = bottomMiddle;   /*this.bottomRight = bottomRight;*/
        }
    }

    // Basic 2D Node . \n
    private static class Node2D_8Node<E>
    {
        Node2D_8Node<E> topLeft;       Node2D_8Node<E> topMiddle;       Node2D_8Node<E> topRight;
        Node2D_8Node<E> middleLeft;    E data;                          Node2D_8Node<E> middleRight;
        Node2D_8Node<E> bottomLeft;    Node2D_8Node<E> bottomMiddle;    Node2D_8Node<E> bottomRight;

        Node2D_8Node(E data) {
            this(null, null, null,
                    null, data, null,
                    null, null, null);
        }

        Node2D_8Node(Node2D_8Node<E> topLeft, Node2D_8Node<E> topMiddle, Node2D_8Node<E> topRight,
                     Node2D_8Node<E> middleLeft, E data, Node2D_8Node<E> middleRight,
                     Node2D_8Node<E> bottomLeft, Node2D_8Node<E> bottomMiddle, Node2D_8Node<E> bottomRight) {
            this.topLeft = topLeft;         this.topMiddle = topMiddle;         this.topRight = topRight;
            this.middleLeft = middleLeft;   this.data = data;                   this.middleRight = middleRight;
            this.bottomLeft = bottomLeft;   this.bottomMiddle = bottomMiddle;   this.bottomRight = bottomRight;
        }
    }

    // Basic 3D Nodes . (More advanced than 2D Nodes) \n
    private static class Node3D_TripleNode<E>
    {}

    private static class Node3D_6Node<E>
    {}

    private static class Node3D_14Node<E>
    {}

    private static class Node3D_22Node<E>
    {}
}
