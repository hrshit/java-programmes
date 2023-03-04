package studentManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManage s1=new StudentManage();
        Scanner sc=new Scanner(System.in);
        int n;

        do {
            System.out.println();
            System.out.println("--------  WELCOME IN SCHOOL MANAGEMENT LIST---------");
            System.out.println();
            System.out.println();
            System.out.println("1.  Adding the student");
            System.out.println("2.   Display students infromation");
            System.out.println("3.   removing the student i");
            System.out.println("4.  avg marks of student ");
            System.out.println("5.  seraching of students");
            System.out.println("6.  Exit");
             n =sc.nextInt();
             switch (n)
            {
                case 1:
                    s1.addStudent();
                    break;
                case 2:
                    s1.display();
                    break;
                case 3:
                    System.out.print("Roll Number  of the student");
                    int rollNum=sc.nextInt();
                    s1.removestudent(rollNum);
                    break;
                case 4:
                    System.out.print("Roll Number  of student");
                    int rollNum2=sc.nextInt();
                    s1.averageGrade(rollNum2);
                    break;
                case 5:
                    System.out.print("Roll Number of student");
                    int rollNum3=sc.nextInt();
                    s1.searching(rollNum3);
                    break;
                case 6:
                    System.out.println("See you soon...");
                    break;
            }

        }

        while (n != 6);

    }
}
