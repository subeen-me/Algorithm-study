package Algorithm.Recursive;

class Node1 {
    int data;
    Node1 lt, rt;
    public Node1(int val) {
        data=val;
        lt=rt=null;
    }
}
public class 밑단노드 {
    Node1 root;
    public int DFS(int L, Node1 root){
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String args[]) {
        밑단노드 tree=new 밑단노드();
        tree.root=new Node1(1);
        tree.root.lt=new Node1(2);
        tree.root.rt=new Node1(3);
        tree.root.lt.lt=new Node1(4);
        tree.root.lt.rt=new Node1(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
