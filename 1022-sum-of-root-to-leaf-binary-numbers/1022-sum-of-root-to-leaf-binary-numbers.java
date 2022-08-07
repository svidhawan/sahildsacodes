/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static List<String> al;
    public int sumRootToLeaf(TreeNode root) {
       al=new ArrayList<>();
        getSum(root,"");
        int sum=0;
        for(String s:al){
            int x=Integer.parseInt(s,2);
            sum+=x;
        }
        return sum;
    }
    static void getSum(TreeNode root,String psf){
       if(root==null) return;
       if(root.left==null && root.right==null){
           al.add(psf+root.val);
           return;
       }
       getSum(root.left,psf+root.val);
       getSum(root.right,psf+root.val); 
        
    }
}