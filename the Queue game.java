import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            check_operation(arr);
        }
    }
    public static void check_operation(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty() && arr[i]==0)
            {
                System.out.println("Invalid");
                return;
            }
            else if(arr[i]!=0)
            {
                st.push(i);
            }
            else{
                st.pop();
            }
        }
        System.out.println("Valid");
    }
}