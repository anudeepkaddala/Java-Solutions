class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    public String toString(){
        return data+" ";
    }
}
class LinkedList{
    Node head;
    void display(Node head){
        if(head==null){
            return;
        }
        System.out.println(head);
        display(head.next);
    }
    void insert(int data){
        head=insert(head,data);
    }
    Node insert(Node head, int data){
        if(head==null){
            head=new Node(data);
            return head;
        }
        head.next=insert(head.next,data);
        return head;
    }
    void displayLast(Node head){
        if(head.next==null){
            System.out.println(head.data);
            return;
        }
        displayLast(head.next);
    }
    int noOfNodes(Node head){
        int count=0;
        if(head==null){
            return 0;
        }
        return 1+noOfNodes(head.next);

    }
    boolean searchofNode(Node head,int x){
        if(head==null){
            return false;
        }
        if(head.data==x){
            return true;
        }
        return searchofNode(head.next, x);
    }
    int minofLL(Node head){
        if(head.next==null){
            return head.data;
        }
        return Math.min(head.data,minofLL(head.next));
    }
    void printReverse(Node head){
        if(head==null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    void reverseIterate(){ //didnt understand this well. Use the reverseRecursive function since its easy to understand
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;

            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public Node removeNthfromEnd(Node head,int n){
        if(head.next==null){
            return null;
        }

        //size
        int size=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

        int indexToSearch=size-n;
        int i=1;
        Node prev=head;
        while(i<indexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public Node reverseLL(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node findMiddle(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public boolean isPalindromeLL(Node head){
        if(head==null ||head.next==null){
            return true;
        }
        Node middle=findMiddle(head);
        Node secondhalfStart=reverseLL(middle.next);

        Node firsthalfStart=head;

        while(secondhalfStart!=null){
            if(firsthalfStart.data != secondhalfStart.data){
                return false;
            }
            firsthalfStart=firsthalfStart.next;
            secondhalfStart=secondhalfStart.next;
        }
        return true;
    }

    public boolean hasCycle(Node head){
        if(head==null){
            return false;
        }
        Node hare=head;
        Node turtle=head;

        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
    }


    boolean isAscending(Node head){
        if(head==null||head.next==null){
            return true;
        }
        if(head.data>head.next.data){
            return false;
        }
        return isAscending(head.next);
    }
    void addtoBeg(int data){
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
    }
    void delfromBeg(){
        if(head==null || head.next==null){
            System.out.println("nothing to delete");
        }
        head=head.next;
        display(head);
    }
    int sumofElements(Node head){
        if(head==null){
            return 0;
        }
        return head.data+sumofElements(head.next);
        
    }
    void deleteEnd(){
        head=deleteEnd(head);
    }
    Node deleteEnd(Node head){
        if(head==null||head.next==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        head.next=deleteEnd(head.next);
        return head;
    }
    void delete(int data){
        head=delete(head,data);
    }
    Node delete(Node head,int data){
        if(head==null){
            return null;
        }
        if(data==head.data){
            head=head.next;
            return head;
        }
        head.next=delete(head.next,data);
        return head;


    }
    /*void insert(int data){
        Node nn=new Node();
        //0 nodes
        if(head==null){
            head=nn;
        }
        //single node
        else if(head.next==null){
            head.next=nn;
        }
        //multiple nodes
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }*/

}
class TestLinkedList{
    public static void main(String args[]){
        
        LinkedList l1=new LinkedList(); //head=null
        
        l1.insert(1);
        l1.insert(2);
        l1.insert(2);
        l1.insert(1);
        //l1.removeNthfromEnd(l1.head, 2);
        //l1.head=l1.reverseRecursive(l1.head);
        System.out.println(l1.isPalindromeLL(l1.head));
        //l1.display(l1.head);
        //l1.displayLast(l1.head);
        //System.out.println("No.of nodes are"+ l1.noOfNodes(l1.head));
        //System.out.println(l1.searchofNode(l1.head,10));
        //System.out.println(l1.minofLL(l1.head));
        //l1.printReverse(l1.head);
        //System.out.println(l1.isAscending(l1.head)); 
        //l1.addtoBeg(34);
        //l1.display(l1.head);
        //l1.delfromBeg();
        //System.out.println(l1.sumofElements(l1.head));
        //l1.deleteEnd();
        //l1.display(l1.head);
        //l1.delete(42);
       // l1.display(l1.head);

    }
}