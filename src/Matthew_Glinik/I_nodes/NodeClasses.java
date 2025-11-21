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
    // relates to: 2D arrays ([y][x])
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
    // relates to: 3D arrays ([y][x][z])
    private static class Node3D_TripleNode<E>
    {}

    private static class Node3D_6Node<E>
    {}

    private static class Node3D_3DNode<E>
    {}

    private static class Node3D_26Node<E>
    {
        /**/                        /**/    Node3D_26Node<E> top_back_left;    Node3D_26Node<E> top_back_Middle;    Node3D_26Node<E> top_back_right;
        /**/                    /**/        Node3D_26Node<E> Middle_back_left; Node3D_26Node<E> Middle_back_Middle; Node3D_26Node<E> Middle_back_right;
        /**/                /**/            Node3D_26Node<E> bottom_back_left; Node3D_26Node<E> bottom_back_Middle; Node3D_26Node<E> bottom_back_right;
        /**/            /**/    Node3D_26Node<E> topLeft;       Node3D_26Node<E> topMiddle;       Node3D_26Node<E> topRight;                      /**/
        /**/        /**/        Node3D_26Node<E> middleLeft;    E data;                           Node3D_26Node<E> middleRight;               /**/
        /**/    /**/            Node3D_26Node<E> bottomLeft;    Node3D_26Node<E> bottomMiddle;    Node3D_26Node<E> bottomRight;           /**/
        Node3D_26Node<E> top_front_left;    Node3D_26Node<E> top_front_Middle;    Node3D_26Node<E> top_front_right;                   /**/
        Node3D_26Node<E> Middle_front_left; Node3D_26Node<E> Middle_front_Middle; Node3D_26Node<E> Middle_front_right;            /**/
        Node3D_26Node<E> bottom_front_left; Node3D_26Node<E> bottom_front_Middle; Node3D_26Node<E> bottom_front_right;        /**/

        Node3D_26Node(E data) {
            this(                              null, null, null,
                                                    null, null, null,
                                                    null, null, null,
                                    null, null, null,
                                    null, data, null,
                                    null, null, null,
                    null, null, null,
                    null, null, null,
                    null, null, null);
        }

        Node3D_26Node(                                                                                                                                                                                                      Node3D_26Node<E> top_back_left, Node3D_26Node<E> top_back_Middle, Node3D_26Node<E> top_back_right,
                                                                                                                                                                                                                            Node3D_26Node<E> Middle_back_left, Node3D_26Node<E> Middle_back_Middle, Node3D_26Node<E> Middle_back_right,
                                                                                                                                                                                                                            Node3D_26Node<E> bottom_back_left, Node3D_26Node<E> bottom_back_Middle, Node3D_26Node<E> bottom_back_right,
                                                                                                                                    Node3D_26Node<E> topLeft, Node3D_26Node<E> topMiddle, Node3D_26Node<E> topRight,
                                                                                                                                    Node3D_26Node<E> middleLeft, E data, Node3D_26Node<E> middleRight,
                                                                                                                                    Node3D_26Node<E> bottomLeft, Node3D_26Node<E> bottomMiddle, Node3D_26Node<E> bottomRight,
                     Node3D_26Node<E> top_front_left, Node3D_26Node<E> top_front_Middle, Node3D_26Node<E> top_front_right,
                     Node3D_26Node<E> Middle_front_left, Node3D_26Node<E> Middle_front_Middle, Node3D_26Node<E> Middle_front_right,
                     Node3D_26Node<E> bottom_front_left, Node3D_26Node<E> bottom_front_Middle, Node3D_26Node<E> bottom_front_right) {
            /**/                        /**/    this.top_back_left = top_back_left; this.top_back_Middle = top_back_Middle; this.top_back_right = top_back_right;
            /**/                    /**/        this.Middle_back_left = Middle_back_left; this.Middle_back_Middle = Middle_back_Middle; this.Middle_back_right = Middle_back_right;
            /**/                /**/            this.bottom_back_left = bottom_back_left; this.bottom_back_Middle = bottom_back_Middle; this.bottom_back_right = bottom_back_right;
            /**/            /**/    this.topLeft = topLeft; this.topMiddle = topMiddle; this.topRight = topRight;                                                             /**/
            /**/        /**/        this.middleLeft = middleLeft; this.data = data; this.middleRight = middleRight;                                                       /**/
            /**/    /**/            this.bottomLeft = bottomLeft; this.bottomMiddle = bottomMiddle; this.bottomRight = bottomRight;                                   /**/
            this.top_front_left = top_front_left; this.top_front_Middle = top_front_Middle; this.top_front_right = top_front_right;                               /**/
            this.Middle_front_left = Middle_front_left; this.Middle_front_Middle = Middle_front_Middle; this.Middle_front_right = Middle_front_right;         /**/
            this.bottom_front_left = bottom_front_left; this.bottom_front_Middle = bottom_front_Middle; this.bottom_front_right = bottom_front_right;     /**/
        }
    }
}
