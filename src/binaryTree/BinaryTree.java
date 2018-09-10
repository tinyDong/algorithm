package binaryTree;

import java.util.*;

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
        System.out.println("====="+node.key+"----"+node.data);
    }
    //前序遍历
    public void preOrder(TreeNode root){
        if (root!=null){
            visited(root);
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

//    *           A
//    *     B          C
//    *  D     E            F
    //前序遍历的非递归实现
    public void nonRecPreOrder(TreeNode root) {
        if (root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (temp!= null||!stack.isEmpty()){
            while (temp!=null){
                stack.push(temp);
                visited(temp);
                temp = temp.leftChild;
            }
            temp = stack.pop();
            temp = temp.rightChild;
        }
    }

    //中序遍历
    public void midOrder(TreeNode root){
        if (root!=null){
            midOrder(root.leftChild);
            visited(root);
            midOrder(root.rightChild);
        }
    }
//    *           A
//     *     B          C
//     *  D     E            F
    //中序遍历的非递归实现
    public void noRecMidOrder(TreeNode root){
        if (root==null)return;
        Stack<TreeNode> stack =new Stack<>();
        TreeNode temp = root;
        while (temp !=null || !stack.isEmpty()){
            while (temp!=null){
                stack.push(temp);
                temp = temp.leftChild;
            }
            temp = stack.pop();
            visited(temp);
            temp = temp.rightChild;
        }

    }


    //后序遍历
    public void postOrder(TreeNode root){
        if (root!=null){
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            visited(root);
        }
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
    public void nonRecPostOrder(TreeNode root){
        if (root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> resultStack = new Stack<>();
        TreeNode temp = root;
        while (temp != null || !stack.isEmpty()){
            if (temp != null){
                stack.push(temp);
                resultStack.push(temp);
                temp = temp.rightChild;
            }else {
                temp = stack.pop();
                temp = temp.leftChild;
            }
        }
        while (!resultStack.isEmpty()){
            visited(resultStack.pop());
        }
    }

    public int level(TreeNode root) {
        if (root == null)
            return 0;
        return level(root.leftChild) + 1 > level(root.rightChild) + 1 ? level(root.leftChild) + 1: level(root.rightChild) + 1;
    }


    public void layerOrder(TreeNode root){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode temp = root;
        queue.add(root);
        while (!queue.isEmpty()){
            temp = queue.peek();
            visited(temp);
            if (temp.leftChild!=null){
                queue.add(temp.leftChild);
            }
            if (temp.rightChild !=null){
                queue.add(temp.rightChild);
            }
            queue.poll();
        }
    }


        public static void main(String[] args) {
        BinaryTree bT=new BinaryTree();
        bT.createBinaryTree(bT.root);
//        bT.preOrder(bT.root);
//        System.out.println("========");
//        bT.nonRecPreOrder(bT.root);

//        bT.midOrder(bT.root);
//        System.out.println("========");
//        bT.noRecMidOrder(bT.root);
//
//        bT.postOrder(bT.root);
//        System.out.println("========");
//        bT.nonRecPostOrder(bT.root);
        bT.layerOrder(bT.root);
//        System.out.println(bT.level(bT.root));
    }
}
