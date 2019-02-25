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
        LinkedList<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (cur !=null){
                res.append(cur.val);
                queue.add(cur.left);
                queue.add(cur.right);
            }else {
                res.append("null");
            }
            res.append("#");
        }
        return res.toString();
    }
    //1, 2, 3, null, null, 4, 5
    static TreeNode Deserialize(String str) {
        if (str==null){
            return null;
        }
        String[] strings = str.split("#");
        if (strings.length==0){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(strings[0]));
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()){
            TreeNode temp = queue.remove();

            if (index ==str.length()){
                break;
            }
            String cur = strings[index++];
            cur = cur.trim();
            if (!"null".equals(cur)){
                TreeNode node = new TreeNode(Integer.parseInt(cur));
                temp.left = node;
                queue.add(node);
            }
            if (index ==str.length()){
                break;
            }
            cur = strings[index++];
            cur = cur.trim();
            if (!"null".equals(cur)){
                TreeNode node = new TreeNode(Integer.parseInt(cur));
                temp.right = node;
                queue.add(node);
            }
        }
        return root;
    }
}
