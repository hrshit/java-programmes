package AddTwoLinkList;
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }



    //Display Method
    public void display()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }



    // insertion method

    public void insertfirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size +=1;
    }

    //inserrting at the particular index

    public void insertatindex(int value, int index)
    {
        if(index==0)
        {
            insertfirst(value);
            return;
        }
        if (index==size)
        {
            insrtallast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index-1 ; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;

    }


    //for deleting last element

    public int deletelast()
    {
        if(size <=1)
        {
            return deletfirst();
        }
        Node secondLast =get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;

    }



    //for getting second last element

    public Node get(int index)
    {
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    //method at insert at the last

    public void insrtallast(int value)
    {
        if (tail==null)
        {
            insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    //deletefirst Element

    public int deletfirst()
    {
        int val=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;
    }

    public int deletatpositn(int index)
    {
        if (index==1)
        {
            return deletfirst();
        }
        if (index==size)
        {
            return deletelast();
        }
        Node prev=get(index-2);
        prev.next=prev.next.next;
        int val=prev.next.value;
        return val;
    }

    //kth node from the last
    public int Kth(int n)
    {
        Node temp=head;
        for (int i = 0; i < size-n; i++) {
            temp=temp.next;
        }
        return temp.value;
    }



    private class Node
    {
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private static int addhelper(Node one, int pv1, Node two, int pv2, LL res) {
        if (one == null && two == null) {
            return 0;
        }
        int sum = 0;
        if (pv1 > pv2) {
            int oc = addhelper(one.next, pv1 - 1, two, pv2, res); //pv1=place value of 1
            sum = one.value + oc;
        }
        else if (pv2 > pv1) {
            int oc = addhelper(one, pv1, two.next, pv2 - 1, res); //pv2=place value of 2
            sum = two.value + oc;
        }
        else {
            int oc = addhelper(one.next, pv1 - 1, two.next, pv2 - 1, res); //oc= old carry
            sum = one.value+ two.value  + oc;
        }

        int c = sum % 10;   //new carry
        int d = sum / 10;   //new digit of "res"
        res.insertfirst(c);
        return d;

    }
    public static LL addTwoLists(LL one, LL two) {
        LL res = new LL();
        int oc = addhelper(one.head, one.size, two.head, two.size, res);
        if (oc > 0) {
            res.insertfirst(oc);
        }
        return res;
    }

}
