package binaryTree;

import java.util.Stack;

public class BinaryTree {

    private TreeNode root =null;

    private class TreeNode{
        private int key = 0;
        private String data =null;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;
        private boolean isVisted=false;

        public TreeNode(){}

        public TreeNode(int key ,String data){
            this.key=key;
            this.data=data;
        }
    }

    public BinaryTree(){
        root=new TreeNode(1,"A");
    }

    /**
    * 创建一棵二叉树
    * <pre>
    *           A
    *     B          C
    *  D     E            F
    *  </pre>
    * @param root
    * @author WWX
    */
    public void createBinaryTree(TreeNode root){
        TreeNode nodeB = new TreeNode(2,"B");
        TreeNode nodeC = new TreeNode(3,"C");
        TreeNode nodeD = new TreeNode(4,"D");
        TreeNode nodeE = new TreeNode(5,"E");
        TreeNode nodeF = new TreeNode(6,"F");

        root.leftChild=nodeB;
        root.rightChild=nodeC;
        root.leftChild.leftChild=nodeD;
        root.leftChild.rightChild=nodeE;
        root.rightChild.rightChild=nodeF;

    }
    public void visited(TreeNode node){
        if (node==null)return;
        node.isVisted=true;
        System.out.println("=="+node.key+"----"+node.data);
    }



        public static void main(String[] args) {
        BinaryTree bT=new BinaryTree();
        bT.createBinaryTree(bT.root);
//        bT.preOrder(bT.root);
//        System.out.println("=========");
//        bT.midOrder(bT.root);
//        System.out.println("=========");
//        bT.afterOrder(bT.root);
//        System.out.println("========");
//        bT.nonRecPreOrder(bT.root);

//        bT.midOrder(bT.root);
//        System.out.println("========");
//        bT.noRecMidOrder(bT.root);
//
        bT.afterOrder(bT.root);
        System.out.println("========");
        bT.nonRecPostOrder(bT.root);
//        bT.layerOrder(bT.root);
//        System.out.println(bT.level(bT.root));
    }

    private void nonRecPostOrder(TreeNode header) {
        if (header==null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> resultStack = new Stack<>();
        stack.push(header);
        while (!stack.isEmpty()){
            header = stack.pop();
            resultStack.push(header);
            if (header.leftChild!=null){
                stack.push(header.leftChild);
            }
            if (header.rightChild!=null){
                stack.push(header.rightChild);
            }
        }
        while (!resultStack.isEmpty()){
            visited(resultStack.pop());
        }

    }

    private void noRecMidOrder(TreeNode header) {
        if (header==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty()||header!=null){
            if (header!=null){
                stack.push(header);
                header = header.leftChild;
            }else {
                header = stack.pop();
                visited(header);
                header = header.rightChild;
            }
        }
    }



    private void nonRecPreOrder(TreeNode header) {
        if (header==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(header);
        while (!stack.isEmpty()){
            header = stack.pop();
            visited(header);
            if (header.rightChild!=null){
                stack.push(header.rightChild);
            }
            if (header.leftChild!=null){
                stack.push(header.leftChild);
            }
        }
    }


    private void preOrder(TreeNode root) {
        if (root ==null){
            return;
        }
        visited(root);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    private void midOrder(TreeNode root) {
        if (root ==null){
            return;
        }
        midOrder(root.leftChild);
        visited(root);
        midOrder(root.rightChild);
    }

    private void afterOrder(TreeNode root) {
        if (root ==null){
            return;
        }
        afterOrder(root.leftChild);
        afterOrder(root.rightChild);
        visited(root);
    }


}
