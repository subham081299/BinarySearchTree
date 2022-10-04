package BST;

public class LCA {
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

        System.out.println(lca(tree.root , 70, 90).data);

    }
    public static TreeNode lca(TreeNode root , int p , int q)
    {
        if(root == null)return null;
        if(root.data >= p && root.data >= q)
        {
            lca(root.left , p , q);
        }else{
            lca(root.right , p , q);
        }
        return root;
    }
}
