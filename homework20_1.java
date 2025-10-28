import java.util.Scanner;
/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this
program, you need to
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
public class homework20_1
{
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scan.nextInt();


            ListNode newNode = new ListNode(number);
            if (llist.head == null)
            {
                llist.head = newNode;
            }
            else
            {
                ListNode current = llist.head;
                while (current.next != null)
                {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        System.out.println("List before deleteDuplicates: " + llist);
        deleteDuplicates(llist);
        System.out.println("List after deleteDuplicates: " + llist);
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(5);
//        llist.head = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        //node5.next = null;
//        System.out.println(llist);

        scan.close();
    }
    public static void deleteDuplicates(LinkedList llist)
    {
        ListNode current = llist.head;
        while (current.next != null)
        {
            if (current.value == current.next.value)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
    }
}

class ListNode
{
    int value;
    ListNode next;
    ListNode(int v)
    {
        value = v;
    }
}

class LinkedList
{
    ListNode head;
    public String toString()
    {
        String nodeData = "";
        ListNode ref = head;
        while(ref != null)
        {
            nodeData += ref.value + "-->";
            ref = ref.next;
        }
        return "head-->"+nodeData+"null";
    }

}
}
