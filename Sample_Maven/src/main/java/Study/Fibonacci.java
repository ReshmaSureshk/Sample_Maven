package Study;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5; int first  = 0; int second = 1;
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(first+"");
			int next=first+second;
			first=second;
			second=next;
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
