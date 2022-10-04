package BST;

public class isValidBST {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);
        tree.insert(100);

        System.out.println(isValid(tree.root,Integer.MIN_VALUE , Integer.MAX_VALUE));

    }
    public static boolean isValid(TreeNode root , int min , int max)
    {
        if(root == null)return true;
        return ((root.data>=min && root.data<=max) && isValid(root.left , min , root.data) && isValid(root.right , root.data, max));
    }
}
