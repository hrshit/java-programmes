import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class firstlastIndex {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//        int[] arr=new int[N];            // for the dynamic initialization
//        for (int i = 0; i < N; i++) {
//            arr[i]= sc.nextInt();
//        }
        int[] a= {1,5,10,15,22,33,33,33,33,33,40,42,55,66,77,83};
        int target=33;
        System.out.println(Arrays.toString(findIndex(a,target)));
    }
    static int[] findIndex(int[] a, int target)
    {
        int[] ra= new int[]{-1,-1};
        int start=searching(a,target,true);
        int end= searching(a,target,false);
        ra[0]=start;
        ra[1]=end;
        return ra;
    }
    static int searching(int[] a,int target, boolean v)
    {
       int uttar=-1;
       int start=0;
       int end=a.length-1;

       while (start<=end)
       {
           int mid=start+(end-start)/2;
           if (target >a[mid])
               start=mid+1;
           else if (target<a[mid])
               end=mid-1;
           else
           {
             uttar=mid;
             if (v)
                 end=mid-1;
             else
               start=mid+1;
           }
       }
     return uttar;
    }
}
