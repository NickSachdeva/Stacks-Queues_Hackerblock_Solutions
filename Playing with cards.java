import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> A = new Stack<>();
		Stack<Integer> B = new Stack<>();
		for (int i = 0; i < n; i++)
		{
			A.push(sc.nextInt());
		}

		boolean[] prime = new boolean[100000];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i < prime.length; i++)
		{
			if (prime[i] == false)
			{
				for (int j = 2; j * i < prime.length; j++)
				{
					prime[i * j] = true;
				}
			}
		}
		int[] prime_nos = new int[prime.length];
		int j = 0;
		for (int i = 0; i < prime.length; i++)
		{
			if (prime[i] == false)
			{
				prime_nos[j] = i;
				j++;
			}
		}
		
		for (int i = 0; i < q; i++)
		{
			Stack<Integer> temp = new Stack<>();
			while(!A.isEmpty())
			{
				int num = A.pop();
				if (num % prime_nos[i] == 0)
				{
					B.push(num);
				} else
				{
					temp.push(num);
				}
			}
			A = temp;
            while (!B.isEmpty())
		    {
			    System.out.println(B.pop());
		    }
		}
		
		while (!A.isEmpty())
		{
			System.out.println(A.pop());
		}
	}

}
