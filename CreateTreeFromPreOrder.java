package BST;
import java.util.*;
public class CreateTreeFromPreOrder {

    /* 1st Approach Similar to that in BT
        TC - O(N log N) + O(N)

    static ArrayList<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        int[] pre = {8 , 5 , 1 , 7 , 10 , 12};
        //1st approach :
        int in[] = {1,5,7,8,10,12};
        Arrays.sort(in);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<in.length ; i++)
        {
            map.put(in[i],i);
        }
        buildTree(map,pre,0,pre.length-1);
        System.out.println(ans);
    }
    static int j = 0;
    public static TreeNode buildTree(HashMap<Integer,Integer> map,int[] pre , int start , int end)
    {
        if(start>end)return null;
        TreeNode root = new TreeNode(pre[j]);
        ans.add(root.data);
        int pos = map.get(pre[j++]);
        root.left = buildTree(map,pre,start , pos-1);
        root.right = buildTree(map , pre , pos+1, end);
        return root;
    }

     */
    //Bettr one
    public static void main(String[] args) {
        int[] pre = {8 , 5 , 1 , 7 , 10 , 12};
        System.out.println(create(pre).data);

    }

    public static TreeNode create(int[] pre)
    {
        int[] i = new int[1];
        return createFromPre(pre,i ,Integer.MAX_VALUE);
    }
    public static TreeNode createFromPre(int[] pre,int[] i,int boundary)
    {
        if(i[0] == pre.length || pre[i[0]] > boundary )return null;
        TreeNode root = new TreeNode(pre[i[0]++]);
        root.left = createFromPre(pre , i , root.data);
        root.right = createFromPre(pre , i , boundary);
        return root;
    }

}
