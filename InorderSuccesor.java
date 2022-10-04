package BST;

public class InorderSuccesor {
    /*
     THW SIMPLEST APPROACH  IS TO STORE THE SORTED ARRAY IN THE LIST GIVE THE NEXT VALUE OF THE KEY
     TC WILL BE O(N)
     But U can do it in O(Height) which is most optimized
     */
    public static void main(String[] args) {
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
        System.out.println(successor(tree.root , 30));

    }
    public static int successor(TreeNode root, int key)
    {
        if(root == null)return -1;
        int successor = 0;
        while(root != null)
        {
            if(root.data <= key)
            {
                root = root.right;
            }else{
                successor = root.data;
                root = root.left;
            }
        }
        return successor;
    }
}
