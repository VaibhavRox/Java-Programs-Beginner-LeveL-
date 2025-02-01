import java.util.Scanner;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Single
{
    Node head;
    public Single()
    {
        head=new Node(0);//dummy node
    }
    public void insertFront(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head.next;
        head.next=newNode;
    }
    public void insertEnd(int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAny(int key, int data)
    {
        if(head.next==null)
        {
            System.out.println("No data in list, so adding in front by default");
            insertFront(data);
        }
        else
        {
            Node ptr=head.next;
            while(ptr.data!=key&&ptr!=null)
            {
                ptr=ptr.next;
            }
            if(ptr==null)
            {System.out.println("key not found");return;}
            if(ptr.next==null)
            {
                Node newNode=new Node(data);
                ptr.next=newNode;
                newNode.next=null;
            }
            else
            {
                Node temp=ptr.next;
                Node newNode=new Node(data);
                ptr.next=newNode;
                newNode.next=temp;
            }
        }
    }
    public void deletefront()
    {
        if(head.next==null)
        {
            System.out.println("No data to delete!");
        }
        else
        {
            Node ptr=head.next;
            if(ptr.next==null) //only one element
            {
                head.next=null;
                System.out.println("Deleted element "+ptr.data);
            }
            else
            {
                head.next=ptr.next;
                System.out.println("Deleted element "+ptr.data);
            }
        }
    }
    public void deletend()
    {
        if(head.next==null)
        {
            System.out.println("No data to delete!");
        }
        else
        {
            Node ptr=head.next;
            if(ptr.next==null) //only one element
            {
                head.next=null;
                System.out.println("Deleted element "+ptr.data);
            }
            else
            {
                Node temp=null;
                while(ptr.next!=null)
                {
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=null;
                System.out.println("Deleted element "+ptr.data);
            }
        }
    }
    public void display()
    {
        Node temp=head.next;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) 
    {
        Single list=new Single();
        Scanner sc=new Scanner(System.in);
        int ch,x;
        while(true)
        {
            System.out.println("1.insertfront 2.insertend 3. insertAny 4.deletefront 5.deleteend 6.deleteAny 7.display 8.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter data:");
                        x=sc.nextInt();
                        list.insertFront(x);
                        list.display();
                        break;
                case 2: System.out.println("Enter data:");
                        x=sc.nextInt();
                        list.insertEnd(x);
                        list.display();
                        break;
                case 3: System.out.println("Enter data after which you want to insert:");
                        int key=sc.nextInt();
                        System.out.println("Enter data to add:");
                        x=sc.nextInt();
                        list.insertAny(key,x);
                        list.display();
                        break;
                case 4: list.deletefront();
                        list.display();
                        break;
                case 5: list.deletend();
                        list.display();
                        break;
                case 6: break;
                case 7: System.out.println("The linked list is:");
                        list.display();
                        break;
                case 8: System.out.println("Thank you!");
                        sc.close();
                        System.exit(0);
                default: System.out.println("INVALID CHOICE!");
            }
        }
        
    }
}