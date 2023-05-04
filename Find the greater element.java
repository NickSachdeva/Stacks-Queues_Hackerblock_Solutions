import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        NGE(arr);
    }
    public static void NGE(long[] arr)
    {
        Stack<Integer> st = new Stack<>();
        long[] ans = new long[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                ans[st.pop()]=arr[i];
            }
        }
        while(!st.isEmpty())
            {
                ans[st.pop()]=-1;
            }
       
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
