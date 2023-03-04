public class Q6 {

   public static class Circle
   {
       int radius;
       Circle()  //Method overloading
       {
           this.radius=-1;
       }
       Circle(int n)    //Method overloading
       {
           this.radius=n;
       }

       public void parameter()
       {
           double a=2*Math.PI*radius;
           System.out.println("The Parameter of the circle is -> "+a);
       }
       public void area()
       {
           double a=Math.PI*radius*radius;
           System.out.println("The Parameter of the circle is -> "+a);
       }

       public static class Cylinder extends Circle
       {
           int height;
           Cylinder()                         //Method overloading
           {
               super();
               this.height=-1;
           }
           Cylinder(int height , int radius)   //Method overloading
           {
               super(radius);
               this.height=height;
           }

           @Override
           public void parameter() {
              double a=Math.PI*radius*radius*height;
               System.out.println("Volume of the cylinder ->"+a);
           }

           @Override
           public void area() {
               double a=2*Math.PI*radius*(height+radius);
               System.out.println("Area of the Cylinder-> ");
           }
       }

   }
    public static void main(String[] args) {
       Circle c1=new Circle(3);
       c1.area();

    }
}