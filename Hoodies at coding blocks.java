import java.util.*;

public class Main {

	protected int size;

	protected int front;
	protected int[] data;

	public Main() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Main(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void hoodies(int q) throws Exception{ 
	
	// Write your Code here
	Main q1 = new Main();
	Main q2 = new Main();
	Main q3 = new Main();
	Main q4 = new Main();
	Main main_queue = new Main();
	boolean isOne = false, isTwo = false, isThree = false, isFour = false;
	for(int i=0;i<q;i++)
	{
		char ch = scn.next().charAt(0);
		if(ch=='E')
		{
			int course = scn.nextInt();
			int roll = scn.nextInt();
			if(course==1){
				q1.enqueue(roll);
				if(!isOne)
				{
					main_queue.enqueue(1);
					isOne=true;
				}
			}
			else if(course==2){
				q2.enqueue(roll);
				if(!isTwo)
				{
					main_queue.enqueue(2);
					isTwo=true;
				}
			}
			else if(course==3){
				q3.enqueue(roll);
				if(!isThree)
				{
					main_queue.enqueue(3);
					isThree=true;
				}
			}
			else {
				q4.enqueue(roll);
				if(!isFour)
				{
					main_queue.enqueue(4);
					isFour=true;
				}
			}
		}
		if(ch=='D')
		{
			int front=main_queue.getFront();
			if(front==1)
			{
				if(!q1.isEmpty())
				{
					System.out.println("1"+" "+q1.getFront());
					q1.dequeue();
				}
				if(q1.isEmpty())
				{
					main_queue.dequeue();
					isOne=false;
				}
			}
			else if(front==2)
			{
				if(!q2.isEmpty())
				{
					System.out.println("2"+" "+q2.getFront());
					q2.dequeue();
				}
				if(q2.isEmpty())
				{
					main_queue.dequeue();
					isTwo=false;
				}
			}
			else if(front==3)
			{
				if(!q3.isEmpty())
				{
					System.out.println("3"+" "+q3.getFront());
					q3.dequeue();
				}
				if(q3.isEmpty())
				{
					main_queue.dequeue();
					isThree=false;
				}
			}
			else 
			{
				if(!q4.isEmpty())
				{
					System.out.println("4"+" "+q4.getFront());
					q4.dequeue();
				}
				if(q4.isEmpty())
				{
					main_queue.dequeue();
					isFour=false;
				}
			}
		}
		
	}
  } 


	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        
        hoodies(n);
	}

}
