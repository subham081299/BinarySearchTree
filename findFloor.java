package BST;

public class findFloor {
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
        int ans = Floor(tree.root , 25);

        System.out.println(ans);

    }
    public static int Floor(TreeNode root ,  int key)
    {
        int floor = -1;
        while(root != null)
        {
            if(root.data == key)
            {
                floor = root.data;
                return floor;
            } else if (root.data < key) {
                floor = root.data;
                root = root.right;
            }
            else {

                root = root.left;
            }
        }
        return floor;
    }
}
