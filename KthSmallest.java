package BST;

import java.util.*;

public class KthSmallest {
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

        System.out.println(kthsmall(tree.root , 3));

    }
    public static int kthsmall(TreeNode root , int key)
    {
        if(root == null)return 0;
        Stack<TreeNode> stk = new Stack<>();

        while (true)
        {
            while (root != null)
            {
                stk.push(root );
                root  = root .left;
            }
            root = stk.pop();
            if(--key == 0)
            {
                return root.data;
            }
            root  = root .right;
        }

    }
}
