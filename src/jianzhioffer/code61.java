package jianzhioffer;

import java.util.LinkedList;

public class code61 {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("1,2,3,null,null,4,5");
        System.out.println(Serialize(root));
        String str = Serialize(root);

        TreeNode cur =  Deserialize(str);
        System.out.println(cur);

    }

    static String Serialize(TreeNode root) {
        if (root==null){
            return null;
        }

        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp =queue.poll();
            if (temp!=null){
                sb.append(temp.val);
                queue.add(temp.left);
                queue.add(temp.right);
            }else {
                sb.append("null");
            }
            sb.append("#");
        }
        return sb.toString();
    }
    //1, 2, 3, null, null, 4, 5
    static TreeNode Deserialize(String str) {
        if (str ==null){
            return null;
        }
        String[] strings = str.split("#");

        LinkedList<TreeNode> queue = new LinkedList<>();
        int index = 1;
        TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
        queue.add(root);
        while (!queue.isEmpty()){

            TreeNode cur = queue.poll();
            if (index==strings.length){
                break;
            }
            String temp = strings[index++];
            if (!temp.equals("null")){
                TreeNode left = new TreeNode(Integer.parseInt(temp));
                cur.left = left;
                queue.add(left);
            }
            if (index==strings.length){
                break;
            }
            temp = strings[index++];
            if (!temp.equals("null")){
                TreeNode right = new TreeNode(Integer.parseInt(temp));
                cur.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
