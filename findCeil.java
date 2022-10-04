package BST;

public class findCeil {
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
        int ans = Ceil(tree.root , 30);

        System.out.println(ans);

    }
    public static int Ceil(TreeNode root ,  int key)
    {
        int ceil = -1;
        while(root != null)
        {
            if(root.data == key)
            {
                ceil = root.data;
                return ceil;
            } else if (root.data < key) {
                root = root.right;
            }
            else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }
}
