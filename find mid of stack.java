import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }

        int mid=n/2;
        for(int i=0;i<mid;i++)
        {
            st.pop();
        }
        System.out.println(st.peek());
    }
}