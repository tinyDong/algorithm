package jianzhioffer;

public class treeNextNode8 {
//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。

    private static class TreeNode{
        private Integer data =null;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;
        private TreeNode parent = null;

        public TreeNode(){}

        public TreeNode(Integer data){
            this.data=data;
        }
    }


    public static void main(String[] args) {

        TreeNode header = createBinaryTree();

        TreeNode nextNode = findMidOrderNextNode(header.leftChild.rightChild.rightChild);

        System.out.println(nextNode.data);

    }
    public static TreeNode findMidOrderNextNode(TreeNode node){
        if (node==null){
            return null;
        }

        if (node.rightChild!=null){
            TreeNode next = node.rightChild;
            while (next.leftChild!=null){
                next=next.leftChild;
            }
            return next;
        }else {
            while (node.parent!=null){
                TreeNode next = node.parent;
                if (next.leftChild == node){
                    return next;
                }
                node = node.parent;
            }
        }

        return null;
    }



    public static TreeNode createBinaryTree(){

        TreeNode root = new TreeNode(1);
        TreeNode nodeB = new TreeNode(2);
        TreeNode nodeC = new TreeNode(3);
        TreeNode nodeD = new TreeNode(4);
        TreeNode nodeE = new TreeNode(5);
        TreeNode nodeF = new TreeNode(6);
        TreeNode nodeG = new TreeNode(7);
        TreeNode nodeH = new TreeNode(8);

        root.leftChild=nodeB;
        root.rightChild=nodeC;
        root.leftChild.leftChild=nodeD;
        root.leftChild.rightChild=nodeE;
        root.rightChild.rightChild=nodeF;
        nodeE.leftChild = nodeG;
        nodeE.rightChild = nodeH;

        nodeB.parent = root;
        nodeC.parent = root;
        nodeD.parent = nodeB;
        nodeE.parent = nodeB;
        nodeF.parent = nodeC;
        nodeH.parent = nodeE;
        nodeG.parent = nodeE;
        return root;
    }
}
