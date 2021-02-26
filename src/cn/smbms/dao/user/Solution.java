package cn.smbms.dao.user;


import com.sun.scenario.animation.shared.ClipEnvelope;


import java.util.Map;

class Solution {
    public static void main(String[] args) {

        TreeNode a= new TreeNode(0);
        TreeNode b= new TreeNode(1);
        TreeNode c= new TreeNode(0);
        a.left=b; b.right=c;
        System.out.println(pruneTree(a));
    }
    public static TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        if(panduan(root.left)==true) root.left=null;
        else  root.left=pruneTree(root.left);
        if(panduan(root.right)==true) root.right=null;
      else  pruneTree(root.right);
        return  root;
    }

    private static boolean panduan(TreeNode root) {
        if(root.val==1) return  false;
        if(root==null) return  true;
        //此时 root!=null root.val==0;
        if(root.left==null&&root.right==null)return  true;
        return  panduan(root.left)&&panduan(root.right);

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

