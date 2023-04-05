// Rest of the code is already given as Driver Code

class Solution
{
    Node lca(Node root, int n1,int n2)
	{
		 if(root == null)
	        return null;
	        
	    if(root.data == n1 || root.data == n2)
	        return root;
	       
	    Node lca1 = lca(root.left,n1,n2);
	    Node lca2 = lca(root.right,n1,n2);
	    
	    if(lca1 != null && lca2 != null)
	        return root;
	       
	    if(lca1 != null)
	        return lca1;
	    else
	        return lca2;
	}
}
