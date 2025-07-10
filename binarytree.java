import java.util.Scanner;

class BinaryTree
{
    BinaryTree()
    {

    }
    private static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int value)
        {
            this.data=value;
        }
    }
    private Node root;

    public void insert(Scanner scanner)
    {
        System.out.println("Enter the root node");
        int value=scanner.nextInt();
        root=new Node(value);
        insert(scanner,root);
    }
    private void insert(Scanner scanner,Node node)
    {
        System.out.println("Do u want to enter to left of:"+node.data);
        boolean left=scanner.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value of left node:");
            int value=scanner.nextInt();
            node.left=new Node(value);   
            insert(scanner, node.left);
        }
        System.out.println("Do u want to enter to right of:"+node.data);
        boolean right=scanner.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value of right node");
            int value=scanner.nextInt();
            node.right=new Node(value);
            insert(scanner,node.right);
        }
    }
    public void display()
    {
            display(root," ");
    }
    private void display(Node node,String indent)
    {
        if(node == null)
        {
            return;
        }   
        System.out.println(indent+node.data);
        display(node.right,indent+"\n\\");
        display(node.left,indent+"/");
    } 
      public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.insert(sc);
        tree.display();
    }
}