package studentManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    String name;
    int rollNo;
    ArrayList<Subject> subjects=new ArrayList<>();


    Student(String name, int rollno)
    {
        this.name=name;
        this.rollNo=rollno;
        for (int i = 0; i < 4; i++) {
            addSubject(i);
        }
    }

    //for display student information
    public void display()
    {
        System.out.println();
        System.out.print(this.name+" ");
        System.out.println(this.rollNo+" ");
        this.displaySubject();   //calling this function for displaying the subject
        System.out.println("average  grade is  "+this.avgGrad());

    }

    public  void addSubject(int i)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your "+(i+1)+ " Subject  --> ");
        String s=sc.nextLine();
        System.out.print("grade in this subject  --> ");
        int c=sc.nextInt();
        Subject s1 = new Subject(s, c);
        subjects.add(s1);
    }

    //for display subject info
    public  void  displaySubject()
    {
        System.out.println("   Subject Marks");
        int size=subjects.size();
        for (int i = 0; i < size; i++) {
             subjects.get(i).display();
        }
    }


    //for mapping the average of the student
    public float avgGrad()
    {
        int sum=0;
        float avg=0;
        for (int i = 0; i < subjects.size(); i++) {
            sum+=subjects.get(i).marks;
        }
        avg=sum/(subjects.size());
        return avg;

    }



}
