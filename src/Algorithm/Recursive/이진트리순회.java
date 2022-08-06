package Algorithm.Recursive;


class Node{
    int data;
    Node1 lt, rt;
    public Node(int val) {
        data=val;
        lt=rt=null;
    }
}

public class 이진트리순회 {
    Node1 root;
    public void DFS(Node1 root){
        if(root==null)
            return;
        else{
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
        }
    }

    public static void main(String args[]) {
        이진트리순회 tree=new 이진트리순회();
        tree.root=new Node1(1);
        tree.root.lt=new Node1(2);
        tree.root.rt=new Node1(3);
        tree.root.lt.lt=new Node1(4);
        tree.root.lt.rt=new Node1(5);
        tree.root.rt.lt=new Node1(6);
        tree.root.rt.rt=new Node1(7);
        tree.DFS(tree.root);
    }
}
