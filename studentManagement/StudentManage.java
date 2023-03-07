package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManage{


    ArrayList<Student> list=new ArrayList<>();


    //function for adding the student
    public void addStudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name -> ");
        String s=sc.nextLine();
        System.out.print("Enter your RollNumber --> ");
        int i=sc.nextInt();
        Student temp=new Student(s,i);
        list.add(temp);
    }

    //function for the getting the index
    public int getIndex(int rollNum)
    {
        for (int i = 0; i <list.size(); i++)
        {
            if(list.get(i).rollNo==(rollNum))
                return i;
        }
        return -1;
    }

    //function for searching
    public void searching(int rollNum)
    {
        int i=getIndex(rollNum);
        list.get(i).display();
    }
    public void averageGrade(int  rollNum)
    {
        int maxi=0;  //for couting the grade
        int i=getIndex(rollNum);
        System.out.println("The average garde of "+list.get(i).name +" is->  "+list.get(i).avgGrad());


    }
    public void averageGradeall()
    {
        float sum=0;  //for couting the grade

        for (int i = 0; i < list.size(); i++) {
              sum+=list.get(i).avgGrad();
        }

        float avg=sum/ list.size();
        System.out.println("The average garde of all students  - "+avg);


    }
    // function for removing the student from the student list
    public void removestudent(int rollNum)
    {
        for (int i = 0; i <list.size(); i++)
        {
            if(list.get(i).rollNo==rollNum)
                list.remove(i);
        }
    }


    //function for display the subject
    public void display()
    {
       int size=list.size();
        System.out.println("Name    Roll-Number ");
        for (int i = 0; i < size; i++) {
            list.get(i).display();
        }
    }




}
