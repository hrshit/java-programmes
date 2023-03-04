import java.util.Scanner;

public class permutaion {
    public static void main(String... args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            permute(input.toCharArray(), 0, input.length()-1);
        }
        public static void permute(char[] data, int start, int end) {
            if (start == end)
            {
            System.out.println(" "+String.valueOf(data));
            }
            else
        {
            for (int i = start; i <= end; i++)
        {
            swap(data, start, i);
            permute(data, start+1, end);
            swap(data, start, i);
              }
           }
        }
        public static void swap(char[] data, int i, int j)
        {            char temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
        }
    }

