import java.util.*;
public class Qustion09 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        System.out.print("Size --> ");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the target ");
        int target= sc.nextInt();
        System.out.println();
        System.out.println("The answer :-");
        System.out.println( combinationSum(a,target));

    }




    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList());
        return ans;
    }
    public static void findCombinations(int index,int[]candidates,int target,List<List<Integer>> ans,List<Integer> ds){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index]<=target){  //PICKED AN ELEMENT
            ds.add(candidates[index]);
            findCombinations(index,candidates,target-candidates[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(index+1,candidates,target,ans,ds);     //NOT PICKED AN ELEMENT
    }
}
