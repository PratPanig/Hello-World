class Node
{
Node next;
int info; 
Node(int data)
{
info = data;
next = null;
}
Node createList()
{
Node start = new Node(1);
Node mid1 = new Node(2);
Node mid2 = new Node(3);
Node mid3 = new Node(4);
Node end = new Node(5);	
start.next=mid1;
mid1.next=mid2;
mid2.next=mid3;
mid3.next=end;
end.next=start;
return start;	
}

void CheckForCircularLL(Node CircularLL)
{
Node slowPtr = CircularLL;
Node fastPtr = CircularLL;
while (slowPtr != null && fastPtr.next!=null)
{
slowPtr = slowPtr.next;
fastPtr = fastPtr.next.next;
if(slowPtr.info == fastPtr.info)
{
System.out.println("Link List is Circular");
System.exit(0);
} 
}
System.out.println("Link List is NOT Circular");
}
}

public class CircularLinkedList 
{
public static void main(String[] args) 
{
Node ap = new Node(0);
System.out.println("Create Circular Linked List");
Node circularList = ap.createList();
System.out.println("Check whether Linked List is Circular : ");
System.out.println();
ap.CheckForCircularLL(circularList);

}
}