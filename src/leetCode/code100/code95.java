package leetCode.code100;

//给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
//输入: 3
//输出:
//[
//[1,null,3,2],
//[3,2,null,1],
//[3,1,null,null,2],
//[2,1,3],
//[1,null,2,null,3]
//]
public class code95 {

    public static void main(String[] args) {
//        List<TreeNode> res = generateTrees(3);
//        System.out.println(res.toString());
    }

//    public static List<TreeNode> generateTrees(int n) {
//        List<TreeNode> res = new ArrayList<TreeNode>();
//        if(n<1){
//            return res;
//        }
//
//        return helper(1,n);
//    }
//
//    private static List<TreeNode> helper(int left, int right){
//        List<TreeNode> res = new ArrayList<TreeNode>();
//        if(left > right){
//            res.add(null);
//            return res;
//        }
//
//        for(int i = left; i<=right; i++){
//            List<TreeNode> leftRes = helper(left,i-1);
//            List<TreeNode> rightRes = helper(i+1, right);
//            //从leftRes中挨个取结果，配合从rightRes中挨个取结果后分别放在以i为root的左右子树上
//            for(int m = 0; m<leftRes.size(); m++){
//                for(int n = 0; n<rightRes.size(); n++){
//                    TreeNode root = new TreeNode(i);
//                    root.left = leftRes.get(m);
//                    root.right = rightRes.get(n);
//                    res.add(root);
//                }
//            }
//        }
//        return res;
//    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
