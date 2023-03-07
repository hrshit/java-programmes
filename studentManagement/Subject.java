package studentManagement;

public class Subject {
    public  String subName; // subName --> Name of the subject
    public int marks;   //sg -->grade of subject

    public Subject(String s,int marks)
    {
        this.subName=s;
        this.marks=marks;
    }

   public void  setSubName()
   {
       System.out.println(this.subName);
   }

   public void showmarks()
   {
       System.out.println(this.marks);
   }
   public int marks()
   {
       return this.marks;
   }

    public  void display()
    {
        System.out.print("    "+this.subName+" ");
        System.out.println("   "+this.marks+" ");
    }


}
