import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Queue q = new Queue();
        for(int i=0;i<n;i++)
        {
            q.Enqueue(i);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(q.Dequeue()+" ");
        }

    }
        public static class Queue{
        Stack<Integer> st ;
        public Queue()
        {
            st=new Stack<>();
        }
        public void Enqueue(int item) throws Exception
        {
            Stack<Integer> hlp = new Stack<>();
            while(!st.isEmpty())
            {
                hlp.push(st.pop());
            }
            st.push(item);
            while(!hlp.isEmpty())
            {
                st.push(hlp.pop());
            }
        }
        public int Dequeue() throws Exception
        {
            return st.pop();
        }
        public int GetFront() throws Exception
        {
            return st.peek();
        }
        public int size() throws Exception
        {
            return st.size();
        }
        public boolean isEmpty() throws Exception
        {
            return st.isEmpty();
        }
    }
}

