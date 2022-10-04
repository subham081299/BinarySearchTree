package BST;

public class DeleteNode {
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

        // print inorder traversal of the BST
        search(tree.root , 90);
        inorder(tree.root);

    }

    public static TreeNode search(TreeNode root , int key)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == key)
        {
            return delete(root);
        }
        TreeNode curr = root;
        while(curr != null)
        {
            if(curr.data > key)
            {
                if(curr.left != null && curr.left.data == key)
                {
                    curr.left = delete(curr.left);
                    break;
                }
                else {
                    curr = curr.left;
                }
            }
            else {
                if(curr.right != null && curr.right.data == key)
                {
                    curr.right = delete(curr.right);
                    break;
                }
                else {
                    curr = curr.right;
                }
            }
        }
        return root;
    }

    public static TreeNode delete(TreeNode root)
    {
        if(root.left == null)return root.right;
        if (root.right == null)return root.left;

        TreeNode right = root.right;
        TreeNode lastRightOfLeftTree = findLast(root.left);
        lastRightOfLeftTree.right = right;
        return root.left;
    }

    public static TreeNode findLast(TreeNode root)
    {
        if(root.right == null)return root;
        return findLast(root.right);
    }

    public static void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
