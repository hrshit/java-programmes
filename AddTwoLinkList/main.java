package AddTwoLinkList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            LL l1=new LL();
            LL l2=new LL();
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the size of first link list -> ");
            int n= sc.nextInt();
            System.out.println(" Enter the data in first LinkList");
            for (int i = 0; i < n; i++)
            {
                    l1.insrtallast(sc.nextInt());
            }
            System.out.print("Enter the size of second linklist -> ");
            int n2= sc.nextInt();
            System.out.println(" Enter the data in first LinkList");
            for (int i = 0; i < n2; i++)
            {
                    l2.insrtallast(sc.nextInt());
            }
            System.out.print("First Link List ");
            l1.display();
            System.out.print("Second Link List  ");
            l2.display();
            System.out.println();
            System.out.print("Sum of the L1 and L2  ");
            LL l3=LL.addTwoLists(l1,l2);
            l3.display();
    }

}
