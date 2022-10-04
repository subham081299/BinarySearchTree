package BST;

public class InsertNode {
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

        // print inorder traversal of the BST
        InsertNewNode(tree.root , 55);
        inorder(tree.root);

    }

    public static TreeNode InsertNewNode(TreeNode root ,  int val)
    {
        boolean f = true;
        if (root == null)
        {
            root = new TreeNode(val);
            return root;
        }
        TreeNode curr = root;
        while (f)
        {
            if(curr.data <= val)
            {
                if(curr.right != null)
                {
                    curr = curr.right ;
                }else{
                    curr.right = new TreeNode(val);
                    f = false;
                }
            }else {
                if(curr.left != null)
                {
                    curr = curr.left;
                }
                else {
                    curr.left = new TreeNode(val);
                    f = false;
                }
            }
        }
        return root;
    }

    public static  void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
