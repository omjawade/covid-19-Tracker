import java.io.*;
public class LinkedList{

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;

        }
    }
    public static LinkedList insert(LinkedList list,int data)
    {
        Node new_node =new Node(data);
        new_node.next= null;
        if(list.head ==null)
        {
            list.head=new_node;

        }
        else{
            Node last=list.head;
            while(last.next!=null)
            {
                last =last.next;
            }
            last.next=new_node;
        }
        return list;

    }
    public static void printlist(LinkedList list)
    {
        Node CurrNode = list.head;
        System.out.print("LinkedList: ");
        while(CurrNode != null){
            System.out.print(CurrNode.data+" ");
            CurrNode=CurrNode.next;
        }
        System.out.println();
    }

    public static LinkedList deleteAtPosition(LinkedList list,int index)
    {
        Node CurrNode=list.head, prev=null;

        if(index==0 && CurrNode != null ){
            list.head=CurrNode.next;
            System.out.println(index + "POsition element deleted");
            return list;
        }
        int counter =0; 
        while(CurrNode!=null) {
            if(counter==index){
            prev.next=CurrNode.next;
            System.out.println(index + "POsition element deleted");
break;
}
else{
prev=CurrNode;
            CurrNode=CurrNode.next;
    counter++;
}

        }
        if(CurrNode!=null)
        {
            prev.next= CurrNode.next;
            System.out.println(index + "POsition element deleted");
        }

        if(CurrNode==null)
        {
                System.out.println(index + "POsition element not found");
        }
        return list;
    }

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list=insert(list, 1);
        list=insert(list, 2);
        list=insert(list, 3);
        list=insert(list, 4);
        list=insert(list, 5);
        list=insert(list, 6);
        list=insert(list, 7);
        list=insert(list, 8);

        printlist(list);
        deleteAtPosition(list,0);
        printlist(list);
        deleteAtPosition(list,2);
        printlist(list);
        deleteAtPosition(list,10);
        printlist(list);
    }
}
